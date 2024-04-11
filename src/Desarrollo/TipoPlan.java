
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TipoPlan {
    
      //atributos
    private String plan;
    private String pago;
    private int CodPlan; 
    
    Conexion obj = new Conexion ();
    PreparedStatement Ps;
    ResultSet Rs;
    private String cargaDeDatos = "INSERT INTO plan (tipoplan, formapago) VALUES (?,?);";
    
    //constructor

    public TipoPlan() {
    }

    public TipoPlan(String plan, String pago) {
        this.plan = plan;
        this.pago = pago;
    }

    public String getPlan() {
        return plan;
    }

    public String getPago() {
        return pago;
    }
    
    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
    
    
    
    public void Altas () {
        try {
            Ps = obj.MeConecto().prepareStatement(cargaDeDatos);
            Ps.setString(1, plan);
            Ps.setString(2, pago);
            int resultado = Ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos a planes ");
        }
    }
    
    public void Modif (String tipoplan) {
        String modif = "UPDATE plan SET tipoplan = '" +this.getPlan()+"' , formapago = '" +this.getPago()+"' WHERE tipoplan = '" +tipoplan+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(modif);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "PLAN ACTUALIZADO EN CASCADA");
                
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el plan en cascada");
        }
    }
    
    public void Bajas () {
        String BajasPlan = "delete from plan where tipoplan = '"+ this.getPlan() +"' ";      
        try {
            Ps = obj.MeConecto().prepareStatement(BajasPlan);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "REGISTROS ELIMINADOS ");
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN BAJA DE PLANES ");
        }
    }
//    public DefaultListModel MostrarPlanes () {
//       return MostrarPlanes;
//    }
    
//    public boolean BuscarCodGenporTipo (String TipoGen) {
//    
//    }
}
