
package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor; 
    private List<Pagina> paginas;
    
  
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
    }
    
   
    public Libro() {
        this.paginas = new ArrayList<>();
    }
    
    public void agregarPagina(int numero, String contenido) {
        Pagina pagina = new Pagina(numero, contenido);
        paginas.add(pagina);
    }
    
    public void leer() {
        System.out.println("\nLeyendo libro: " + titulo + " ---");
        for (Pagina pagina : paginas) {
            pagina.mostrarContenido();
        }
        System.out.println(" Fin del libro ");
    }
    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + ", ISBN: " + isbn + 
                          ", Paginas: " + paginas.size());
    }
    
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    
    public List<Pagina> getPaginas() { return paginas; }
    public void setPaginas(List<Pagina> paginas) { this.paginas = paginas; }
    
     public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    
   
}