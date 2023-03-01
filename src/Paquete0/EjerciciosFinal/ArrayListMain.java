package Paquete0.EjerciciosFinal;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(0, "Jhonathan");
        lista.add(1, "Ana");
        lista.add(2, "Kathe");
        lista.add(3, "Elsa");

        System.out.println("Elementos del ArrayList: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // LinkedList copiando el ArrayList
        LinkedList<String> copia = new LinkedList<String>(lista);
        System.out.println("\nElementos del LinkedList: ");
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(copia.get(i));
            
        }
    }
}
