package Paquete0.EjerciciosFinal;

public class Reversa {
    
    static String cadena = "Cadena Invertida";

    static String invertida = "";

    public void reverse(Reversa cadenaInvertida) {
        for (int i = cadena.length() -1; i >=0; i--) {

            //Concatenar cada caracter a la nueva cadena
            invertida += cadena.charAt(i);
        }
        System.out.println("Cadena Original: "+cadena);
        System.out.println("Cadena Invertida: "+invertida);
    }
    
}

