
package Formulario;

import Desarrollo.ConsultasGrales;
import Desarrollo.Genero;
import Desarrollo.Validacion;
import javax.swing.JOptionPane;


public class FrmGenero extends javax.swing.JInternalFrame {
ConsultasGrales Cg = new ConsultasGrales();
Genero gen = new Genero ();

    public FrmGenero() {
        initComponents();
        this.LblTitulo.setText("ALTAS DE GENEROS DE PELIS Y SERIES");
        this.Tabla.setModel(Cg.Titulo(1));
        this.BtnModificar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnConfirmar.setVisible(false);
    }

    private void Limpiar () {
        this.TxtGenero.setText(null);
        this.Tabla.clearSelection();
    }
    
    
    private void ModifGen (String nomgen) {
        this.TxtGenero.setText(nomgen);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtGenero = new javax.swing.JTextField();
        LblGenero = new javax.swing.JLabel();
        BtnCargar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnMostrar = new javax.swing.JButton();

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
                .addGap(58, 58, 58)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 100));

        jPanel2.setPreferredSize(new java.awt.Dimension(940, 320));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtGeneroKeyTyped(evt);
            }
        });
        jPanel2.add(TxtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 66, 237, 28));

        LblGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblGenero.setText("INGRESE EL GENERO:");
        jPanel2.add(LblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 66, 208, 28));

        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemdefault_103452.png"))); // NOI18N
        BtnCargar.setText("CARGAR DATOS");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 35));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 352, 169, 35));

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 147, 35));

        BtnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_4219.png"))); // NOI18N
        BtnBaja.setText("BAJA");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 147, 35));

        BtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemdefault_103452.png"))); // NOI18N
        BtnConfirmar.setText("CONFIRMAR MODIF.");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 288, -1, 35));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 600, 410));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 560, 340));

        BtnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1491253669-6document-report_82892.png"))); // NOI18N
        BtnMostrar.setText("MOSTRAR TABLA");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 170, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        if (this.TxtGenero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR, TIENE QUE INGRESAR ALGUN DATO A GENERO");
        } else {
            String tipo = this.TxtGenero.getText().toUpperCase();
            Genero gene = new Genero(tipo);
            gene.Altas();
            this.TxtGenero.setText(null);
            JOptionPane.showMessageDialog(null, "SE HA CARGADO EL VALOR CORRECTAMENTE ");
        }
        
        this.Tabla.setModel(Cg.Mostrar(1)); 
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void TxtGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtGeneroKeyTyped
        Validacion.SoloLetras(evt);
    }//GEN-LAST:event_TxtGeneroKeyTyped

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        this.Tabla.setModel(Cg.Mostrar(1));
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.TxtGenero.setEditable(true);
        this.BtnConfirmar.setVisible(true);
        this.BtnCargar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnModificar.setVisible(false);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        this.BtnBaja.setVisible(true);
        this.BtnModificar.setVisible(true);
        int nrofila = this.Tabla.getSelectedRow();   
        String tipogen = Tabla.getValueAt(nrofila, 1).toString();
        ModifGen (tipogen) ;
        this.TxtGenero.setEditable(false);
        
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        gen.setTipo(this.TxtGenero.getText().toUpperCase());
        int nrofila = this.Tabla.getSelectedRow();
        String tipogen = Tabla.getValueAt(nrofila, 1).toString();
        
        try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? ");
            if (valor == 0) {
                gen.Modif(tipogen);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        
        }
        this.TxtGenero.setText(null);
        this.Tabla.clearSelection();
        this.Tabla.setModel(Cg.Mostrar(1));
        this.BtnConfirmar.setVisible(false);
        this.BtnCargar.setVisible(true);
        this.BtnBaja.setVisible(false);
        this.BtnModificar.setVisible(false);
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        int nrofila = this.Tabla.getSelectedRow();
        String tipogen = Tabla.getValueAt(nrofila, 1).toString();
        gen.setTipo(tipogen);
        
        try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? Esta accion no se puede revertir");
            if (valor == 0) {
                gen.Bajas();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        
        }
        this.Tabla.setModel(Cg.Mostrar(1));
        this.BtnConfirmar.setVisible(false);
        this.BtnCargar.setVisible(true);
        this.BtnBaja.setVisible(false);
        this.BtnModificar.setVisible(false);
        this.TxtGenero.setText(null);
        this.TxtGenero.setEditable(true);
    }//GEN-LAST:event_BtnBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblGenero;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
