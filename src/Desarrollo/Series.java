
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Series {
    
    //atributos
    private String TitSerie;
    private String Año;
    private String Duracion;
    private String Director;
    private String Resumen;
    private int CodGen;

    private String tipogen;
    
    Conexion obj = new Conexion ();
    PreparedStatement Ps;
    ResultSet Rs;
    private String cargaDeDatos = "INSERT INTO series (titulo,anio,duracion,director,resumen,genero_idgenero) VALUES (?,?,?,?,?,?);";
    
    //constructor
    public Series(String TitSerie, String Año, String Duracion, String Director, String Resumen, int CodGen) {
        this.TitSerie = TitSerie;
        this.Año = Año;
        this.Duracion = Duracion;
        this.Director = Director;
        this.Resumen = Resumen;
        this.CodGen = CodGen;
      
    }

    public Series() {
    }

    public String getTitSerie() {
        return TitSerie;
    }

    public String getAño() {
        return Año;
    }

    public String getDuracion() {
        return Duracion;
    }

    public String getDirector() {
        return Director;
    }

    public String getResumen() {
        return Resumen;
    }

    public String getTipogen() {
        return tipogen;
    }

    public void setTitSerie(String TitSerie) {
        this.TitSerie = TitSerie;
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

    public void setTipogen(String tipogen) {
        this.tipogen = tipogen;
    }

    public void setCodGen(int CodGen) {
        this.CodGen = CodGen;
    }

    public int getCodGen() {
        return CodGen;
    }
    
    
    //metodos
    public void Altas () {
        try {
            Ps = obj.MeConecto().prepareStatement(cargaDeDatos);
            Ps.setString(1, TitSerie);
            Ps.setString(2, Año);
            Ps.setString(3, Duracion);
            Ps.setString(4, Director);
            Ps.setString(5, Resumen);
            Ps.setInt(6, CodGen);
            int resultado = Ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al grabar un registro en Series ");
        }
    
    }
    
     public boolean BuscarSerie (String serie) {
        boolean existe = false;
        String serienom = "select ser.titulo, ser.anio, ser.duracion, ser.director, ser.resumen, gen.tipogen from series as ser inner join genero as gen on ser.genero_idgenero = gen.idgenero where ser.titulo = '"+serie +"';";
        try {
            Ps = obj.MeConecto().prepareStatement(serienom);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                // mandar los datos del select a los atributos por medio de los metodos set
                this.setTitSerie(Rs.getString(1));
                this.setAño(Rs.getString(2));
                this.setDuracion(Rs.getString(3));
                this.setDirector(Rs.getString(4)); //falta el nombre del articulo
                this.setResumen(Rs.getString(5));
                this.setTipogen(Rs.getString(6));
                existe = true;
            } else {
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No encuentra la pelicula");
        }
        return existe;
    }
     
    public void Modif (String serie) {
        String modif = "UPDATE series SET titulo = '" +this.getTitSerie()+"', anio = '" +this.getAño()+"', duracion = '" +this.getDuracion()+"', director = '" +this.getDirector()+"', resumen = '" +this.getResumen()+"', genero_idgenero = '" +this.getCodGen()+"'  WHERE titulo = '" +serie +"';";
        try {
            Ps = obj.MeConecto().prepareStatement(modif);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "VALOR ACTUALIZADO ");
                
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el valor");
            System.out.println();
        }
    }
    
    public void Bajas (String serie) {
        String bajaserie = "DELETE FROM series WHERE titulo = '" +serie+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(bajaserie);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTROS ELIMINADOS ");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL QUERER ELIMINAR LOS VALORES");
        }
    } 
        
        
    }
 

