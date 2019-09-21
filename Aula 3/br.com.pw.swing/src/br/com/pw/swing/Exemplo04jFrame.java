package br.com.pw.swing;
import javax.swing.JOptionPane;

/**
 *
 * @author 66264
 */
public class Exemplo04jFrame extends javax.swing.JFrame {

    public Exemplo04jFrame() {
        initComponents();
        limparCampos();
    }

    private void limparCampos() {
        jTextFieldNome.setText("");
        buttonGroupSimNão.clearSelection();
        jCheckBoxMoradia.setSelected(false);
        jCheckBoxPasse.setSelected(false);
        jCheckBoxVestimenta.setSelected(false);
        jCheckBoxViagem.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSimNão = new javax.swing.ButtonGroup();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelAuxilios = new javax.swing.JLabel();
        jLabelAposentado = new javax.swing.JLabel();
        jCheckBoxVestimenta = new javax.swing.JCheckBox();
        jCheckBoxMoradia = new javax.swing.JCheckBox();
        jCheckBoxViagem = new javax.swing.JCheckBox();
        jCheckBoxPasse = new javax.swing.JCheckBox();
        jButtonSalvar = new javax.swing.JButton();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNão = new javax.swing.JRadioButton();
        jLabelEmpregados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEmpregados = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelAuxilios.setText("Auxilios ");

        jLabelAposentado.setText("Aposentado");

        jCheckBoxVestimenta.setText("Vestimenta");

        jCheckBoxMoradia.setText("Moradia");

        jCheckBoxViagem.setText("Viagem");
        jCheckBoxViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxViagemActionPerformed(evt);
            }
        });

        jCheckBoxPasse.setText("Passe");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        buttonGroupSimNão.add(jRadioButtonSim);
        jRadioButtonSim.setText("Sim");

        buttonGroupSimNão.add(jRadioButtonNão);
        jRadioButtonNão.setText("Não");

        jLabelEmpregados.setText("Empregados: ");

        jTextAreaEmpregados.setColumns(20);
        jTextAreaEmpregados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEmpregados);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelAuxilios)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxViagem)
                                            .addComponent(jCheckBoxMoradia)
                                            .addComponent(jCheckBoxVestimenta)
                                            .addComponent(jCheckBoxPasse))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonNão)
                                    .addComponent(jRadioButtonSim)
                                    .addComponent(jLabelAposentado)))
                            .addComponent(jTextFieldNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmpregados)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmpregados)
                            .addComponent(jLabelNome))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelAposentado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonNão))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelAuxilios)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBoxVestimenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxMoradia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxViagem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxPasse)))
                                .addGap(24, 24, 24)
                                .addComponent(jButtonSalvar))
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jCheckBoxViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxViagemActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String nome = jTextFieldNome.getText();
        double salario = 15000.00;
        if(nome.trim().length() < 3){
            
            JOptionPane.showMessageDialog (null,"Digite um nome com pelo menos 3 caracteres");
            jTextFieldNome.requestFocus();return;
        } 
        if(jRadioButtonNão.isSelected() == false && jRadioButtonSim.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"Selecione uma das opções!");return;
            
        }
        if(jRadioButtonSim.isSelected() == true){
            salario = salario + 3000;
        }
        if(jCheckBoxMoradia.isSelected() == true){
            salario = salario + 10000;
        }
        if(jCheckBoxPasse.isSelected() == true){
            salario = salario + 5000;
        
        }
        if(jCheckBoxVestimenta.isSelected() == true){
            salario = salario + 5000;
        }    
        if(jCheckBoxViagem.isSelected() == true){
            salario = salario + 2000;
            
        }    
        jTextAreaEmpregados.append(nome + " ganha R$ " + salario + "\n");
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo04jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo04jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo04jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo04jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo04jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSimNão;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxMoradia;
    private javax.swing.JCheckBox jCheckBoxPasse;
    private javax.swing.JCheckBox jCheckBoxVestimenta;
    private javax.swing.JCheckBox jCheckBoxViagem;
    private javax.swing.JLabel jLabelAposentado;
    private javax.swing.JLabel jLabelAuxilios;
    private javax.swing.JLabel jLabelEmpregados;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JRadioButton jRadioButtonNão;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaEmpregados;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
