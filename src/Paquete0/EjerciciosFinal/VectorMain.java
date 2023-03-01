package Paquete0.EjerciciosFinal;

import java.util.Vector;

public class VectorMain {
    
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<>(10,5);

        vector.addElement("Brasil");
        vector.addElement("Argentina");
        vector.addElement("Peru");
        vector.addElement("Colombia");
        vector.addElement("Paraguay");
        

        System.out.println(":::Datos del Vector Original:::");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Index: "+i+" Object: "+vector.elementAt(i));  
            
        }

        vector.subList(1, 3).clear();
        System.out.println("Datos del Vector Resultate, depues de eliminar los objetos 2 y 3: "+vector);
       
        
        System.out.println("Tamaño del vector: "+vector.size()+"\nCapacidad del vector: "+vector.capacity());
        System.out.println("\nEl principal problema de utilizar este vector con la capacidad por defecto y pretender ingresar 1000 elementos, es que va a consumir mucha memoria del sistema, debido a que se genera una operación de copia y duplicado del arreglo o array subyacente. Lo mas óptimo es darle una capacidad inicial al vector y proporcionar una capacidad de incremento en caso de que desborde la capacidad inicial");
        
    }
}
