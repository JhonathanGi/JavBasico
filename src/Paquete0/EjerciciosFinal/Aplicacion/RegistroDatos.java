package Paquete0.EjerciciosFinal.Aplicacion;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RegistroDatos {
    public static void main(String[] args) {
        ArrayList<Persona> clientes = new ArrayList<>();

        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {

                String nombre = JOptionPane.showInputDialog("Nombre del Cliente: ");
                
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                
                int id = Integer.parseInt(JOptionPane.showInputDialog("Número de identificación: "));

                String email = JOptionPane.showInputDialog("Contacto de E-mail: ");

                //objeto con la info ingresada
                Persona persona = new Persona(nombre, edad, id, email);

                //agrego al ArrayList
                clientes.add(persona);
                JOptionPane.showMessageDialog(null,"Registro exitoso");

                //Agregar otro cliente
                String registro = JOptionPane.showInputDialog("¿Desea registrar otro cliente? (s/n)");
                if (registro.equalsIgnoreCase("n")) {
                    break;
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, clientes.toString());

    }
}

//Constructor
class Persona{
    private String nombre;
    private int edad;
    private int id;
    private String email;

    public Persona(String nombre, int edad, int id, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.email = email;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nID: "+id+"\nE-mail: "+email;
    }
}