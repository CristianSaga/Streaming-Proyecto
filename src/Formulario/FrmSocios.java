
package Formulario;

import Desarrollo.ConsultasGrales;
import Desarrollo.Socios;
import Desarrollo.Validacion;
import java.util.Date;

import javax.swing.JOptionPane;
public class FrmSocios extends javax.swing.JInternalFrame {
ConsultasGrales Cg = new ConsultasGrales();
Socios sc = new Socios ();

    public FrmSocios() {
        initComponents();
        this.LblTitulo.setText("ALTAS DE SOCIOS");
        this.CmbPlan.setModel(Cg.MostrarCombos(1));
        this.CmbSerie.setModel(Cg.MostrarCombos(2));
        this.CmbPeli.setModel(Cg.MostrarCombos(3));
        this.CmbGenero.setModel(Cg.MostrarCombos(4));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        BtnCargar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 107, 160));

        LblTitulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        LblTitulo.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        TxtMail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblNom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblNom.setText("NOMBRE");

        TxtNom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

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

        DateFecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DateFecha.setMaxSelectableDate(new java.util.Date(1735704109000L));
        DateFecha.setMinSelectableDate(new java.util.Date(946699309000L));

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

        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemdefault_103452.png"))); // NOI18N
        BtnCargar.setText("CARGAR DATOS");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblPass, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblNom, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblMail, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LblPeli, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(BtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CmbPeli, 0, 237, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CmbPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 560, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        if (this.TxtNom.getText().isEmpty() || this.TxtUsu.getText().isEmpty() || this.TxtPass.getText().isEmpty() || this.TxtMail.getText().isEmpty() || this.DateFecha.getDate() == null  ) {
            JOptionPane.showMessageDialog(null, "ERROR, TIENE QUE COMPLETAR TODOS LOS DATOS ");
        } else {
            String nom = this.TxtNom.getText().toUpperCase();
            String usu = this.TxtUsu.getText().toUpperCase();
            String pass = this.TxtPass.getText().toUpperCase();
            String mail = this.TxtMail.getText().toUpperCase();
            Date fecha = this.DateFecha.getDate();
            java.sql.Date fechaSql = ConvertirASql (fecha);
            String plan = this.CmbPlan.getSelectedItem().toString();
            String serie = this.CmbSerie.getSelectedItem().toString();
            String peli = this.CmbPeli.getSelectedItem().toString();
            String gen = this.CmbGenero.getSelectedItem().toString();
            
            sc.BuscarCodPlanPorNom(plan);
            int codplan = sc.getCodplan();
            sc.BuscarCodSeriePorNom(serie);
            int codserie = sc.getCodserie();
            sc.BuscarCodPeliPorNom(peli);
            int codpeli = sc.getCodpeli();
            sc.BuscarCodGenporTipo(gen);
            int codgen = sc.getCodGen();
            
            Socios sc = new Socios (nom,usu,pass,mail,fechaSql,codplan,codserie,codpeli,codgen);
            sc.Altas();
            JOptionPane.showMessageDialog(null, "SE HAN CARGADO TODOS LOS VALORES CORRECTAMENTE "); 
            limpiar ();
        }
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        Validacion.SoloLetras(evt);
    }//GEN-LAST:event_TxtNomKeyTyped

    
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
       this.DateFecha.setCalendar(null);
       this.CmbPlan.setSelectedIndex(0);
       this.CmbSerie.setSelectedIndex(0);
       this.CmbPeli.setSelectedIndex(0);
       this.CmbGenero.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CmbGenero;
    private javax.swing.JComboBox<String> CmbPeli;
    private javax.swing.JComboBox<String> CmbPlan;
    private javax.swing.JComboBox<String> CmbSerie;
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
    private javax.swing.JTextField TxtMail;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtPass;
    private javax.swing.JTextField TxtUsu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
