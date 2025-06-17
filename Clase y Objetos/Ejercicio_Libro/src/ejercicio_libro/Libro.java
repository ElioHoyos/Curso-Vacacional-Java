package ejercicio_libro;

public class Libro {
    
    public String titulo;
    public String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
        
    public void mostrarInfo(){
        System.out.println("Libro: " + titulo + 
                "\nAutor: " + autor);
    }
 
          
}
