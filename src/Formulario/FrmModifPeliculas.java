
package Formulario;

import Desarrollo.ConsultasGrales;
import Desarrollo.Peliculas;
import Desarrollo.Socios;
import javax.swing.JOptionPane;

public class FrmModifPeliculas extends javax.swing.JInternalFrame {
ConsultasGrales Cg = new ConsultasGrales();
Peliculas pl = new Peliculas ();
Socios sc = new Socios ();

    public FrmModifPeliculas() {
        initComponents();
        this.LblTitulo.setText("MODIFICACIONES Y BAJAS DE PELICULAS");
        this.PanelBotones.setVisible(false);
        this.PanelDatos.setVisible(false);
        this.CmbPeliculas.setModel(Cg.MostrarCombos(3));
        this.CmbGen.setModel(Cg.MostrarCombos(4));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblGenero = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CmbPeliculas = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        LblTitulo = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        LblTituloPeli = new javax.swing.JLabel();
        LblAño = new javax.swing.JLabel();
        LblDuracion = new javax.swing.JLabel();
        LblDirector = new javax.swing.JLabel();
        LblResumen = new javax.swing.JLabel();
        LblGenero1 = new javax.swing.JLabel();
        TxtTituloPeli = new javax.swing.JTextField();
        TxtAño = new javax.swing.JTextField();
        TxtDuracion = new javax.swing.JTextField();
        TxtDirector = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtResumen = new javax.swing.JTextArea();
        CmbGen = new javax.swing.JComboBox<>();
        PanelBotones = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JButton();
        BtnBajas = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        LblGenero.setText("GENERO");

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR"));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("BUSCAR POR PELICULA");

        CmbPeliculas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbPeliculas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(128, 128, 128)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(CmbPeliculas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CmbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(BtnBuscar)
                .addContainerGap())
        );

        LblTitulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 170));

        PanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblTituloPeli.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblTituloPeli.setText("TITULO");

        LblAño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblAño.setText("AÑO");

        LblDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblDuracion.setText("DURACION");

        LblDirector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblDirector.setText("DIRECTOR");

        LblResumen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblResumen.setText("RESUMEN");

        LblGenero1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblGenero1.setText("GENERO");

        TxtTituloPeli.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtAño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtDirector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtResumen.setColumns(20);
        TxtResumen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TxtResumen.setRows(5);
        jScrollPane1.setViewportView(TxtResumen);

        CmbGen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTituloPeli)
                    .addComponent(LblGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblResumen)
                    .addComponent(LblDirector)
                    .addComponent(LblDuracion)
                    .addComponent(LblAño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtDirector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtAño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtTituloPeli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CmbGen, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTituloPeli)
                    .addComponent(TxtTituloPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAño))
                .addGap(37, 37, 37)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDuracion)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDirector)
                    .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblResumen))
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(LblGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CmbGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 490, 480));

        PanelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("BOTONES"));

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_4219.png"))); // NOI18N
        BtnBajas.setText("BAJAS");
        BtnBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajasActionPerformed(evt);
            }
        });

        BtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemdefault_103452.png"))); // NOI18N
        BtnConfirmar.setText("CONFIRMAR");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSalir)
                    .addComponent(BtnBajas))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 510, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.PanelBotones.setVisible(true);
        this.PanelDatos.setVisible(true);
        String peli = this.CmbPeliculas.getSelectedItem().toString();
        pl.BuscarPeli(peli);
        this.TxtTituloPeli.setText(pl.getTitPeli());
        this.TxtAño.setText(pl.getAño());
        this.TxtDuracion.setText(pl.getDuracion());
        this.TxtDirector.setText(pl.getDirector());
        this.TxtResumen.setText(pl.getResumen());
        this.CmbGen.setSelectedItem(pl.getTipogen());
        
        this.TxtTituloPeli.setEditable(false);
        this.TxtAño.setEditable(false);
        this.TxtDuracion.setEditable(false);
        this.TxtDirector.setEditable(false);
        this.TxtResumen.setEditable(false);
        this.CmbGen.setEnabled(false);
        
        this.BtnConfirmar.setVisible(false);
        this.BtnBajas.setVisible(true);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.TxtTituloPeli.setEditable(true);
        this.TxtAño.setEditable(true);
        this.TxtDuracion.setEditable(true);
        this.TxtDirector.setEditable(true);
        this.TxtResumen.setEditable(true);
        this.CmbGen.setEnabled(true);
        
        this.BtnBajas.setVisible(false);
        this.BtnConfirmar.setVisible(true);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        pl.setTitPeli(this.TxtTituloPeli.getText().toUpperCase());
        pl.setAño(this.TxtAño.getText().toUpperCase());
        pl.setDuracion(this.TxtDuracion.getText().toUpperCase());
        pl.setDirector(this.TxtDirector.getText().toUpperCase());
        pl.setResumen(this.TxtResumen.getText());
        
        String nomgen = (this.CmbGen.getSelectedItem().toString());
        sc.BuscarCodGenporTipo(nomgen);
        int codplan = sc.getCodGen();
        pl.setCodGen(codplan);
        
        try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? ");
            if (valor == 0) {
                pl.Modif(this.CmbPeliculas.getSelectedItem().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        }
        
        this.CmbPeliculas.removeAllItems();
        this.CmbPeliculas.setModel(Cg.MostrarCombos(3));
        this.PanelDatos.setVisible(false);
        this.PanelBotones.setVisible(false);

        
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajasActionPerformed
        try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? Este proceso no se puede revertir");
            if (valor == 0) {
                pl.Bajas(this.CmbPeliculas.getSelectedItem().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        }
        this.CmbPeliculas.removeAllItems();
        this.CmbPeliculas.setModel(Cg.MostrarCombos(3));
        this.PanelDatos.setVisible(false);
        this.PanelBotones.setVisible(false);

    }//GEN-LAST:event_BtnBajasActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBajas;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CmbGen;
    private javax.swing.JComboBox<String> CmbPeliculas;
    private javax.swing.JLabel LblAño;
    private javax.swing.JLabel LblDirector;
    private javax.swing.JLabel LblDuracion;
    private javax.swing.JLabel LblGenero;
    private javax.swing.JLabel LblGenero1;
    private javax.swing.JLabel LblResumen;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblTituloPeli;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JTextField TxtAño;
    private javax.swing.JTextField TxtDirector;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextArea TxtResumen;
    private javax.swing.JTextField TxtTituloPeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
