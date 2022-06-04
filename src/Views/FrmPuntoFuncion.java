/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.PuntoFuncion;

/**
 *
 * @author DeVeLoPer24
 */
public class FrmPuntoFuncion extends javax.swing.JFrame {

    /**
     * Creates new form FrmPuntoFuncion
     */
    public FrmPuntoFuncion() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEE = new javax.swing.JTextField();
        txtSE = new javax.swing.JTextField();
        txtCE = new javax.swing.JTextField();
        txtALI = new javax.swing.JTextField();
        txtAIE = new javax.swing.JTextField();
        cboModelo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtUno = new javax.swing.JTextField();
        txtDos = new javax.swing.JTextField();
        txtTres = new javax.swing.JTextField();
        txtCuatro = new javax.swing.JTextField();
        txtCinco = new javax.swing.JTextField();
        txtSeis = new javax.swing.JTextField();
        txtSiete = new javax.swing.JTextField();
        txtOcho = new javax.swing.JTextField();
        txtNuevo = new javax.swing.JTextField();
        txtDiez = new javax.swing.JTextField();
        txtOnce = new javax.swing.JTextField();
        txtDoce = new javax.swing.JTextField();
        txtTrece = new javax.swing.JTextField();
        txtCatorce = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPuntofuncion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPersonames = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtEsfuerzo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDuracionTiempo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNroDesarrolladores = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Punto de Función");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entradas Externas EE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salidas Externas SE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultas Externas CE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Archivos Lógicos Internos ALI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Archivos Interfaz Externos AIE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        txtEE.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(txtEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 40, 30));

        txtSE.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(txtSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 40, 30));

        txtCE.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(txtCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 40, 30));

        txtALI.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(txtALI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 40, 30));

        txtAIE.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(txtAIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 40, 30));

        cboModelo.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        cboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Medio", "Complejo", " " }));
        getContentPane().add(cboModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1. ¿El sistema requiere respaldo y recuperación confiables? ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 380, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("2. ¿Se requieren comunicaciones de datos especializadas para transferir información hacia o desde la aplicación? ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 640, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("3. ¿Existen funciones de procesamiento distribuidas? ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 350, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("4. ¿El desempeño es crucial? ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 240, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("5. ¿El sistema correrá en un entorno operativo existente enormemente utilizado? ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 490, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("6. ¿El sistema requiere entrada de datos en línea? ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 340, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("7. ¿La entrada de datos en línea requiere que la transacción de entrada se construya sobre múltiples pantallas u operaciones? ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 710, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("8. ¿Los ALI se actualizan en línea? ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 270, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("9. ¿Las entradas, salidas, archivos o consultas son complejos? ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 400, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("10. ¿El procesamiento interno es complejo? ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 320, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("11. ¿El código se diseña para ser reutilizable? ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 330, 20));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("12. ¿La conversión y la instalación se incluyen en el diseño? ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 400, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("13. ¿El sistema se diseña para instalaciones múltiples en diferentes organizaciones? ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 510, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("14. ¿La aplicación se diseña para facilitar el cambio y su uso por parte del usuario?");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 500, 20));

        txtUno.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 40, -1));

        txtDos.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 40, -1));

        txtTres.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 40, -1));

        txtCuatro.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, 40, -1));

        txtCinco.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 40, -1));

        txtSeis.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 40, -1));

        txtSiete.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 40, -1));

        txtOcho.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 40, -1));

        txtNuevo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 250, 40, -1));

        txtDiez.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtDiez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 40, -1));

        txtOnce.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtOnce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 310, 40, -1));

        txtDoce.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtDoce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, 40, -1));

        txtTrece.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtTrece, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, 40, -1));

        txtCatorce.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtCatorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 40, -1));

        jLabel21.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Punto de Función");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 20));

        txtPuntofuncion.setEditable(false);
        txtPuntofuncion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtPuntofuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 80, -1));

        jLabel22.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Calculo Persona Mes");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 20));

        txtPersonames.setEditable(false);
        txtPersonames.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtPersonames, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 80, -1));

        jLabel23.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Calculo de Esfuerzo");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, 20));

        txtEsfuerzo.setEditable(false);
        txtEsfuerzo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtEsfuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 80, -1));

        jLabel24.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Calculo Duración de Tiempo");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, 20));

        txtDuracionTiempo.setEditable(false);
        txtDuracionTiempo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(txtDuracionTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 80, -1));

        jLabel25.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ingrese Numero de Desarrolladores");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        txtNroDesarrolladores.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(txtNroDesarrolladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 40, 30));

        jLabel26.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 255, 102));
        jLabel26.setText("8 horas de trabajo 1 personal");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, 20));

        jLabel27.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 255, 102));
        jLabel27.setText("Equivale a horas personas mes");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jLabel28.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 255, 102));
        jLabel28.setText("meses para la conclusión del software");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, 20));

        btnCalcular.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel29.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Solo ingrese números entre 1 a 5");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 370, 20));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wooden board.jpg"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        PuntoFuncion pf = new PuntoFuncion();
        int parametro = cboModelo.getSelectedIndex();
        int entrada = Integer.parseInt(txtEE.getText());
        int salida = Integer.parseInt(txtSE.getText());
        int peticiones = Integer.parseInt(txtCE.getText());
        int archivos = Integer.parseInt(txtALI.getText());
        int interfaces = Integer.parseInt(txtAIE.getText());
        
        pf.CuentaTotal(entrada, salida, peticiones, archivos, interfaces, parametro);
        
        int preguntas[];
        preguntas = new int[14];
        preguntas[0] = Integer.parseInt(txtUno.getText());
        preguntas[1] = Integer.parseInt(txtDos.getText());
        preguntas[2] = Integer.parseInt(txtTres.getText());
        preguntas[3] = Integer.parseInt(txtCuatro.getText());
        preguntas[4] = Integer.parseInt(txtCinco.getText());
        preguntas[5] = Integer.parseInt(txtSeis.getText());
        preguntas[6] = Integer.parseInt(txtSiete.getText());
        preguntas[7] = Integer.parseInt(txtOcho.getText());
        preguntas[8] = Integer.parseInt(txtNuevo.getText());
        preguntas[9] = Integer.parseInt(txtDiez.getText());
        preguntas[10] = Integer.parseInt(txtOnce.getText());
        preguntas[11] = Integer.parseInt(txtDoce.getText());
        preguntas[12] = Integer.parseInt(txtTrece.getText());
        preguntas[13] = Integer.parseInt(txtCatorce.getText());
        
        pf.SumatoriaFi(preguntas);
        
        double puntoFuncion = pf.PuntoFuncion();
        
        txtPuntofuncion.setText(Math.round(puntoFuncion * 100.0) / 100.0 + "");
        
        double personaMes = pf.PersonaMes();
        
        txtPersonames.setText(Math.round(personaMes * 100.0) / 100.0 + "");
        
        double esfuerzo = pf.Esfuerzo();
        
        txtEsfuerzo.setText(Math.round(esfuerzo * 100.0) / 100.0 + "");
        
        int desarrolladores = Integer.parseInt(txtNroDesarrolladores.getText());
        
        double duracionTiempo = pf.DuracionTiempo(desarrolladores);
        
        txtDuracionTiempo.setText(Math.round(duracionTiempo * 100.0) / 100.0 + "");
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPuntoFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPuntoFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAIE;
    private javax.swing.JTextField txtALI;
    private javax.swing.JTextField txtCE;
    private javax.swing.JTextField txtCatorce;
    private javax.swing.JTextField txtCinco;
    private javax.swing.JTextField txtCuatro;
    private javax.swing.JTextField txtDiez;
    private javax.swing.JTextField txtDoce;
    private javax.swing.JTextField txtDos;
    private javax.swing.JTextField txtDuracionTiempo;
    private javax.swing.JTextField txtEE;
    private javax.swing.JTextField txtEsfuerzo;
    private javax.swing.JTextField txtNroDesarrolladores;
    private javax.swing.JTextField txtNuevo;
    private javax.swing.JTextField txtOcho;
    private javax.swing.JTextField txtOnce;
    private javax.swing.JTextField txtPersonames;
    private javax.swing.JTextField txtPuntofuncion;
    private javax.swing.JTextField txtSE;
    private javax.swing.JTextField txtSeis;
    private javax.swing.JTextField txtSiete;
    private javax.swing.JTextField txtTrece;
    private javax.swing.JTextField txtTres;
    private javax.swing.JTextField txtUno;
    // End of variables declaration//GEN-END:variables
}
