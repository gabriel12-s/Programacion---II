
package biblioteca;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private String fechaPrestamo; 
    private String fechaDevolucion;  
    private Estudiante estudiante;
    private Libro libro;
    
   
    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
       
        this.fechaPrestamo = LocalDate.now().toString();
        this.fechaDevolucion = LocalDate.now().plusDays(15).toString();
    }
    
  
    public Prestamo() {
    }
    
    public void mostrarInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(" INFORMACION DEL PRESTAMO ");
        estudiante.mostrarInfo();
        libro.mostrarInfo();
        
       
        LocalDate fechaP = LocalDate.parse(fechaPrestamo);
        LocalDate fechaD = LocalDate.parse(fechaDevolucion);
        
        System.out.println("Fecha prestamo: " + fechaP.format(formatter));
        System.out.println("Fecha devolucion: " + fechaD.format(formatter));
        System.out.println("------------------- -");
    }
    
   
    public String getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(String fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }
    
    public String getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(String fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }
    
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    
    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }
    
   
    public LocalDate getFechaPrestamoLocalDate() {
        return LocalDate.parse(fechaPrestamo);
    }
    
    public LocalDate getFechaDevolucionLocalDate() {
        return LocalDate.parse(fechaDevolucion);
    }
}
