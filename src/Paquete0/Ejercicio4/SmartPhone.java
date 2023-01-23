package Paquete0.Ejercicio4;

//SubClase SmartPhone
public class SmartPhone extends SmartDevice {

    //Atributos
    String carcasa;
    String pantalla;
    String dimensiones;

    //Constructor SubClase
    public SmartPhone(String carcasa, String pantalla, String dimensiones){
        this.carcasa = carcasa;
        this.pantalla = pantalla;
        this.dimensiones = dimensiones;
    }

    //Sobre Carga
    public SmartPhone(String marca, String modelo, Double precio, String color, int memoria, int bateria, String carcasa, String pantalla, String dimensiones){
        super(marca, modelo, precio, color, memoria, bateria);
        this.carcasa = carcasa;
        this.pantalla = pantalla;
        this.dimensiones = dimensiones;
    }

    public String toString(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio U$D: "+precio+"\nColor: "+color+"\nMemoria GB: "+memoria+"\nDuración Bateria (Horas): "+bateria+"\nTipo de Carcasa: "+carcasa+"\nPantalla: "+pantalla+"\nDimensiones: "+dimensiones;
    }
}
