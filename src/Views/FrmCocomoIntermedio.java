/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.CocomoIntermedio;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author DeVeLoPer24
 */
public class FrmCocomoIntermedio extends javax.swing.JFrame {

    double a, b, c;

    /**
     * Creates new form FrmCocomoIntermedio
     */
    public FrmCocomoIntermedio() {
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

        jLabel1 = new javax.swing.JLabel();
        cboModelo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKLDC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboExperienciaAplicaccion = new javax.swing.JComboBox<>();
        cboComplejidadSoftware = new javax.swing.JComboBox<>();
        cboCalidadProgramador = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        txtEsfuerzoNominal = new javax.swing.JTextField();
        txtEsfuerzoPersonaMes = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtTiempoDesarrollo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtInputCosto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setText("COCOMO INTERMEDIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cboModelo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orgánico", "Semi-acoplado", "Acoplado" }));
        cboModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModeloActionPerformed(evt);
            }
        });
        getContentPane().add(cboModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 170, 30));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione Modelo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Introduzca KLDC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        txtKLDC.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtKLDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKLDCKeyTyped(evt);
            }
        });
        getContentPane().add(txtKLDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 120, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Factores (cost-drivers)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Experiencia de la Aplicación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Complejidad de Software");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calidad de Programador");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        cboExperienciaAplicaccion.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cboExperienciaAplicaccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy bajo", "Bajo", "Medio", "Alto", "Muy alto" }));
        getContentPane().add(cboExperienciaAplicaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 260, 130, -1));

        cboComplejidadSoftware.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cboComplejidadSoftware.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy bajo", "Bajo", "Medio", "Alto", "Muy alto", "Extra" }));
        getContentPane().add(cboComplejidadSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, -1));

        cboCalidadProgramador.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cboCalidadProgramador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy bajo", "Bajo", "Medio", "Alto", "Muy alto" }));
        getContentPane().add(cboCalidadProgramador, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 200, 130, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número de Personas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Esfuerzo Nominal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Esfuerzo Persona Mes");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Costo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tiempo de Desarrollo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 20));

        txtNumeroPersonas.setEditable(false);
        txtNumeroPersonas.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        getContentPane().add(txtNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 100, -1));

        txtEsfuerzoNominal.setEditable(false);
        txtEsfuerzoNominal.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        getContentPane().add(txtEsfuerzoNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 100, -1));

        txtEsfuerzoPersonaMes.setEditable(false);
        txtEsfuerzoPersonaMes.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        getContentPane().add(txtEsfuerzoPersonaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 100, -1));

        txtCosto.setEditable(false);
        txtCosto.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 100, -1));

        txtTiempoDesarrollo.setEditable(false);
        txtTiempoDesarrollo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        getContentPane().add(txtTiempoDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 100, -1));

        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        btnCalcular.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator_calc_6110.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 51));
        jLabel13.setText("persona mes");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 51));
        jLabel14.setText("meses");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Indroduzca Costo");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        txtInputCosto.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtInputCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputCostoKeyTyped(evt);
            }
        });
        getContentPane().add(txtInputCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 120, -1));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wooden board.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int modelo = cboModelo.getSelectedIndex();
        double kldc = Double.parseDouble(txtKLDC.getText());
        CocomoIntermedio cocoII = new CocomoIntermedio();
        double en = cocoII.EsfuerzoNominal(modelo, kldc);
        txtEsfuerzoNominal.setText(Math.round(en * 100.0) / 100.0 + "");
        int comSW = cboComplejidadSoftware.getSelectedIndex();
        int calPro = cboCalidadProgramador.getSelectedIndex();
        int expApp = cboExperienciaAplicaccion.getSelectedIndex();
        if (comSW == 0) {
            a = 0.70;
        }
        if (comSW == 1) {
            a = 0.85;
        }
        if (comSW == 2) {
            a = 1;
        }
        if (comSW == 3) {
            a = 1.15;
        }
        if (comSW == 4) {
            a = 1.30;
        }
        if (comSW == 5) {
            a = 1.65;
        }
        if (calPro == 0) {
            b = 1.42;
        }
        if (calPro == 1) {
            b = 1.17;
        }
        if (calPro == 2) {
            b = 1;
        }
        if (calPro == 3) {
            b = 0.86;
        }
        if (calPro == 4) {
            b = 0.70;
        }
        
        if (expApp == 0) {
            c = 1.29;
        }
        if (expApp == 1) {
            c = 1.13;
        }
        if (expApp == 2) {
            c = 1;
        }
        if (expApp == 3) {
            c = 0.91;
        }
        if (expApp == 4) {
            c = 0.82;
        }

        double epm = cocoII.EsfuerzoPersonaMes(a, b, c);
        txtEsfuerzoPersonaMes.setText(Math.round(epm * 100.0) / 100.0 + "");
        double costo = Double.parseDouble(txtInputCosto.getText());
        double ct = cocoII.Costo(costo);
        txtCosto.setText(Math.round(ct * 100.0) / 100.0 + "");
        double td = cocoII.TiempoDesarrollo(modelo);
        txtTiempoDesarrollo.setText(Math.round(td * 100.0) / 100.0 + "");
        double np = cocoII.NumeroPersonas();
        txtNumeroPersonas.setText(Math.round(np * 100.0) / 100.0 + "");

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cboModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboModeloActionPerformed

    private void txtKLDCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKLDCKeyTyped
        // TODO add your handling code here:
        numberDecimalKeyPress(evt, txtKLDC);
    }//GEN-LAST:event_txtKLDCKeyTyped

    private void txtInputCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputCostoKeyTyped
        // TODO add your handling code here:
        numberDecimalKeyPress(evt, txtInputCosto);
    }//GEN-LAST:event_txtInputCostoKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCocomoIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCocomoIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCocomoIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCocomoIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCocomoIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboCalidadProgramador;
    private javax.swing.JComboBox<String> cboComplejidadSoftware;
    private javax.swing.JComboBox<String> cboExperienciaAplicaccion;
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtEsfuerzoNominal;
    private javax.swing.JTextField txtEsfuerzoPersonaMes;
    private javax.swing.JTextField txtInputCosto;
    private javax.swing.JTextField txtKLDC;
    private javax.swing.JTextField txtNumeroPersonas;
    private javax.swing.JTextField txtTiempoDesarrollo;
    // End of variables declaration//GEN-END:variables

    public void numberDecimalKeyPress(KeyEvent evt, JTextField textField) {
// declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && textField.getText().contains(".") && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
 }
}
