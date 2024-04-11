
package Desarrollo;

import javax.swing.JOptionPane;

public class Validacion {
    
     public static void SoloLetras(java.awt.event.KeyEvent evt)
    {
        char Letra = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isLetter(Letra) && Bs != 32  && Bs != 8 ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar una letra", "Atención", JOptionPane.WARNING_MESSAGE);

            evt.consume();
            
        }
    }
    
    
    public static void SoloNumeros(java.awt.event.KeyEvent evt)
    {
        char nro = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isDigit(nro)  && Bs != 8  ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "Atención", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }

}
