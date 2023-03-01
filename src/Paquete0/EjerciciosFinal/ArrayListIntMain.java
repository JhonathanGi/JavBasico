package Paquete0.EjerciciosFinal;

import java.util.ArrayList;

public class ArrayListIntMain {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        //Llenando el ArrayList
        for (int i = 1; i <=10; i++) {
            numeros.add(i);
        }
        System.out.println("ArrayList inicial: "+numeros);

        //Eliminando números pares
        System.out.println("\nArrayList despues de eliminar los numeros pares:");
        for (int i = 0 ; i < numeros.size(); i++) {
            if (numeros.get(i)%2 == 0) {
                numeros.remove(i);
                i--;
            }
        }
        System.out.println("ArrayList final: "+numeros);
    }
}
