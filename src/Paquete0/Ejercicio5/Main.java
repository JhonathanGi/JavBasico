package Paquete0.Ejercicio5;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();
    
    public static void main(String[] args) {
        
        //Utilizar métodos 
        
        cocheCrud.save(cocheCrud);
        cocheCrud.findAll(cocheCrud);
        cocheCrud.delete(cocheCrud);
        
    }
}
