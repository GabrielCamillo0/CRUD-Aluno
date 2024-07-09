
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ControleAluno {

    private Connection conexao = null;
    private Statement st = null;
    java.sql.ResultSet rs;
    Aluno aluno = new Aluno();

    public void Conecta() throws Exception {

        try {
            String servername = "localhost:3306";
            String user = "root";
            String password = "12345678";
            String database = "bdaluno";
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);

            String url = "jdbc:mysql://" + servername + "/" + database + "?useTimeZone=true&serverTimezone=UTC";

            conexao = DriverManager.getConnection(url, user, password);
            st = conexao.createStatement();
            System.out.println("ok");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nao encontrado");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco!");
        }

    }

    public int cadastrar(int rgm, String nome, double n1, double n2) throws SQLException {
        aluno.setRgm(rgm);
        aluno.setNome(nome);
        aluno.setNota1(n1);
        aluno.setNota2(n2);

        String insert = "insert into alunos(numrgm, nome_aluno, nota1, nota2) values (" + aluno.getRgm() + ",'" + aluno.getNome() + "'," + aluno.getNota1() + "," + aluno.getNota2() + ");";

        int sql = conexao.prepareStatement(insert).executeUpdate();

        return sql;
    }

    public void Listar() {
        PreparedStatement sql;

        try {
            sql = conexao.prepareStatement("Select * from alunos");
            rs = sql.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("numrgm") + " " + rs.getString("nome_aluno") + " "
                        + rs.getString("nota1") + " " + rs.getString("nota2"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro sql");
        }
    }
    public String Consultar(int rgm){
       String dados = "";
       PreparedStatement sql;
       try{
        sql=conexao.prepareStatement("select * from alunos where numrgm = ?");   
        sql.setInt(1, rgm);
        rs = sql.executeQuery();
       if(rs.next()){
        dados = (rs.getString("numrgm")+ "; " + rs.getString("nome_aluno")+";"+ 
                rs.getString("nota1")+";"+rs.getString("nota2"));
        }
       else{
        JOptionPane.showMessageDialog(null, "Numero de rgm não encontrado");     
       }
       }
       catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro sql");   
        
       }
        return dados;
    }
    public void Excluir(int rgm){
        PreparedStatement sql;
        try{
        sql=conexao.prepareStatement("delete from alunos where numrgm= ?");
        sql.setInt(1, rgm); 
        int verifica=sql.executeUpdate();
        if (verifica==1){
          JOptionPane.showMessageDialog(null, "Registro excluido");   
        }
        else{
            JOptionPane.showMessageDialog(null, "Numero de rgm não encontrado"); 
        }
    }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Erro no sql");     
        }
}
    public void Alterar(int rgm, String nm, double n1, double n2){
    PreparedStatement sql;
    try{
      sql=conexao.prepareStatement("Update alunos set nome_aluno='"+nm+"',nota1='"+n1+
              "',nota2='"+n2+"'where numrgm="+rgm);
      int verifica= sql.executeUpdate();
      if (verifica==1){
          JOptionPane.showMessageDialog(null, "Registro alterado"); 
      }
      else{
          JOptionPane.showMessageDialog(null, "Numero de rgm não encontrado"); 
      }
    }
    catch(Exception e){
       JOptionPane.showMessageDialog(null, "Erro no sql"); 
    }
}
    public double CalcMedia(double n1, double n2){
        return(n1+n2)/2;
    }
}
