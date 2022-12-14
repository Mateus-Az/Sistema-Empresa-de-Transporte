/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.empresaTransporte.view;

import javax.swing.JComboBox;
import sistema.empresaTransporte.controller.OrigemDestinoController;

/**
 *
 * @author brasi
 */
public class OrigemDestino extends javax.swing.JFrame {
    private final OrigemDestinoController controller;
    /**
     * Creates new form OrigemDestino
     */
    public OrigemDestino() {
        initComponents();
        controller = new OrigemDestinoController(this);
        controller.mostrarOrigens1();
        controller.atualizaDestinos();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxOrigem = new javax.swing.JComboBox<>();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("  Destino");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 51)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 150, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("   Origem");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 51)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 150, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Passagem somente de ida");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 330, 30));

        jComboBoxOrigem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxOrigem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOrigemItemStateChanged(evt);
            }
        });
        jComboBoxOrigem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jComboBoxOrigemAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxOrigem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxOrigemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxOrigemMouseEntered(evt);
            }
        });
        jComboBoxOrigem.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jComboBoxOrigemCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jComboBoxOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrigemActionPerformed(evt);
            }
        });
        jComboBoxOrigem.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxOrigemPropertyChange(evt);
            }
        });
        getContentPane().add(jComboBoxOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 290, 50));

        jComboBoxDestino.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDestinoItemStateChanged(evt);
            }
        });
        jComboBoxDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxDestinoMouseEntered(evt);
            }
        });
        jComboBoxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/empresaTransporte/view/imagens/icons/Logotipo menor.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 280));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/empresaTransporte/view/imagens/icons/Branco_Simples_Vertical_Seu_Story-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 290, -1));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 290, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mateo\\AREADETRABALHO\\Projeto3\\src\\sistema\\empresaTransporte\\view\\imagens\\icons\\fundoFaixa1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.salvarOrigemDestino();
        OnibusView onibus = new OnibusView();
        onibus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinoActionPerformed
        
    }//GEN-LAST:event_jComboBoxDestinoActionPerformed

    private void jComboBoxOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrigemActionPerformed

    }//GEN-LAST:event_jComboBoxOrigemActionPerformed

    private void jComboBoxOrigemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOrigemItemStateChanged
        controller.limpaCampo();
    }//GEN-LAST:event_jComboBoxOrigemItemStateChanged

    private void jComboBoxOrigemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxOrigemMouseClicked

    }//GEN-LAST:event_jComboBoxOrigemMouseClicked

    private void jComboBoxOrigemPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxOrigemPropertyChange
        
    }//GEN-LAST:event_jComboBoxOrigemPropertyChange

    private void jComboBoxOrigemAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxOrigemAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrigemAncestorMoved

    private void jComboBoxOrigemCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jComboBoxOrigemCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrigemCaretPositionChanged

    private void jComboBoxDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDestinoItemStateChanged

    }//GEN-LAST:event_jComboBoxDestinoItemStateChanged

    private void jComboBoxDestinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDestinoMouseEntered
        controller.limpaCampo();
    }//GEN-LAST:event_jComboBoxDestinoMouseEntered

    private void jComboBoxOrigemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxOrigemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrigemMouseEntered

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
            java.util.logging.Logger.getLogger(OrigemDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrigemDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrigemDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrigemDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrigemDestino().setVisible(true);
            }
        });
    }

    public JComboBox<String> getjComboBoxOrigem() {
        return jComboBoxOrigem;
    }

    public void setjComboBoxOrigem(JComboBox<String> jComboBoxOrigem) {
        this.jComboBoxOrigem = jComboBoxOrigem;
    }

    public JComboBox<String> getjComboBoxDestino() {
        return jComboBoxDestino;
    }

    public void setjComboBoxDestino(JComboBox<String> jComboBoxDestino) {
        this.jComboBoxDestino = jComboBoxDestino;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JComboBox<String> jComboBoxOrigem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
