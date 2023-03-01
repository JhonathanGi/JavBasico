package Paquete0.EjerciciosFinal;

public class ArrayBiMain {
    
    public static void main(String[] args) {
        
        int arrayBi [][] = {
            {1,2,3,4},
            {2,4,6,8}
        };

        for (int i = 0; i < arrayBi.length; i++) {

            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("i:"+i+", j:"+j+" Valor: "+arrayBi[i][j]);
                
            }
            
        }
    }
}
