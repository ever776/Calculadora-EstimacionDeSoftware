/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import Models.CocomoBasico;
import javax.swing.ImageIcon;

/**
 *
 * @author DeVeLoPer24
 */
public class FrmCocomoBasico extends javax.swing.JFrame {

    /**
     * Creates new form FrmCocomoBasico
     */
    public FrmCocomoBasico() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/icon.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    CocomoBasico calcular = new CocomoBasico();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEntradaSalida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cobModelDesarrollo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTiempoDesarrollo = new javax.swing.JTextField();
        txtKlcd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLdc = new javax.swing.JTextField();
        txtEstimacionEsfuerzo = new javax.swing.JTextField();
        txtPersonalNecesario = new javax.swing.JTextField();
        txtEstimacionProductividad = new javax.swing.JTextField();
        txtEstimacionCosto = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntradaSalida.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtEntradaSalida.setForeground(new java.awt.Color(58, 15, 15));
        txtEntradaSalida.setName("txtEntradasSalidas"); // NOI18N
        txtEntradaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaSalidaActionPerformed(evt);
            }
        });
        txtEntradaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaSalidaKeyTyped(evt);
            }
        });
        getContentPane().add(txtEntradaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 60, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modelo de Desarrollo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 220, 31));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número Entradas y Salidas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 60, -1, 30));

        cobModelDesarrollo.setBackground(new java.awt.Color(0, 43, 7));
        cobModelDesarrollo.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cobModelDesarrollo.setForeground(new java.awt.Color(58, 15, 15));
        cobModelDesarrollo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORGÁNICO", "SEMI-LIBRE", "EMPOTRADO" }));
        cobModelDesarrollo.setName("cmbModeloDesarrollo"); // NOI18N
        cobModelDesarrollo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cobModelDesarrolloItemStateChanged(evt);
            }
        });
        getContentPane().add(cobModelDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 180, 31));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estimación de la cantidad de instrucciones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estimación del esfuerzo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estimacion del tiempo de desarrollo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estimación del personal necesario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estimación de costo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, 30));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estimación de productividad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 30));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("METODO COCOMO BASICO");
        jLabel9.setName("lblTitulo"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 50));
        jLabel9.getAccessibleContext().setAccessibleName("");

        txtTiempoDesarrollo.setEditable(false);
        txtTiempoDesarrollo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtTiempoDesarrollo.setForeground(new java.awt.Color(58, 15, 15));
        txtTiempoDesarrollo.setName("txtEntradasSalidas"); // NOI18N
        getContentPane().add(txtTiempoDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 108, -1));

        txtKlcd.setEditable(false);
        txtKlcd.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtKlcd.setForeground(new java.awt.Color(58, 15, 15));
        txtKlcd.setName("txtEntradasSalidas"); // NOI18N
        txtKlcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKlcdActionPerformed(evt);
            }
        });
        getContentPane().add(txtKlcd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 70, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LDC");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 40, 30));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KLDC");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 50, 30));

        txtLdc.setEditable(false);
        txtLdc.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtLdc.setForeground(new java.awt.Color(58, 15, 15));
        txtLdc.setName("txtLcd"); // NOI18N
        getContentPane().add(txtLdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 108, -1));

        txtEstimacionEsfuerzo.setEditable(false);
        txtEstimacionEsfuerzo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtEstimacionEsfuerzo.setForeground(new java.awt.Color(58, 15, 15));
        txtEstimacionEsfuerzo.setName("txtEntradasSalidas"); // NOI18N
        getContentPane().add(txtEstimacionEsfuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 108, -1));

        txtPersonalNecesario.setEditable(false);
        txtPersonalNecesario.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtPersonalNecesario.setForeground(new java.awt.Color(58, 15, 15));
        txtPersonalNecesario.setName("txtEntradasSalidas"); // NOI18N
        getContentPane().add(txtPersonalNecesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 108, -1));

        txtEstimacionProductividad.setEditable(false);
        txtEstimacionProductividad.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtEstimacionProductividad.setForeground(new java.awt.Color(58, 15, 15));
        txtEstimacionProductividad.setName("txtEntradasSalidas"); // NOI18N
        getContentPane().add(txtEstimacionProductividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 108, -1));

        txtEstimacionCosto.setEditable(false);
        txtEstimacionCosto.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtEstimacionCosto.setForeground(new java.awt.Color(58, 15, 15));
        txtEstimacionCosto.setName("txtEntradasSalidas"); // NOI18N
        getContentPane().add(txtEstimacionCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 108, -1));

        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 140, 36));

        btnCalcular.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator_calc_6110.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 36));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("persona/mes");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 143, 30));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("persona/mes");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 143, 30));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("meses");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 143, 30));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html>instrucciones / persona mes</html>");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 230, 60));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("costo estimado");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 160, 30));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wooden board.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKlcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKlcdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKlcdActionPerformed

    private void cobModelDesarrolloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cobModelDesarrolloItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cobModelDesarrolloItemStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int modeloDesarrollo = cobModelDesarrollo.getSelectedIndex();
        double modelo, nroES, lcd, klcd, esfuerzo, tiempoDesarrollo, estimacionProductividad, estimacionCosto, personalNecesario;
        nroES = Double.parseDouble(txtEntradaSalida.getText());
        switch (modeloDesarrollo) {
            case 0:
                modelo = 100;
                lcd = calcular.CantidadInstruccionesLCD(modelo, nroES);
                klcd = calcular.conversionKLDC();
                esfuerzo = calcular.EstimacionEsfuerzo();
                tiempoDesarrollo = calcular.TiempoDesarrollo();
                personalNecesario = calcular.PersonalNecesario();
                estimacionProductividad = calcular.EstimacionProductividad();
                estimacionCosto = calcular.EstimacionCosto();

                txtLdc.setText(Math.round(lcd * 100.0) / 100.0 + "");
                txtKlcd.setText(Math.round(klcd * 100.0) / 100.0 + "");
                txtEstimacionEsfuerzo.setText(Math.round(esfuerzo * 100.0) / 100.0 + "");
                txtTiempoDesarrollo.setText(Math.round(tiempoDesarrollo * 100.0) / 100.0 + "");
                txtPersonalNecesario.setText(Math.round(personalNecesario * 100.0) / 100.0 + "");
                txtEstimacionProductividad.setText(Math.round(estimacionProductividad * 100.0) / 100.0 + "");
                txtEstimacionCosto.setText(Math.round(estimacionCosto * 100.0) / 100.0 + "");
                break;
            case 1:
                modelo = 200;
                lcd = calcular.CantidadInstruccionesLCD(modelo, nroES);
                klcd = calcular.conversionKLDC();
                esfuerzo = calcular.EstimacionEsfuerzo();
                tiempoDesarrollo = calcular.TiempoDesarrollo();
                personalNecesario = calcular.PersonalNecesario();
                estimacionProductividad = calcular.EstimacionProductividad();
                estimacionCosto = calcular.EstimacionCosto();

                txtLdc.setText(Math.round(lcd * 100.0) / 100.0 + "");
                txtKlcd.setText(Math.round(klcd * 100.0) / 100.0 + "");
                txtEstimacionEsfuerzo.setText(Math.round(esfuerzo * 100.0) / 100.0 + "");
                txtTiempoDesarrollo.setText(Math.round(tiempoDesarrollo * 100.0) / 100.0 + "");
                txtPersonalNecesario.setText(Math.round(personalNecesario * 100.0) / 100.0 + "");
                txtEstimacionProductividad.setText(Math.round(estimacionProductividad * 100.0) / 100.0 + "");
                txtEstimacionCosto.setText(Math.round(estimacionCosto * 100.0) / 100.0 + "");
                break;
            case 2:
                modelo = 300;
                lcd = calcular.CantidadInstruccionesLCD(modelo, nroES);
                klcd = calcular.conversionKLDC();
                esfuerzo = calcular.EstimacionEsfuerzo();
                tiempoDesarrollo = calcular.TiempoDesarrollo();
                personalNecesario = calcular.PersonalNecesario();
                estimacionProductividad = calcular.EstimacionProductividad();
                estimacionCosto = calcular.EstimacionCosto();

                txtLdc.setText(Math.round(lcd * 100.0) / 100.0 + "");
                txtKlcd.setText(Math.round(klcd * 100.0) / 100.0 + "");
                txtEstimacionEsfuerzo.setText(Math.round(esfuerzo * 100.0) / 100.0 + "");
                txtTiempoDesarrollo.setText(Math.round(tiempoDesarrollo * 100.0) / 100.0 + "");
                txtPersonalNecesario.setText(Math.round(personalNecesario * 100.0) / 100.0 + "");
                txtEstimacionProductividad.setText(Math.round(estimacionProductividad * 100.0) / 100.0 + "");
                txtEstimacionCosto.setText(Math.round(estimacionCosto * 100.0) / 100.0 + "");
                break;
            default:
                break;
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtEntradaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaSalidaActionPerformed

    private void txtEntradaSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaSalidaKeyTyped
        // TODO add your handling code here:
        numberDecimalKeyPress(evt, txtEntradaSalida);
    }//GEN-LAST:event_txtEntradaSalidaKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCocomoBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCocomoBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCocomoBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCocomoBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCocomoBasico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cobModelDesarrollo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEntradaSalida;
    private javax.swing.JTextField txtEstimacionCosto;
    private javax.swing.JTextField txtEstimacionEsfuerzo;
    private javax.swing.JTextField txtEstimacionProductividad;
    private javax.swing.JTextField txtKlcd;
    private javax.swing.JTextField txtLdc;
    private javax.swing.JTextField txtPersonalNecesario;
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
