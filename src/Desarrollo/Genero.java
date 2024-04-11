
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Genero {
    
    //atributos
    private String Tipo; 
    private int CodGen; 
    
    Conexion obj = new Conexion ();
    PreparedStatement Ps;
    ResultSet Rs;
    private String cargaDeDatos = "INSERT INTO genero (tipogen) VALUES (?);";
    
    
    //constructor
    public Genero(String Tipo) {
        this.Tipo = Tipo;
    }

    public Genero() {
    }

    public int getCodGen() {
        return CodGen;
    }

    public void setCodGen(int CodGen) {
        this.CodGen = CodGen;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    //metodos
     public void Altas () {
        try {
            
            Ps = obj.MeConecto().prepareStatement(cargaDeDatos);
            Ps.setString(1, Tipo);
            int resultado = Ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos en genero ");
        }
 
    }
     
    public void Modif (String tipogen) {
         String modif = "UPDATE genero SET tipogen = '" +this.getTipo()+"' WHERE tipogen = '" +tipogen+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(modif);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "GENERO ACTUALIZADO EN CASCADA");
                
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto en cascada");
        }
    }
     
    public void Bajas () {
        String BajasFab = "delete from genero where tipogen = '"+ this.getTipo() +"' ";      
        try {
            Ps = obj.MeConecto().prepareStatement(BajasFab);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTROS ELIMINADOS ");
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN BAJA DE GENEROS ");
        }
    }
     
    public DefaultListModel MostrarGeneros () {
        String SelectGen = "select tipogen from genero order by tipogen";
        DefaultListModel objLista = new DefaultListModel ();
        try {
            Ps = obj.MeConecto().prepareStatement(SelectGen);
            Rs = Ps.executeQuery();
            
            while (Rs.next()){
                objLista.addElement(Rs.getString(1));    
            } 
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR AL MOSTRAR LOS GENEROS");
        }
        
        return objLista;
    }      
    
    public boolean BuscarCodGenporTipo (String TipoGen) {
        String BuscarCod = "select idgenero from genero where tipogen = '"+ TipoGen +"' ";
        try {
            Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                // el contenido de la columna fabricantes (1)
                setCodGen(Rs.getInt(1));
            }
             return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR NO ENCUENTRA EL CODIGO");
            return false;
        }
        
    }
}
