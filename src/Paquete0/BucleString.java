package Paquete0;

public class BucleString {
    public static void main(String[] args) {
       
        String nombres[]={"Jhonathan", " Ana", " Oreo", " Maya", " Mauro"};
        String cad = "";
        for (int i = 0; i < nombres.length; i++) {
            cad += nombres[i];
        }
        System.out.println(cad);
    }
    
}
