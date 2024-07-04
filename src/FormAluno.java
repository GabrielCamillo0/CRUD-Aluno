
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FormAluno extends javax.swing.JFrame {

    ControleAluno controle = new ControleAluno();
    
    
    public FormAluno() throws Exception {
        controle.Conecta();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textrgm = new javax.swing.JTextField();
        textaluno = new javax.swing.JTextField();
        textnota1 = new javax.swing.JTextField();
        textnota2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        butexcluir = new javax.swing.JToggleButton();
        butconsultar = new javax.swing.JToggleButton();
        Bntalterar = new javax.swing.JToggleButton();
        butcadastrar = new javax.swing.JToggleButton();
        butalterar = new javax.swing.JToggleButton();
        butmedia = new javax.swing.JToggleButton();
        textmedia = new javax.swing.JTextField();
        butsair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RGM");

        jLabel2.setText("NOME");

        jLabel3.setText("N1");

        jLabel4.setText("N2");

        textaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textalunoActionPerformed(evt);
            }
        });

        textnota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnota2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Aluno");

        butexcluir.setText("EXCLUIR");
        butexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butexcluirActionPerformed(evt);
            }
        });

        butconsultar.setText("CONSULTAR");
        butconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butconsultarActionPerformed(evt);
            }
        });

        Bntalterar.setText("LISTAR");
        Bntalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntalterarActionPerformed(evt);
            }
        });

        butcadastrar.setText("CADASTRAR");
        butcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcadastrarActionPerformed(evt);
            }
        });

        butalterar.setText("ALTERAR");
        butalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butalterarActionPerformed(evt);
            }
        });

        butmedia.setText("MEDIA");
        butmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butmediaActionPerformed(evt);
            }
        });

        butsair.setText("SAIR");
        butsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butcadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butalterar)
                        .addGap(12, 12, 12)
                        .addComponent(Bntalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butexcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(292, 292, 292))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(29, 29, 29)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(textrgm, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                    .addComponent(textnota1))
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel2)))))
                                .addGap(18, 18, 18)
                                .addComponent(textaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butsair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textrgm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(textaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butcadastrar)
                    .addComponent(butconsultar)
                    .addComponent(butalterar)
                    .addComponent(Bntalterar)
                    .addComponent(butexcluir))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butmedia)
                    .addComponent(textmedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butsair)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butexcluirActionPerformed
       controle.Excluir(Integer.parseInt(this.textrgm.getText()));
    }//GEN-LAST:event_butexcluirActionPerformed

    private void butcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcadastrarActionPerformed
        try {
            int result = controle.cadastrar(Integer.parseInt(this.textrgm.getText()), this.textaluno.getText(), Double.parseDouble(this.textnota1.getText()), Double.parseDouble(this.textnota2.getText()));
        
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(FormAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butcadastrarActionPerformed

    private void butalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butalterarActionPerformed
        controle.Alterar(Integer.parseInt(this.textrgm.getText()),this.textaluno.getText(),
                Double.parseDouble(this.textnota1.getText()),Double.parseDouble(this.textnota2.getText()));
    }//GEN-LAST:event_butalterarActionPerformed

    private void textalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textalunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textalunoActionPerformed

    private void textnota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnota2ActionPerformed

    private void BntalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntalterarActionPerformed
       controle.Listar();
    }//GEN-LAST:event_BntalterarActionPerformed

    private void butconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butconsultarActionPerformed
       String info= controle.Consultar(Integer.parseInt(this.textrgm.getText()));
       if (!info.equals("")){
        String vetor [] = info.split(";");
        this.textaluno.setText(vetor[1]);
        this.textnota1.setText(vetor[2]);
        this.textnota2.setText(vetor[3]);
       }
       else{
           this.textrgm.setText("");
       }
                
      
    }//GEN-LAST:event_butconsultarActionPerformed

    private void butmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butmediaActionPerformed
       double n1=Double.parseDouble(this.textnota1.getText());
       double n2=Double.parseDouble(this.textnota2.getText());
        this.textmedia.setText(""+controle.CalcMedia(n1, n2));
    }//GEN-LAST:event_butmediaActionPerformed

    private void butsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_butsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormAluno().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FormAluno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bntalterar;
    private javax.swing.JToggleButton butalterar;
    private javax.swing.JToggleButton butcadastrar;
    private javax.swing.JToggleButton butconsultar;
    private javax.swing.JToggleButton butexcluir;
    private javax.swing.JToggleButton butmedia;
    private javax.swing.JToggleButton butsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textaluno;
    private javax.swing.JTextField textmedia;
    private javax.swing.JTextField textnota1;
    private javax.swing.JTextField textnota2;
    private javax.swing.JTextField textrgm;
    // End of variables declaration//GEN-END:variables
}
