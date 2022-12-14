/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.empresaTransporte.view;

import javax.swing.JComboBox;
import sistema.empresaTransporte.controller.OnibusController;

/**
 *
 * @author brasi
 */
public class OnibusView extends javax.swing.JFrame {
    private final OnibusController controller;

    /**
     * Creates new form Onibus
     */
    public OnibusView() {
        initComponents();
        controller = new OnibusController(this);
        controller.exibirAssentosDatasLivres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxAsssentos = new javax.swing.JComboBox<>();
        jComboBoxData = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel7.setText("  Dias Disponíveis ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 51)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 190, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel6.setText("  Assentos livres");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 51)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 170, 40));

        ComboBoxAsssentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboBoxAsssentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAsssentosActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxAsssentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 290, 50));

        jComboBoxData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDataActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxData, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 290, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/empresaTransporte/view/imagens/icons/assentosOnibus.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 280, 490));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AVANÇAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/empresaTransporte/view/imagens/icons/Logotipo menor.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 240, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/empresaTransporte/view/imagens/icons/Branco_Simples_Vertical_Seu_Story-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 290, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mateo\\AREADETRABALHO\\Projeto3\\src\\sistema\\empresaTransporte\\view\\imagens\\icons\\fundoFaixa1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.salvarDados();
        FinalizarView finalizarView = new FinalizarView();
        finalizarView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxAsssentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAsssentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAsssentosActionPerformed

    private void jComboBoxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDataActionPerformed

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
            java.util.logging.Logger.getLogger(OnibusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnibusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnibusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnibusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnibusView().setVisible(true);
            }
        });
    }

    public JComboBox<String> getComboBoxAsssentos() {
        return ComboBoxAsssentos;
    }

    public void setComboBoxAsssentos(JComboBox<String> ComboBoxAsssentos) {
        this.ComboBoxAsssentos = ComboBoxAsssentos;
    }

    public JComboBox<String> getjComboBoxData() {
        return jComboBoxData;
    }

    public void setjComboBoxData(JComboBox<String> jComboBoxData) {
        this.jComboBoxData = jComboBoxData;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxAsssentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
