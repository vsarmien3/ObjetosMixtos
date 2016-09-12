
package clases;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Helper {
    public static int mensaje(Component ventana, String info, String titulo, int tipo){
    int tipo_mensaje_java, retorno = -1;
        switch(tipo){
        case 1: 
            tipo_mensaje_java = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
            
            break;
            
        case 2:
            JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
            break;
            
        case 3: 
            JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_CANCEL_OPTION);
            
            break;
            
           
    }
        return retorno;
        
}
    
}
