package Paquete0;

import java.util.Scanner;

public class PrecioIva {
    
    public static void main(String[] args) {

        precioProducto();
    }

    public static void  precioProducto(){

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingresa el precio del producto en dolares: ");
            String precioProducto = input.nextLine();

                
            double calculo = Double.parseDouble(precioProducto)*0.19;
            double resultado = Double.parseDouble(precioProducto)+calculo;

            System.out.println("El precio del producto con un IVA del 19% es: "+resultado+" U$D");
        }
        
    }
}

