
package Bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    //atributos
    private final String nombdd = "jdbc:mysql://Localhost/streaming";
    private final String usu = "root";
    private final String clave = "";
    
    Connection con;
    
    //constructor
    public Conexion() {
         try {  
            Class.forName("com.mysql.jdbc.Driver"); // levanta el driver
            con = DriverManager.getConnection(nombdd, usu, clave);
         
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al conectarse " + e);
         }
     }
    
    // metodos
    
    public Connection MeConecto () {
        return con;
    }
    
    public void MeDesconecto () {
        
    }
}
