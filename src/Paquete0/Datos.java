package Paquete0;

public class Datos {

    public static void main(String[] args) {
        
        //Enteros
        byte num1 = 1;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = -1234567890;

        //Punto flotante
        float decim1 = 8.9f;
        double decim2 = 8.99d;

        //Caracter
        char carac = 'a';

        // Boleanos
        boolean v = true;
        boolean f = false;

        // Cadena de texto
        String texto = "Hola mundo";

        System.out.println("Datos Enteros: \nbyte --> "+num1+"\nshort --> "+num2+"\nint --> "+num3+"\nlong --> "+num4+"\n\nPunto Flotante: \nfloat --> "+decim1+"\ndouble --> "+decim2+"\n\nCaracter: \nchar --> "+carac+"\n\nBoleanos: \nVerdadero --> "+v+"\nFalso --> "+f+"\n\nCadena de Texto: \nString --> "+texto);

    }
    
}
