/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pw.swing;

import javax.swing.JOptionPane;

/**
 *
 * @author 66264
 */
public class Exemplo02JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo02JFrame
     */
    public Exemplo02JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonNintendoSwitch = new javax.swing.JRadioButton();
        jRadioButtonPS4 = new javax.swing.JRadioButton();
        jRadioButtonXbox = new javax.swing.JRadioButton();
        jButtonApresentar = new javax.swing.JButton();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Plataforma");

        buttonGroup.add(jRadioButtonNintendoSwitch);
        jRadioButtonNintendoSwitch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonNintendoSwitch.setText("Nintendo Switch");

        buttonGroup.add(jRadioButtonPS4);
        jRadioButtonPS4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonPS4.setText("PS4");
        jRadioButtonPS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPS4ActionPerformed(evt);
            }
        });

        buttonGroup.add(jRadioButtonXbox);
        jRadioButtonXbox.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonXbox.setText("Xbox");

        jButtonApresentar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonApresentar.setText("Apresentar ");
        jButtonApresentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApresentarActionPerformed(evt);
            }
        });

        jLabelQuantidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelQuantidade.setText("Quantidade");

        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelResultado.setText("Resultado");

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonXbox)
                                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonApresentar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonNintendoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabelQuantidade))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonPS4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNintendoSwitch)
                    .addComponent(jLabelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPS4)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonXbox)
                        .addGap(19, 19, 19)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonApresentar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonApresentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApresentarActionPerformed
        int quantidade = 0;
        try {
            quantidade = Integer.parseInt(jTextFieldQuantidade.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite uma quantidade do tipo inteiro");
            jTextFieldQuantidade.requestFocus();
            return;

        }
        if (jRadioButtonNintendoSwitch.isSelected() == false
                && jRadioButtonPS4.isSelected() == false
                && jRadioButtonXbox.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Selecione uma plataform");
            return;
        }
        double valorConsole = 0;
        String plataforma = "";
        if (jRadioButtonNintendoSwitch.isSelected()) {
            valorConsole = 2000;
            plataforma = "Nintendo Switch";
        } else if (jRadioButtonPS4.isSelected()) {
            valorConsole = 1600;
            plataforma = "PS4";
        } else if (jRadioButtonXbox.isSelected()) {
            valorConsole = 1200;
            plataforma = "Xbox";
        }
        double total = quantidade * valorConsole;
        //jTextAreaResultado.seText(jAreaResiltado.getText() + "Xbox -> " + total);
        jTextAreaResultado.append(plataforma + "->" + total + "/n");
        jTextFieldQuantidade.setText ("");
        buttonGroup.clearSelection();
        

   
    }//GEN-LAST:event_jButtonApresentarActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void jRadioButtonPS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPS4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPS4ActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo02JFrame.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo02JFrame.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo02JFrame.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo02JFrame.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo02JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonApresentar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JRadioButton jRadioButtonNintendoSwitch;
    private javax.swing.JRadioButton jRadioButtonPS4;
    private javax.swing.JRadioButton jRadioButtonXbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}