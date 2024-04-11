
package Formulario;

import Desarrollo.Genero;
import Desarrollo.Series;
import javax.swing.JOptionPane;

public class FrmSeries extends javax.swing.JInternalFrame {
Genero gen = new Genero ();
    
    public FrmSeries() {
        initComponents();
        this.LblTitulo.setText("ALTAS DE SERIES ");
        this.LstGenero.setModel(gen.MostrarGeneros()); //desplega lista de generos 
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblResumen = new javax.swing.JLabel();
        LblTituloSerie = new javax.swing.JLabel();
        LblAño = new javax.swing.JLabel();
        LblDuracion = new javax.swing.JLabel();
        LblDirector = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtResumen = new javax.swing.JTextArea();
        LblGenero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LstGenero = new javax.swing.JList<>();
        BtnCargar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        TxtTitSerie = new javax.swing.JTextField();
        TxtAño = new javax.swing.JTextField();
        TxtDuracion = new javax.swing.JTextField();
        TxtDirector = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(167, 116, 116));

        LblTitulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        LblResumen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblResumen.setText("RESUMEN");
        getContentPane().add(LblResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, 20));

        LblTituloSerie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblTituloSerie.setText("TITULO");
        getContentPane().add(LblTituloSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 20));

        LblAño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblAño.setText("AÑO");
        getContentPane().add(LblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, 20));

        LblDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblDuracion.setText("TEMPORADAS ");
        getContentPane().add(LblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 20));

        LblDirector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblDirector.setText("CAPITULOS");
        getContentPane().add(LblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 20));

        TxtResumen.setColumns(20);
        TxtResumen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TxtResumen.setRows(5);
        TxtResumen.setToolTipText("");
        jScrollPane1.setViewportView(TxtResumen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 400, 170));

        LblGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblGenero.setText("GENERO");
        getContentPane().add(LblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 140, 70, 20));

        LstGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(LstGenero);

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

        TxtTitSerie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtAño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TxtDirector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCargar)
                .addGap(45, 45, 45)
                .addComponent(BtnSalir)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTitSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtTitSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargar)
                    .addComponent(BtnSalir))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        if (this.TxtTitSerie.getText().isEmpty() || this.TxtAño.getText().isEmpty() || this.TxtDuracion.getText().isEmpty()
           || this.TxtDirector.getText().isEmpty() ) {
           JOptionPane.showMessageDialog(null, " ERROR, DEBE LLENAR LOS DATOS CORRESPONDIENTES");   
        } else {
            String titserie = this.TxtTitSerie.getText().toUpperCase();
            String año = this.TxtAño.getText().toUpperCase();
            String durac = this.TxtDuracion.getText().toUpperCase();
            String dire = this.TxtDirector.getText().toUpperCase();
            String resum = this.TxtResumen.getText();
            
            //tomar el nombre del genero y buscar su codigo en la tabla GENERO
            String NomGen = this.LstGenero.getSelectedValue();
            boolean existe = gen.BuscarCodGenporTipo(NomGen);
            if (existe == true){
                 // pasar el codigo del genero elegido a la variable CodGen
                int CodGen = gen.getCodGen();
                Series se = new Series(titserie, año, durac, dire, resum, CodGen);
                se.Altas();                
                JOptionPane.showMessageDialog(null, "SE HAN CARGADO TODOS LOS VALORES CORRECTAMENTE ");
                Limpiar();
            }    
        }
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnSalirActionPerformed
    
    private void Limpiar () {
        TxtTitSerie.setText(null);
        TxtAño.setText(null);
        TxtDuracion.setText(null);
        TxtDirector.setText(null);
        TxtResumen.setText(null);
        LstGenero.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblAño;
    private javax.swing.JLabel LblDirector;
    private javax.swing.JLabel LblDuracion;
    private javax.swing.JLabel LblGenero;
    private javax.swing.JLabel LblResumen;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblTituloSerie;
    private javax.swing.JList<String> LstGenero;
    private javax.swing.JTextField TxtAño;
    private javax.swing.JTextField TxtDirector;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextArea TxtResumen;
    private javax.swing.JTextField TxtTitSerie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
