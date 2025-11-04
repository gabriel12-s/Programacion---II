
package javaapplication9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;
    
    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(15);
    }
    
    public void mostrarInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(" INFORMACION DEL PRESTAMO ");
        estudiante.mostrarInfo();
        libro.mostrarInfo();
        System.out.println("Fecha prestamo: " + fechaPrestamo.format(formatter));
        System.out.println("Fecha devolucion: " + fechaDevolucion.format(formatter));
        System.out.println("------------------- -");
    }
    
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public Estudiante getEstudiante() { return estudiante; }
    public Libro getLibro() { return libro; }
}
