
package clases;


public class DenominadorCeroException extends Exception{
    public DenominadorCeroException(){
        super("No puede haber un denominador en 0");
        
    }
}
