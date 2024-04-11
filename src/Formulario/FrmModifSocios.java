
package Formulario;

import Desarrollo.ConsultasGrales;
import Desarrollo.Socios;
import Desarrollo.Validacion;
import java.util.Date;

import javax.swing.JOptionPane;
public class FrmModifSocios extends javax.swing.JInternalFrame {
ConsultasGrales Cg = new ConsultasGrales();
Socios sc = new Socios ();

    public FrmModifSocios() {
        initComponents();
        this.LblTitulo.setText("MODIFICACIONES Y BAJAS DE SOCIOS");
        this.CmbPlan.setModel(Cg.MostrarCombos(1));
        this.CmbSerie.setModel(Cg.MostrarCombos(2));
        this.CmbPeli.setModel(Cg.MostrarCombos(3));
        this.CmbGenero.setModel(Cg.MostrarCombos(4));
        this.PanelDatos.setVisible(false);
        this.PanelBotones.setVisible(false);
        this.CmbUsuarios.setModel(Cg.MostrarCombos(5));
        this.BtnConfirmar.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CmbUsuarios = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        PanelDatos = new javax.swing.JPanel();
        TxtMail = new javax.swing.JTextField();
        LblNom = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        LblPass = new javax.swing.JLabel();
        LblUsu = new javax.swing.JLabel();
        TxtUsu = new javax.swing.JTextField();
        LblMail = new javax.swing.JLabel();
        TxtPass = new javax.swing.JTextField();
        LblFecha = new javax.swing.JLabel();
        DateFecha = new com.toedter.calendar.JDateChooser();
        LblPlan = new javax.swing.JLabel();
        CmbPlan = new javax.swing.JComboBox<>();
        LblPeli = new javax.swing.JLabel();
        LblSerie = new javax.swing.JLabel();
        CmbPeli = new javax.swing.JComboBox<>();
        CmbSerie = new javax.swing.JComboBox<>();
        LblGenero = new javax.swing.JLabel();
        CmbGenero = new javax.swing.JComboBox<>();
        PanelBotones = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnBajas = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("BUSCAR POR USUARIO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 30, -1, -1));

        CmbUsuarios.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(CmbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 27, 233, -1));

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 59, 233, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 150));

        PanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtMail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblNom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblNom.setText("NOMBRE");

        TxtNom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblPass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblPass.setText("PASSWORD");

        LblUsu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblUsu.setText("USUARIO");

        TxtUsu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblMail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblMail.setText("EMAIL");

        TxtPass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblFecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblFecha.setText("FECHA DE SUSCRIPCION");

        LblPlan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblPlan.setText("TIPO DE PLAN");

        CmbPlan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblPeli.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblPeli.setText("ULTIMA PELICULA VISTA");

        LblSerie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblSerie.setText("ULTIMA SERIE VISTA");

        CmbPeli.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbPeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CmbSerie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblGenero.setText("GENERO FAVORITO");

        CmbGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbPeli, 0, 237, Short.MAX_VALUE)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(TxtUsu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(TxtPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(DateFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbPlan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbSerie, 0, 237, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(746, 746, 746))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CmbPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 540, 550));

        PanelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("BOTONES"));

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
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

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 550, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.TxtNom.setEditable(true);
        this.TxtUsu.setEditable(true);
        this.TxtPass.setEditable(true);
        this.TxtMail.setEditable(true);
        this.DateFecha.setEnabled(true);
        this.CmbPlan.setEnabled(true);
        this.CmbSerie.setEnabled(true);
        this.CmbPeli.setEnabled(true);
        this.CmbGenero.setEnabled(true); 
        this.BtnBajas.setVisible(false);
        this.BtnConfirmar.setVisible(true);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.PanelDatos.setVisible(true);
        this.PanelBotones.setVisible(true);
        String usuario = this.CmbUsuarios.getSelectedItem().toString();
        sc.BuscarUsuario(usuario);
        this.TxtNom.setText(sc.getNom());
        this.TxtUsu.setText(sc.getUsu());
        this.TxtPass.setText(sc.getPass());
        this.TxtMail.setText(sc.getEmail());
        this.DateFecha.setDate(sc.getFechasus());
        this.CmbPlan.setSelectedItem(sc.getTipoplan());
        this.CmbSerie.setSelectedItem(sc.getSerie());
        this.CmbPeli.setSelectedItem(sc.getPeli());
        this.CmbGenero.setSelectedItem(sc.getGenero());
        
        this.TxtNom.setEditable(false);
        this.TxtUsu.setEditable(false);
        this.TxtPass.setEditable(false);
        this.TxtMail.setEditable(false);
        this.DateFecha.setEnabled(false);
        this.CmbPlan.setEnabled(false);
        this.CmbSerie.setEnabled(false);
        this.CmbPeli.setEnabled(false);
        this.CmbGenero.setEnabled(false);
        
        this.BtnBuscar.setVisible(true);
        this.BtnBajas.setVisible(true);

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        sc.setNom(this.TxtNom.getText().toUpperCase());
        sc.setUsu(this.TxtUsu.getText().toUpperCase());
        sc.setPass(this.TxtPass.getText().toUpperCase());
        sc.setEmail(this.TxtMail.getText().toUpperCase());
        Date fecha = this.DateFecha.getDate();
        java.sql.Date fechaSql = ConvertirASql (fecha);
        sc.setFechasus(fechaSql);
      
        String tipoplan = this.CmbPlan.getSelectedItem().toString();
        sc.BuscarCodPlanPorNom(tipoplan);
        int codplan = sc.getCodplan();
        sc.setCodplan(codplan);
        
        String nomserie = this.CmbSerie.getSelectedItem().toString();
        sc.BuscarCodSeriePorNom(nomserie);
        int codserie = sc.getCodserie();
        sc.setCodserie(codserie);
        
        String nompeli = this.CmbPeli.getSelectedItem().toString();
        sc.BuscarCodPeliPorNom(nompeli);
        int codpeli = sc.getCodpeli();
        sc.setCodpeli(codpeli);
        
        String nomgen = (this.CmbGenero.getSelectedItem().toString());
        sc.BuscarCodGenporTipo(nomgen);
        int codgen = sc.getCodGen();
        sc.setCodgen(codgen);
        try {
            int valor = JOptionPane.showConfirmDialog(null, "Esta Seguro? Este proceso no se puede revertir" ) ;
            if (valor == 0) {
                sc.Modif(this.CmbUsuarios.getSelectedItem().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE MODIFICAR ");
        }

        this.CmbUsuarios.removeAllItems();
        this.CmbUsuarios.setModel(Cg.MostrarCombos(5));
        this.PanelDatos.setVisible(false);
        this.PanelBotones.setVisible(false);
        this.BtnConfirmar.setVisible(false);
       
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajasActionPerformed
        try {
            int valor = JOptionPane.showConfirmDialog(this, "Esta Seguro? Este proceso no se puede revertir");
            if (valor == 0) {
                sc.Bajas(this.CmbUsuarios.getSelectedItem().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO QUIERE BORRAR ");
        }
        this.PanelDatos.setVisible(false);
        this.CmbUsuarios.removeAllItems();
        this.CmbUsuarios.setModel(Cg.MostrarCombos(5));
        this.PanelDatos.setVisible(false);
        this.PanelBotones.setVisible(false);
    }//GEN-LAST:event_BtnBajasActionPerformed

    
    private java.sql.Date ConvertirASql(java.util.Date fecha) {
        java.sql.Date SqlFechaConvertida;
        SqlFechaConvertida = new java.sql.Date(fecha.getTime()); 
        return SqlFechaConvertida;
    }
    
    private void limpiar () {
       this.TxtNom.setText(null);
       this.TxtUsu.setText(null);
       this.TxtPass.setText(null);
       this.TxtMail.setText(null);
//       this.DateFecha.
       this.CmbPlan.setSelectedIndex(0);
       this.CmbSerie.setSelectedIndex(0);
       this.CmbPeli.setSelectedIndex(0);
       this.CmbGenero.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBajas;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CmbGenero;
    private javax.swing.JComboBox<String> CmbPeli;
    private javax.swing.JComboBox<String> CmbPlan;
    private javax.swing.JComboBox<String> CmbSerie;
    private javax.swing.JComboBox<String> CmbUsuarios;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblGenero;
    private javax.swing.JLabel LblMail;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblPass;
    private javax.swing.JLabel LblPeli;
    private javax.swing.JLabel LblPlan;
    private javax.swing.JLabel LblSerie;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblUsu;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JTextField TxtMail;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtPass;
    private javax.swing.JTextField TxtUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
