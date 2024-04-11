
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Socios {
    
    //atributos
    private String nom;
    private String usu;
    private String pass;
    private String email;
    private Date fechasus;
    private int codplan;
    private int codserie;
    private int codpeli;
    private int codgen;
    
    private String tipoplan;
    private String peli;
    private String serie;
    private String genero;
    
    
    
    Conexion obj = new Conexion ();
    PreparedStatement Ps;
    ResultSet Rs;
    private String cargaDeDatos = "INSERT INTO socios (nom, usuario, pass, email, fechasuscrip, plan_idplan, series_idseries, peliculas_idpeli, genero_idgenero) VALUES (?,?,?,?,?,?,?,?,?);";
    
    //constructor

    public Socios(String nom, String usu, String pass, String email, Date fechasus, int codplan, int codserie, int codpeli, int codgen) {
        this.nom = nom;
        this.usu = usu;
        this.pass = pass;
        this.email = email;
        this.fechasus = fechasus;
        this.codplan = codplan;
        this.codserie = codserie;
        this.codpeli = codpeli;
        this.codgen = codgen;
    }

    public Socios() {
    }

    
    
    public int getCodplan() {
        return codplan;
    }

    public int getCodserie() {
        return codserie;
    }

    public int getCodpeli() {
        return codpeli;
    }

    public int getCodGen() {
        return codgen;
    }

    public String getNom() {
        return nom;
    }

    public String getUsu() {
        return usu;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechasus() {
        return fechasus;
    }

    public String getTipoplan() {
        return tipoplan;
    }

    public String getPeli() {
        return peli;
    }

    public String getSerie() {
        return serie;
    }

    public String getGenero() {
        return genero;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechasus(Date fechasus) {
        this.fechasus = fechasus;
    }

    
    
    public void setCodplan(int codplan) {
        this.codplan = codplan;
    }

    public void setCodserie(int codserie) {
        this.codserie = codserie;
    }

    public void setCodpeli(int codpeli) {
        this.codpeli = codpeli;
    }

    public void setCodgen(int codgen) {
        this.codgen = codgen;
    }

    public void setTipoplan(String tipoplan) {
        this.tipoplan = tipoplan;
    }

    public void setPeli(String peli) {
        this.peli = peli;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
    public void Altas () {
         try {
            Ps = obj.MeConecto().prepareStatement(cargaDeDatos);
            Ps.setString(1, nom);
            Ps.setString(2, usu);
            Ps.setString(3, pass);
            Ps.setString(4, email);
            Ps.setDate(5, fechasus);
            Ps.setInt(6, codplan);
            Ps.setInt(7, codserie);
            Ps.setInt(8, codpeli);
            Ps.setInt(9, codgen);
            int resultado = Ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al grabar un registro en Peliculas ");
        }
    }
    
    public boolean BuscarCodPlanPorNom (String NomPlan) {
        boolean existe = false;
        String BuscarCod = "select idplan from plan where tipoplan = '"+ NomPlan +"' ";
        try {
            Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                // el contenido de la columna fabricantes (1)
                this.setCodplan(Rs.getInt(1));
               existe = true;
            } else {   
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR NO ENCUENTRA EL CODIGO");   
        } 
        return existe;
    }    
     
    public boolean BuscarCodSeriePorNom (String NomSerie) {
        boolean existe = false;
        String BuscarCod = "select idseries from series where titulo = '"+ NomSerie +"' ";
        try {
            Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setCodserie(Rs.getInt(1));
               existe = true;
            } else {   
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR NO ENCUENTRA EL CODIGO");   
        } 
        return existe;
    }     
    
    public boolean BuscarCodPeliPorNom (String NomPeli) {
        boolean existe = false;
        String BuscarCod = "select idpeli from peliculas where titulo = '"+ NomPeli +"' ";
        try {
            Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setCodpeli(Rs.getInt(1));
               existe = true;
            } else {   
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR NO ENCUENTRA EL CODIGO");   
        } 
        return existe;
    }
    
    public boolean BuscarCodGenporTipo (String TipoGen) {
        boolean existe = false;
        String BuscarCod = "select idgenero from genero where tipogen = '"+ TipoGen +"' ";
        try {
            Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                // el contenido de la columna fabricantes (1)
                this.setCodgen(Rs.getInt(1));
                existe = true;
            } else {
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR NO ENCUENTRA EL CODIGO");
            
        }
        return existe;
    }    
    
     public boolean BuscarUsuario (String usuario) {
        boolean existe = false;
        String usu = "select soc.nom, soc.usuario, soc.pass, soc.email, soc.fechasuscrip, pl.tipoplan, ser.titulo, pel.titulo, gen.tipogen from socios as soc inner join plan as pl on soc.plan_idplan = pl.idplan inner join series as ser on soc.series_idseries = ser.idseries inner join peliculas as pel on soc.peliculas_idpeli = pel.idpeli inner join genero as gen on soc.genero_idgenero = gen.idgenero where soc.usuario = '"+ usuario +"'; ";
        try {
            Ps = obj.MeConecto().prepareStatement(usu);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                // mandar los datos del select a los atributos por medio de los metodos set
                this.setNom(Rs.getString(1));
                this.setUsu(Rs.getString(2));
                this.setPass(Rs.getString(3));
                this.setEmail(Rs.getString(4)); //falta el nombre del articulo
                this.setFechasus(Rs.getDate(5));
                this.setTipoplan(Rs.getString(6));
                this.setSerie(Rs.getString(7));
                this.setPeli(Rs.getString(8));
                this.setGenero(Rs.getString(9));
                existe = true;
            } else {
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No encuentra la pelicula");
        }
        return existe;
     }    
        
     public void Modif (String socio) {
        String modif = "UPDATE socios SET nom = '" +this.getNom()+"', usuario = '" +this.getUsu()+"', pass = '" +this.getPass()+"', email = '" +this.getEmail()+"', fechasuscrip = '" +this.getFechasus()+"', plan_idplan = '" +this.getCodplan()+"', series_idseries = '" +this.getCodserie()+"', peliculas_idpeli = '" +this.getCodpeli()+"', genero_idgenero = '" +this.getCodGen()+"'  WHERE usuario = '" +socio +"';";
        try {
            Ps = obj.MeConecto().prepareStatement(modif);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "VALOR ACTUALIZADO ");
                
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el valor");
            System.out.println(e);
        }
    } 
     
    public void Bajas (String socio) {
        String bajasocio = "DELETE FROM socios WHERE usuario = '" +socio+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(bajasocio);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTROS ELIMINADOS ");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL QUERER ELIMINAR LOS VALORES");
        }
    }  
}
