
package biblioteca;


public class Estudiante {
    private String codigoEstudiante;
    private String nombre;
    
  
    public Estudiante(String codigoEstudiante, String nombre) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
    }
    
    
    public Estudiante() {
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Codigo: " + codigoEstudiante);
    }
    
   
    public String getCodigoEstudiante() { return codigoEstudiante; }
    public void setCodigoEstudiante(String codigoEstudiante) { this.codigoEstudiante = codigoEstudiante; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}



