package Paquete0.EjerciciosFinal;
import javax.swing.JOptionPane;

public class DividePorCero {
    
    public float division() throws ArithmeticException{
        float numerador = 0;
        float  denominador = 0;
        float division = 0;

        try {
            numerador = Float.parseFloat(JOptionPane.showInputDialog("Digita el numerador: "));
            denominador = Float.parseFloat(JOptionPane.showInputDialog("Ahora digita el denominador: "));
            division = (numerador/denominador);
            JOptionPane.showMessageDialog(null, "El resultado de la division es: "+division);

            if (denominador == 0) {
                JOptionPane.showMessageDialog(null, "Division por cero");
                throw new ArithmeticException();
            }
            return division;
                
        }catch (ArithmeticException e) {
               
                JOptionPane.showMessageDialog(null, "Esto no se puede hacer");
        }
        return division;

        
        
        
           
    
                
                

    } 
}
                

        




