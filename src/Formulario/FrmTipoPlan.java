
package Formulario;

import Desarrollo.ConsultasGrales;
import Desarrollo.TipoPlan;
import Desarrollo.Validacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmTipoPlan extends javax.swing.JInternalFrame {
ConsultasGrales Cg = new ConsultasGrales();
TipoPlan Tp = new TipoPlan ();

    public FrmTipoPlan() {
        initComponents();
        this.LblTitulo.setText("ALTAS DE TIPOS DE PLANES");
        this.Tabla.setModel(Cg.Titulo(3));
        this.BtnModificar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnCascada.setVisible(false);
        
    }
    
    public void ModifPlan (String plan, String pago) {
        this.TxtPlan.setText(plan);
        this.TxtPago.setText(pago);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtPlan = new javax.swing.JTextField();
        LblPlan = new javax.swing.JLabel();
        LblPago = new javax.swing.JLabel();
        TxtPago = new javax.swing.JTextField();
        BtnSalir = new javax.swing.JButton();
        BtnCargar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnMostrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JButton();
        BtnCascada = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 114, 181));

        LblTitulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(919, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        TxtPlan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPlanKeyPressed(evt);
            }
        });

        LblPlan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblPlan.setText("INGRESE EL TIPO DE PLAN:");

        LblPago.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblPago.setText("INGRESE LA FORMA DE PAGO:");

        TxtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPagoKeyPressed(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemdefault_103452.png"))); // NOI18N
        BtnCargar.setText("CARGAR DATOS");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPago)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BtnCargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPago, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 590, 260));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 560, 320));

        BtnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1491253669-6document-report_82892.png"))); // NOI18N
        BtnMostrar.setText("MOSTRAR TABLA");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 180, 35));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnCascada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemdefault_103452.png"))); // NOI18N
        BtnCascada.setText("CONFIRMAR MODIF.");
        BtnCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCascadaActionPerformed(evt);
            }
        });

        BtnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_4219.png"))); // NOI18N
        BtnBaja.setText("BAJA");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCascada)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(BtnCascada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        if (this.TxtPago.getText().isEmpty() || this.TxtPlan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR, TIENE QUE COMPLETAR TODOS LOS DATOS ");
        } else {
            String pago = this.TxtPago.getText().toUpperCase();
            String plan = this.TxtPlan.getText().toUpperCase();
            TipoPlan pla = new TipoPlan (plan, pago);
            pla.Altas();
            this.TxtPago.setText(null);
            this.TxtPlan.setText(null);
            JOptionPane.showMessageDialog(null, "SE HAN CARGADO LOS VALORES CORRECTAMENTE ");
        }
        this.Tabla.setModel(Cg.Mostrar(4));
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void TxtPlanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPlanKeyPressed
        Validacion.SoloLetras(evt);
    }//GEN-LAST:event_TxtPlanKeyPressed

    private void TxtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPagoKeyPressed
        Validacion.SoloLetras(evt);
    }//GEN-LAST:event_TxtPagoKeyPressed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        this.Tabla.setModel(Cg.Mostrar(4));
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed

        this.TxtPago.setEditable(true);
        this.TxtPlan.setEditable(true);
        this.BtnCascada.setVisible(true);
        this.BtnBaja.setVisible(false);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCascadaActionPerformed
        Tp.setPlan(this.TxtPlan.getText().toUpperCase());
        Tp.setPago(this.TxtPago.getText().toUpperCase());
        int nrofila = this.Tabla.getSelectedRow();   
        String plan = Tabla.getValueAt(nrofila, 1).toString();
          try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? ");
            if (valor == 0) {
                Tp.Modif(plan);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        
        }
        this.TxtPago.setText(null);
        this.TxtPlan.setText(null);
        this.Tabla.setModel(Cg.Mostrar(4));
        this.BtnCargar.setVisible(true);
        this.BtnCascada.setVisible(false);
        this.BtnModificar.setVisible(false);
    }//GEN-LAST:event_BtnCascadaActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int nrofila = this.Tabla.getSelectedRow();   
        String plan = Tabla.getValueAt(nrofila, 1).toString();
        String pago = Tabla.getValueAt(nrofila, 2).toString();
        ModifPlan (plan, pago) ;
        this.TxtPago.setEditable(false);
        this.TxtPlan.setEditable(false);
        this.BtnModificar.setVisible(true);
        this.BtnBaja.setVisible(true);
        this.BtnCargar.setVisible(false);
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        int nrofila = this.Tabla.getSelectedRow();
        String tipoplan = Tabla.getValueAt(nrofila, 1).toString();
        Tp.setPlan(tipoplan);
        
        try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? ");
            if (valor == 0) {
                Tp.Bajas();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        
        }
        
        this.Tabla.setModel(Cg.Mostrar(4));
        this.BtnCargar.setVisible(true);
        this.BtnCascada.setVisible(false);
        this.BtnModificar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.TxtPago.setText(null);
        this.TxtPlan.setText(null);
        this.TxtPago.setEditable(true);
        this.TxtPlan.setEditable(true);
    }//GEN-LAST:event_BtnBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnCascada;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblPago;
    private javax.swing.JLabel LblPlan;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtPago;
    private javax.swing.JTextField TxtPlan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
