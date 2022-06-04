/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author DeVeLoPer24
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCocomoSimple = new javax.swing.JButton();
        btnCocomoIntermedio = new javax.swing.JButton();
        btnPuntoFuncion = new javax.swing.JButton();
        btnLineasCodigoLDC = new javax.swing.JButton();
        btnCosmic = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCocomoSimple.setBackground(new java.awt.Color(0, 0, 0));
        btnCocomoSimple.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCocomoSimple.setForeground(new java.awt.Color(255, 255, 255));
        btnCocomoSimple.setText("COCOMO SIMPLE");
        btnCocomoSimple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCocomoSimple.setName("btnCocomoBasico"); // NOI18N
        btnCocomoSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocomoSimpleActionPerformed(evt);
            }
        });
        getContentPane().add(btnCocomoSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        btnCocomoIntermedio.setBackground(new java.awt.Color(0, 0, 0));
        btnCocomoIntermedio.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCocomoIntermedio.setForeground(new java.awt.Color(255, 255, 255));
        btnCocomoIntermedio.setText("COCOMO INTERMEDIO");
        btnCocomoIntermedio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCocomoIntermedio.setName("btnCocomoBasico"); // NOI18N
        btnCocomoIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocomoIntermedioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCocomoIntermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        btnPuntoFuncion.setBackground(new java.awt.Color(0, 0, 0));
        btnPuntoFuncion.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnPuntoFuncion.setForeground(new java.awt.Color(255, 255, 255));
        btnPuntoFuncion.setText("PUNTO DE FUNCION");
        btnPuntoFuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPuntoFuncion.setName("btnCocomoBasico"); // NOI18N
        btnPuntoFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoFuncionActionPerformed(evt);
            }
        });
        getContentPane().add(btnPuntoFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        btnLineasCodigoLDC.setBackground(new java.awt.Color(0, 0, 0));
        btnLineasCodigoLDC.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnLineasCodigoLDC.setForeground(new java.awt.Color(255, 255, 255));
        btnLineasCodigoLDC.setText("LINEAS DE CODIGO LDC");
        btnLineasCodigoLDC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLineasCodigoLDC.setName("btnCocomoBasico"); // NOI18N
        btnLineasCodigoLDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineasCodigoLDCActionPerformed(evt);
            }
        });
        getContentPane().add(btnLineasCodigoLDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btnCosmic.setBackground(new java.awt.Color(0, 0, 0));
        btnCosmic.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCosmic.setForeground(new java.awt.Color(255, 255, 255));
        btnCosmic.setText("COSMIC");
        btnCosmic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCosmic.setName("btnCocomoBasico"); // NOI18N
        btnCosmic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosmicActionPerformed(evt);
            }
        });
        getContentPane().add(btnCosmic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 90));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA DE ESTIMACION DE SOFTWARE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teamwork.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCocomoSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocomoSimpleActionPerformed
        FrmCocomoBasico frmCocomoBasico = new FrmCocomoBasico();
        frmCocomoBasico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCocomoSimpleActionPerformed

    private void btnCocomoIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocomoIntermedioActionPerformed
        // TODO add your handling code here:
        FrmCocomoIntermedio frmCocomoIntermedio = new FrmCocomoIntermedio();
        frmCocomoIntermedio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCocomoIntermedioActionPerformed

    private void btnPuntoFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoFuncionActionPerformed
        // TODO add your handling code here:
        FrmPuntoFuncion frmPuntoFuncion = new FrmPuntoFuncion();
        frmPuntoFuncion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPuntoFuncionActionPerformed

    private void btnLineasCodigoLDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineasCodigoLDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLineasCodigoLDCActionPerformed

    private void btnCosmicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosmicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCosmicActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCocomoIntermedio;
    private javax.swing.JButton btnCocomoSimple;
    private javax.swing.JButton btnCosmic;
    private javax.swing.JButton btnLineasCodigoLDC;
    private javax.swing.JButton btnPuntoFuncion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}