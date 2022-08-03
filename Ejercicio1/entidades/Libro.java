package Ejercicio1.entidades;

public class Libro {

    //Defino parametros ISBN, titulo, autor, numero de paginas
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    
    
    
    //creo constructor vacio
    public Libro() {
    }
          
    //creo constructor con parametros
    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + isbn + ", Título=" + titulo + ", Autor=" + autor + ", Numero de Páginas=" + numeroPaginas + '}';
    }
    
    
}
