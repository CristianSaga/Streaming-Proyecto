
package Formulario;

import Desarrollo.Genero;
import Desarrollo.Peliculas;
import javax.swing.JOptionPane;

public class FrmPeliculas extends javax.swing.JInternalFrame {
Genero gen = new Genero ();
    public FrmPeliculas() {
        initComponents();
        this.LblTitulo.setText("ALTAS DE PELICULAS");
        this.LstGenero.setModel(gen.MostrarGeneros());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblGenero = new javax.swing.JLabel();
        LblTituloPeli = new javax.swing.JLabel();
        TxtTitPeli = new javax.swing.JTextField();
        LblAño = new javax.swing.JLabel();
        TxtAño = new javax.swing.JTextField();
        LblDuracion = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        LblDirector = new javax.swing.JLabel();
        TxtDirector = new javax.swing.JTextField();
        LblResumen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtResumen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        LstGenero = new javax.swing.JList<>();
        BtnCargar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1036, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 66, 112));

        LblTitulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        LblGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblGenero.setText("GENERO");

        LblTituloPeli.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblTituloPeli.setText("TITULO");

        TxtTitPeli.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblAño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblAño.setText("AÑO");

        TxtAño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblDuracion.setText("DURACION");

        TxtDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblDirector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblDirector.setText("DIRECTOR");

        TxtDirector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LblResumen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LblResumen.setText("RESUMEN");

        TxtResumen.setColumns(20);
        TxtResumen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TxtResumen.setRows(5);
        TxtResumen.setToolTipText("");
        jScrollPane1.setViewportView(TxtResumen);

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
        BtnSalir.setText("SALIDA");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblTituloPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtTitPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir)
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(LblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblTituloPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTitPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargar)
                    .addComponent(BtnSalir))
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1020, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        if (this.TxtTitPeli.getText().isEmpty() || this.TxtAño.getText().isEmpty() || this.TxtDuracion.getText().isEmpty()
           || this.TxtDirector.getText().isEmpty() ) {
           JOptionPane.showMessageDialog(null, " ERROR, DEBE LLENAR LOS DATOS CORRESPONDIENTES");   
        } else {
            String titpeli = this.TxtTitPeli.getText().toUpperCase();
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
                Peliculas pe = new Peliculas(titpeli, año, durac, dire, resum, CodGen);
                pe.Altas();                
                JOptionPane.showMessageDialog(null, "SE HAN CARGADO TODOS LOS VALORES CORRECTAMENTE ");
                limpiar ();
            }    
        }
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnSalirActionPerformed

     private void limpiar () {
        TxtTitPeli.setText(null);
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
    private javax.swing.JLabel LblTituloPeli;
    private javax.swing.JList<String> LstGenero;
    private javax.swing.JTextField TxtAño;
    private javax.swing.JTextField TxtDirector;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextArea TxtResumen;
    private javax.swing.JTextField TxtTitPeli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
