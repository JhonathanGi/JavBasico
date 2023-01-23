package Paquete0.Ejercicio4;

//Super Clase
public class SmartDevice {
    
    //Atributos
    String marca;
    String modelo;
    Double precio;
    String color;
    int memoria;
    int bateria;

    //Constructor
    public SmartDevice(){}

    public SmartDevice(String marca, String modelo, Double precio, String color, int memoria, int bateria){

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.memoria = memoria;
        this.bateria = bateria;

    }

    public String toString(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\nColor: "+color+"\nMemoria: "+memoria+"\nDuración Bateria: "+bateria;
    }





}
