package Paquete0.Ejercicio4;

//SubClase SmartWatch
public class SmartWatch extends SmartDevice{

    //Atributos
    String resisteAgua;
    String correa;

    //Constructor SubClase
    public SmartWatch(String resisteAgua, String correa){
        this.resisteAgua = resisteAgua;
        this.correa = correa;
    }

    //Sobrecarga
    public SmartWatch(String marca, String modelo, Double precio, String color, int memoria, int bateria, String resisteAgua, String correa){
        super(marca, modelo, precio, color, memoria, bateria);
        this.resisteAgua = resisteAgua;
        this.correa = correa;
    }

    public String toString(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio U$D: "+precio+"\nColor: "+color+"\nMemoria GB: "+memoria+"\nDuración Bateria (Horas): "+bateria+"\nResistencia al Agua: "+resisteAgua+"\nTipo de manilla: "+correa;
    }
    
}
