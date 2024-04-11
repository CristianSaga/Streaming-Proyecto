
package Formulario;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        OpcAltaUsu = new javax.swing.JMenuItem();
        OpcModifUsuarios = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        OpcAltaPelis = new javax.swing.JMenuItem();
        OpcModifPelis = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        OpcAltasSerie = new javax.swing.JMenuItem();
        OpcModifSeries = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        OpcAltaPlanes = new javax.swing.JMenuItem();
        MenuGeneros = new javax.swing.JMenu();
        OpcAltasGen = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        OpcBddSerie = new javax.swing.JMenuItem();
        OpcBddPelis = new javax.swing.JMenuItem();
        OpcBddUsu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        OpcConsFecha = new javax.swing.JMenuItem();
        OpcConsPlan = new javax.swing.JMenuItem();
        OpcConsGenero = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(102, 102, 255));
        Escritorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_icon-icons.com_57997.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("USUARIOS");

        OpcAltaUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addnewdocument_118445.png"))); // NOI18N
        OpcAltaUsu.setMnemonic('o');
        OpcAltaUsu.setText("ALTAS");
        OpcAltaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAltaUsuActionPerformed(evt);
            }
        });
        fileMenu.add(OpcAltaUsu);

        OpcModifUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        OpcModifUsuarios.setMnemonic('s');
        OpcModifUsuarios.setText("MODIFICACION Y BAJAS");
        OpcModifUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcModifUsuariosActionPerformed(evt);
            }
        });
        fileMenu.add(OpcModifUsuarios);

        menuBar.add(fileMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/movies_icon_159164.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("PELICULAS");

        OpcAltaPelis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addnewdocument_118445.png"))); // NOI18N
        OpcAltaPelis.setMnemonic('c');
        OpcAltaPelis.setText("ALTAS");
        OpcAltaPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAltaPelisActionPerformed(evt);
            }
        });
        helpMenu.add(OpcAltaPelis);

        OpcModifPelis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        OpcModifPelis.setMnemonic('a');
        OpcModifPelis.setText("MODIFICACION Y BAJAS");
        OpcModifPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcModifPelisActionPerformed(evt);
            }
        });
        helpMenu.add(OpcModifPelis);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Movies_theapplication_3299.png"))); // NOI18N
        jMenu1.setText("SERIES");

        OpcAltasSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addnewdocument_118445.png"))); // NOI18N
        OpcAltasSerie.setText("ALTAS");
        OpcAltasSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAltasSerieActionPerformed(evt);
            }
        });
        jMenu1.add(OpcAltasSerie);

        OpcModifSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_modify_icon_149489.png"))); // NOI18N
        OpcModifSeries.setText("MODIFICACION Y BAJAS");
        OpcModifSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcModifSeriesActionPerformed(evt);
            }
        });
        jMenu1.add(OpcModifSeries);

        menuBar.add(jMenu1);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/netflix_black_logo_icon_147104.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("PLAN");

        OpcAltaPlanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addnewdocument_118445.png"))); // NOI18N
        OpcAltaPlanes.setMnemonic('t');
        OpcAltaPlanes.setText("ALTAS, MODIF. Y BAJAS");
        OpcAltaPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAltaPlanesActionPerformed(evt);
            }
        });
        editMenu.add(OpcAltaPlanes);

        menuBar.add(editMenu);

        MenuGeneros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cinema_website_videos_films_multimedia_icon_190769.png"))); // NOI18N
        MenuGeneros.setText("GENEROS");

        OpcAltasGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addnewdocument_118445.png"))); // NOI18N
        OpcAltasGen.setText("ALTAS. MODIF. Y BAJAS");
        OpcAltasGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAltasGenActionPerformed(evt);
            }
        });
        MenuGeneros.add(OpcAltasGen);

        menuBar.add(MenuGeneros);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/data_storage_database_icon_194717.png"))); // NOI18N
        jMenu2.setText("BASE DE DATOS (TABLAS)");

        OpcBddSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1491253669-6document-report_82892.png"))); // NOI18N
        OpcBddSerie.setText("TABLA SERIES");
        OpcBddSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBddSerieActionPerformed(evt);
            }
        });
        jMenu2.add(OpcBddSerie);

        OpcBddPelis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1491253669-6document-report_82892.png"))); // NOI18N
        OpcBddPelis.setText("TABLA PELIS");
        OpcBddPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBddPelisActionPerformed(evt);
            }
        });
        jMenu2.add(OpcBddPelis);

        OpcBddUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1491253669-6document-report_82892.png"))); // NOI18N
        OpcBddUsu.setText("TABLA USUARIOS");
        OpcBddUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBddUsuActionPerformed(evt);
            }
        });
        jMenu2.add(OpcBddUsu);

        menuBar.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo-social-web-network-internet_340_icon-icons.com_61497.png"))); // NOI18N
        jMenu4.setText("CONSULTAS");

        OpcConsFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_property-48_45043.png"))); // NOI18N
        OpcConsFecha.setText("CONSULTA ENTRE FECHAS DE SUSCRIPCION");
        OpcConsFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcConsFechaActionPerformed(evt);
            }
        });
        jMenu4.add(OpcConsFecha);

        OpcConsPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_property-48_45043.png"))); // NOI18N
        OpcConsPlan.setText("CONSULTA ENTRE PLANES DE SUSCRIPCION");
        OpcConsPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcConsPlanActionPerformed(evt);
            }
        });
        jMenu4.add(OpcConsPlan);

        OpcConsGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_property-48_45043.png"))); // NOI18N
        OpcConsGenero.setText("CONSULTA PARA GENEROS FAVORITOS");
        OpcConsGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcConsGeneroActionPerformed(evt);
            }
        });
        jMenu4.add(OpcConsGenero);

        menuBar.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alerttriangleoutline_110836.png"))); // NOI18N
        jMenu3.setText("SALIDA");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcAltasGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAltasGenActionPerformed
        FrmGenero menu = new FrmGenero ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcAltasGenActionPerformed

    private void OpcAltasSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAltasSerieActionPerformed
        FrmSeries menu = new FrmSeries ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcAltasSerieActionPerformed

    private void OpcBddSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBddSerieActionPerformed
        FrmTabSeries menu = new FrmTabSeries ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcBddSerieActionPerformed

    private void OpcAltaPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAltaPelisActionPerformed
        FrmPeliculas menu = new FrmPeliculas ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcAltaPelisActionPerformed

    private void OpcBddPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBddPelisActionPerformed
        FrmTabPeliculas menu = new FrmTabPeliculas ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcBddPelisActionPerformed

    private void OpcAltaPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAltaPlanesActionPerformed
        FrmTipoPlan menu = new FrmTipoPlan ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcAltaPlanesActionPerformed

    private void OpcAltaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAltaUsuActionPerformed
        FrmSocios menu = new FrmSocios ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcAltaUsuActionPerformed

    private void OpcBddUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBddUsuActionPerformed
        FrmTabSocios menu = new FrmTabSocios ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcBddUsuActionPerformed

    private void OpcModifPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcModifPelisActionPerformed
        FrmModifPeliculas menu = new FrmModifPeliculas ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcModifPelisActionPerformed

    private void OpcModifSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcModifSeriesActionPerformed
        FrmModifSeries menu = new FrmModifSeries ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcModifSeriesActionPerformed

    private void OpcModifUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcModifUsuariosActionPerformed
        FrmModifSocios menu = new FrmModifSocios ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcModifUsuariosActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void OpcConsFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcConsFechaActionPerformed
        FrmConsultaFecha menu = new FrmConsultaFecha ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcConsFechaActionPerformed

    private void OpcConsPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcConsPlanActionPerformed
        FrmConsultaPlan menu = new FrmConsultaPlan ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcConsPlanActionPerformed

    private void OpcConsGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcConsGeneroActionPerformed
        FrmConsultaGenero menu = new FrmConsultaGenero ();
        Escritorio.add(menu);
        menu.show();
    }//GEN-LAST:event_OpcConsGeneroActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu MenuGeneros;
    private javax.swing.JMenuItem OpcAltaPelis;
    private javax.swing.JMenuItem OpcAltaPlanes;
    private javax.swing.JMenuItem OpcAltaUsu;
    private javax.swing.JMenuItem OpcAltasGen;
    private javax.swing.JMenuItem OpcAltasSerie;
    private javax.swing.JMenuItem OpcBddPelis;
    private javax.swing.JMenuItem OpcBddSerie;
    private javax.swing.JMenuItem OpcBddUsu;
    private javax.swing.JMenuItem OpcConsFecha;
    private javax.swing.JMenuItem OpcConsGenero;
    private javax.swing.JMenuItem OpcConsPlan;
    private javax.swing.JMenuItem OpcModifPelis;
    private javax.swing.JMenuItem OpcModifSeries;
    private javax.swing.JMenuItem OpcModifUsuarios;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
