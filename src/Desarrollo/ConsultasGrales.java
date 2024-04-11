
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultasGrales {

    private int CodGen;
    private String Gen;
    
    // atributos para series y pelis
    private String TitSerie;
    private String Año;
    private String Duracion;
    private String Director;
    private String Resumen;
    private String TitPeli;

    //atributos planes
    private int CodPlan;
    private String Plan;
    private String Pago;
    
    //atributos socios
    private String nom;
    private String usu;
    private String pass;
    private String mail;
    private Date fecha;
    
    //atributos fechas
    private Date fechaini;
    private Date fechafin;
    
    public ConsultasGrales() {
        
    }

    
    
    public void setCodGen(int CodGen) {
        this.CodGen = CodGen;
    }

    public void setGen(String Gen) {
        this.Gen = Gen;
    }
    
    public void setTitSerie(String TitSerie) {
        this.TitSerie = TitSerie;
    }

    public void setTitPeli(String TitPeli) {
        this.TitPeli = TitPeli;
    }

    
    public void setAño(String Año) {
        this.Año = Año;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    public void setCodPlan(int CodPlan) {
        this.CodPlan = CodPlan;
    }

    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    
    
    PreparedStatement Ps;
    ResultSet Rs;
    Conexion obj = new Conexion ();
    
    DefaultTableModel objx;
    String [] vectit = {};
    String [] [] matdatos = {};
    
    
     //metodos
   
    
    public DefaultTableModel Titulo (int tipoFormulario) {
       
        switch (tipoFormulario) {
            case 1:
                String [] vectitListaGeneros = {"CODIGO", "GENERO DE PELICULAS Y SERIES"};
                vectit = Arrays.copyOf(vectitListaGeneros, vectitListaGeneros.length);
                break;
            case 2:
                String [] vectitTablaPelis = {"TITULO", "AÑO", "DURACION", "DIRECTOR", "RESUMEN", "GENERO"};
                vectit = Arrays.copyOf(vectitTablaPelis, vectitTablaPelis.length);
                break;
            case 3:
                String [] vectitTablaPlan = {"CODIGO", "TIPO DE PLAN", "FORMA DE PAGO"};
                vectit = Arrays.copyOf(vectitTablaPlan, vectitTablaPlan.length);
                break;    
            case 4 :
                String [] vectitTablaSocios = {"NOMBRE", "USUARIO", "PASSWORD", "EMAIL", "FECHA DE SUSCRIPCION", "TIPO DE PLAN", "ULTIMA SERIE VISTA", "ULTIMA PELICULA VISTA", "GENERO FAVORITO" };
                vectit = Arrays.copyOf(vectitTablaSocios, vectitTablaSocios.length);
                break;  
            case 5:   
                String [] vectitTablaSeries = {"TITULO", "AÑO", "TEMPORADAS", "CAPITULOS", "RESUMEN", "GENERO"};
                vectit = Arrays.copyOf(vectitTablaSeries, vectitTablaSeries.length);
                break;
            case 6:
                String [] vectitFechas = {"NOMBRE", "USUARIO", "FECHA DE SUSCRIPCION"};
                vectit = Arrays.copyOf(vectitFechas, vectitFechas.length);
                break;
            case 7:
                String [] vectitPlanes = {"NOMBRE", "USUARIO", "TIPO DE PLAN"};
                vectit = Arrays.copyOf(vectitPlanes, vectitPlanes.length);
                break;
            case 8:
                String [] vectitGeneros = {"NOMBRE", "USUARIO", "GENERO FAVORITO"};
                vectit = Arrays.copyOf(vectitGeneros, vectitGeneros.length);
                break;
             
        }
        
         objx= new DefaultTableModel(matdatos,vectit);
        return objx;
    }
    
    public DefaultTableModel Mostrar(int tipoFormulario){
        String MostrarSql = "";
        objx.setRowCount(0);
        switch (tipoFormulario) {
            case 1:
                String ListaGeneros = "select idgenero, tipogen from genero;";
                MostrarSql = ListaGeneros;
                break;
            case 2:
                String ListaSeries = "select ser.titulo, ser.anio, ser.duracion, ser.director, ser.resumen, gen.tipogen from series as ser inner join genero as gen on ser.genero_idgenero = gen.idgenero;";
                MostrarSql = ListaSeries;
                break;    
            case 3:
                String ListaPelis = "select pel.titulo, pel.anio, pel.duracion, pel.director, pel.resumen, gen.tipogen from peliculas as pel inner join genero as gen on pel.genero_idgenero = gen.idgenero;";
                MostrarSql = ListaPelis;
                break;   
            case 4:
                String ListaPlan = "select idplan, tipoplan, formapago from plan;";
                MostrarSql = ListaPlan;
                break;      
            case 5:
                String ListaSocios = "select soc.nom, soc.usuario, soc.pass, soc.email, soc.fechasuscrip, pl.tipoplan, ser.titulo, pel.titulo, gen.tipogen from socios as soc inner join plan as pl on soc.plan_idplan = pl.idplan inner join series as ser on soc.series_idseries = ser.idseries inner join peliculas as pel on soc.peliculas_idpeli = pel.idpeli inner join genero as gen on soc.genero_idgenero = gen.idgenero;";
                MostrarSql = ListaSocios;
                break;   
            case 6:
                String ListaFechas = "select nom, usuario, fechasuscrip from socios where fechasuscrip between '"+fechaini+"' and '"+fechafin+"' " ;
                MostrarSql = ListaFechas;
                break;  
            case 7:
                String ListaPlanSusc = "select soc.nom, soc.usuario, pl.tipoplan from socios as soc inner join plan as pl on soc.plan_idplan = pl.idplan where pl.tipoplan = '"+Plan+"' " ;
                MostrarSql = ListaPlanSusc;
                break; 
            case 8:
                String ListaGenFav = "select soc.nom, soc.usuario, gen.tipogen from socios as soc inner join genero as gen on soc.genero_idgenero = gen.idgenero where gen.tipogen = '"+Gen+"' " ;
                MostrarSql = ListaGenFav;
                break; 
                
        }
        
     try {
           Ps = obj.MeConecto().prepareStatement(MostrarSql);
           Rs = Ps.executeQuery();
           Object [] vectorfila = {};
           while (Rs.next()) {
                switch (tipoFormulario){
                case 1:
                    this.setCodGen(Rs.getInt(1));
                    this.setGen(Rs.getString(2));
                    Object [] vectorfilaGen = {this.CodGen, this.Gen};
                    vectorfila = Arrays.copyOf(vectorfilaGen, vectorfilaGen.length);
                    break;   
                case 2:
                    this.setTitSerie(Rs.getString(1));
                    this.setAño(Rs.getString(2));
                    this.setDuracion(Rs.getString(3));
                    this.setDirector(Rs.getString(4));
                    this.setResumen(Rs.getString(5));
                    this.setGen(Rs.getString(6));
                    Object [] vectorfilaSerie = {this.TitSerie, this.Año, this.Duracion, this.Director, this.Resumen, this.Gen};
                    vectorfila = Arrays.copyOf(vectorfilaSerie, vectorfilaSerie.length);
                    break; 
                case 3:
                    this.setTitPeli(Rs.getString(1));
                    this.setAño(Rs.getString(2));
                    this.setDuracion(Rs.getString(3));
                    this.setDirector(Rs.getString(4));
                    this.setResumen(Rs.getString(5));
                    this.setGen(Rs.getString(6));
                    Object [] vectorfilaPeli = {this.TitPeli, this.Año, this.Duracion, this.Director, this.Resumen, this.Gen};
                    vectorfila = Arrays.copyOf(vectorfilaPeli, vectorfilaPeli.length);
                    break; 
                case 4:
                    this.setCodPlan(Rs.getInt(1));
                    this.setPlan(Rs.getString(2));
                    this.setPago(Rs.getString(3));
                    Object [] vectorfilaPlan = {this.CodPlan, this.Plan, this.Pago};
                    vectorfila = Arrays.copyOf(vectorfilaPlan, vectorfilaPlan.length);
                    break;   
                case 5:
                    this.setNom(Rs.getString(1));
                    this.setUsu(Rs.getString(2));
                    this.setPass(Rs.getString(3));
                    this.setMail(Rs.getString(4));
                    this.setFecha(Rs.getDate(5));
                    this.setPlan(Rs.getString(6));
                    this.setTitSerie(Rs.getString(7));
                    this.setTitPeli(Rs.getString(8));
                    this.setGen(Rs.getString(9));
                    Object [] vectorfilaSocio = {this.nom, this.usu, this.pass, this.mail, this.fecha, this.Plan, this.TitSerie, this.TitPeli, this.Gen};
                    vectorfila = Arrays.copyOf(vectorfilaSocio, vectorfilaSocio.length);
                    break; 
                case 6:
                    this.setNom(Rs.getString(1));
                    this.setUsu(Rs.getString(2));       
                    this.setFecha(Rs.getDate(3));
                    Object [] vectorfilaFecha = {this.nom, this.usu, this.fecha};
                    vectorfila = Arrays.copyOf(vectorfilaFecha, vectorfilaFecha.length);
                    break; 
                case 7:
                    this.setNom(Rs.getString(1));
                    this.setUsu(Rs.getString(2));
                    this.setPlan(Rs.getString(3));
                    Object [] ListaPlanSusc = {this.nom, this.usu, this.Plan};
                    vectorfila = Arrays.copyOf(ListaPlanSusc, ListaPlanSusc.length);
                    break;  
                case 8:
                    this.setNom(Rs.getString(1));
                    this.setUsu(Rs.getString(2));
                    this.setGen(Rs.getString(3));
                    Object [] ListaGenFav = {this.nom, this.usu, this.Gen};
                    vectorfila = Arrays.copyOf(ListaGenFav, ListaGenFav.length);
                    break;  
                    
                }   
                
            objx.addRow(vectorfila);    
            
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no puede mostrar los datos");
            System.out.println(e);
            
        }
        return objx;      
           
     }
    
    public DefaultComboBoxModel MostrarCombos (int tipoCombo) {
        String MostrarSql = "";
        switch (tipoCombo) {           
            case 1:
               String ComboPlan = "select tipoplan from plan";
               MostrarSql = ComboPlan;
               break;     
            case 2:
               String ComboSerie = "select titulo from series";
               MostrarSql = ComboSerie;
               break;  
            case 3:   
               String ComboPelis = "select titulo from peliculas";
               MostrarSql = ComboPelis;
               break;
            case 4:   
               String ComboGenero = "select tipogen from genero";
               MostrarSql = ComboGenero;
               break; 
            case 5: 
               String ComboUsuario= "select usuario from socios";
               MostrarSql = ComboUsuario;
               break; 
        }  
        DefaultComboBoxModel objLista = new DefaultComboBoxModel ();
        try {
            Ps = obj.MeConecto().prepareStatement(MostrarSql);
            Rs = Ps.executeQuery();
            
            while (Rs.next()){
                objLista.addElement(Rs.getString(1));    
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR AL MOSTRAR LOS COMBOS");
        }
        
        return objLista;
    }    
}
