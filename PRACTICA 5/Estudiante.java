package javaapplication9;

public class Estudiante {
    private String codigoEstudiante;
    private String nombre;
    
    public Estudiante(String codigoEstudiante, String nombre) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Codigo: " + codigoEstudiante);
    }
    
    public String getCodigoEstudiante() { return codigoEstudiante; }
    public String getNombre() { return nombre; }
}
