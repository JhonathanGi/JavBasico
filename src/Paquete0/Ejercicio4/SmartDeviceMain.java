package Paquete0.Ejercicio4;

public class SmartDeviceMain {
    public static void main(String[] args) {

        //Objetos 
        SmartPhone objeto1 = new SmartPhone("Apple", "Iphone 12", 500.70, "Blanco", 128, 26, "Aluminio", "Ultra HD 8 pulgadas", "150x70x7 (LxAxE)");

        SmartPhone objeto2 = new SmartPhone("Samsung", "Galaxy 10", 490.90, "Azul", 128, 25, "Aluminio", "Ultra HD 7.5 pulgadas", "(140x70x8)");

        SmartWatch objeto3 = new SmartWatch("Apple", "Serie 8", 350.40, "Negro", 64, 36, "Hasta 80 metros de profundidad", "Ocean");

        SmartWatch objeto4 = new SmartWatch("Huawei", "GT Runner", 250.30, "Plateado", 4, 36, "Hasta 50 metros de profundidad", "Silicona");


        System.out.println(":::Phone:::\n\n"+objeto1);
        System.out.println("\n"+objeto2);
        System.out.println("\n\n:::Watch:::\n\n"+objeto3);
        System.out.println("\n"+objeto4);
    }
}
