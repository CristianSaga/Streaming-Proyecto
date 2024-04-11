
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Peliculas {
    
    //atributos
    private String TitPeli;
    private String Año;
    private String Duracion;
    private String Director;
    private String Resumen;
    private int CodGen;
    
    private String tipogen;
    
    Conexion obj = new Conexion ();
    PreparedStatement Ps;
    ResultSet Rs;
    private String cargaDeDatos = "INSERT INTO peliculas (titulo,anio,duracion,director,resumen,genero_idgenero) VALUES (?,?,?,?,?,?);";
    
    // constructor

    public Peliculas(String TitPeli, String Año, String Duracion, String Director, String Resumen, int CodGen) {
        this.TitPeli = TitPeli;
        this.Año = Año;
        this.Duracion = Duracion;
        this.Director = Director;
        this.Resumen = Resumen;
        this.CodGen = CodGen;
    }

    public Peliculas() {
    }

    public String getTitPeli() {
        return TitPeli;
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

    public int getCodGen() {
        return CodGen;
    }

    public void setCodGen(int CodGen) {
        this.CodGen = CodGen;
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

    public String getTipogen() {
        return tipogen;
    }

    
    public void setTipogen(String tipogen) {
        this.tipogen = tipogen;
    }
    
    
    //metodos
    public void Altas () {
        try {
            Ps = obj.MeConecto().prepareStatement(cargaDeDatos);
            Ps.setString(1, TitPeli);
            Ps.setString(2, Año);
            Ps.setString(3, Duracion);
            Ps.setString(4, Director);
            Ps.setString(5, Resumen);
            Ps.setInt(6, CodGen);
            int resultado = Ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al grabar un registro en Peliculas ");
        }
    }
    
    public boolean BuscarPeli (String pelicula) {
        boolean existe = false;
        String peli = "select pel.titulo, pel.anio, pel.duracion, pel.director, pel.resumen, gen.tipogen from peliculas as pel inner join genero as gen on pel.genero_idgenero = gen.idgenero where pel.titulo = '"+pelicula +"';";
        try {
            Ps = obj.MeConecto().prepareStatement(peli);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                // mandar los datos del select a los atributos por medio de los metodos set
                this.setTitPeli(Rs.getString(1));
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
    
    public void Modif (String pelicula) {
        String modif = "UPDATE pelicula SET titulo = '" +this.getTitPeli()+"', anio = '" +this.getAño()+"', duracion = '" +this.getDuracion()+"', director = '" +this.getDirector()+"', resumen = '" +this.getResumen()+"', genero_idgenero = '" +this.getCodGen()+"'  WHERE titulo = '" +pelicula +"';";
        try {
            Ps = obj.MeConecto().prepareStatement(modif);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "PRODUCTO ACTUALIZADO ");
                
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto ");
            System.out.println(e);
            
        }
    
    }
     
    public void Bajas (String pelicula) {
        String bajapeli = "DELETE FROM peliculas WHERE titulo = '" +pelicula+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(bajapeli);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTROS ELIMINADOS ");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL QUERER ELIMINAR LOS VALORES");
        }
    }
}
