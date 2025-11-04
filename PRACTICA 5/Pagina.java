package javaapplication9;


public class Pagina {
    private int numeroPagina;
    private String contenido;
    
    public Pagina(int numeroPagina, String contenido) {
        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }
    
    public void mostrarContenido() {
        System.out.println("Pagina " + numeroPagina + ": " + contenido);
    }
    
    public int getNumeroPagina() { return numeroPagina; }
    public String getContenido() { return contenido; }
}

