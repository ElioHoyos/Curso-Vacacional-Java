package application_libro;

public class Libro {
    public String titulo, autor, paginas;

    public Libro(String titulo, String autor, String paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
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

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
    
    public void abrir(){
        System.out.println("El libro se encuetra abierto en la página" + paginas);
    }
    
    public void leer(){
        System.out.println("El autor " + autor + 
                "\ndel libro " + titulo);
    }
    
    public void cerrar(){
        System.out.println("El libro termina "+ titulo +" del autor " + autor + 
                "\ntermina en la página 500.");
    }
    
}
