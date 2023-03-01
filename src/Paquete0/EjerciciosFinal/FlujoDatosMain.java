package Paquete0.EjerciciosFinal;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class FlujoDatosMain {
    public static void main(String[] args) {
        try {
            //Flujo de lectura hacia un fichero (FileInputStrem)
            InputStream entrada = new FileInputStream("C:\\Users\\Jhonathan\\Desktop\\Imagenes presentacion");
            byte[] datos = entrada.readAllBytes();
            entrada.close();

            PrintStream salida = new PrintStream("C:\\Users\\Jhonathan\\Desktop\\CursoBasicoJS\\Java\\Proyecto0\\A4.png");
            salida.write(datos);
            salida.close();
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}
