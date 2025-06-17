package application_libro;

public class Application_Libro {

   
    public static void main(String[] args) {
       Libro miLibro = new Libro("100 años de soledad", "Garcia Márquez", "500");
       miLibro.abrir();
       miLibro.leer();
       miLibro.cerrar();
    }
    
}
