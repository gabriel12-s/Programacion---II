
package biblioteca;


public class Pagina {
    private int numeroPagina;
    private String contenido;
    
  
    public Pagina(int numeroPagina, String contenido) {
        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }
    
 
    public Pagina() {
    }
    
    public void mostrarContenido() {
        System.out.println("Pagina " + numeroPagina + ": " + contenido);
    }
    
   
    public int getNumeroPagina() { return numeroPagina; }
    public void setNumeroPagina(int numeroPagina) { this.numeroPagina = numeroPagina; }
    
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
}