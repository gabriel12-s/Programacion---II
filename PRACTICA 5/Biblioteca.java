package javaapplication9;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamosActivos;
    private Horario horario;
    
    public Biblioteca(String nombre, String diasApertura, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horario = new Horario(diasApertura, horaApertura, horaCierre);
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }
    
    public void agregarAutor(Autor autor) {
        autores.add(autor);
        System.out.println("Autor registrado: " + autor.getNombre());
    }
    
    public void prestarLibro(Estudiante estudiante, Libro libro) {
        if (libros.contains(libro)) {
            Prestamo prestamo = new Prestamo(estudiante, libro);
            prestamosActivos.add(prestamo);
            System.out.println("Prestamo realizado exitosamente");
            prestamo.mostrarInfo();
        } else {
            System.out.println("Error: El libro no está disponible en la biblioteca");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("\n ESTADO DE LA BIBLIOTECA: " + nombre + " ===");
        horario.mostrarHorario();
        System.out.println("\n Libros disponibles (" + libros.size() + ") ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        System.out.println("\n Autores registrados (" + autores.size() + ") ---");
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
        System.out.println("\n Prestamos activos (" + prestamosActivos.size() + ") ---");
        for (Prestamo prestamo : prestamosActivos) {
            prestamo.mostrarInfo();
        }
       
    }
    
    public void cerrarBiblioteca() {
        System.out.println("Cerrando biblioteca: " + nombre);
        prestamosActivos.clear();
        System.out.println("Todos los prestamos activos han sido eliminados");
    }
    
    public String getNombre() { return nombre; }
    public List<Libro> getLibros() { return libros; }
    public List<Autor> getAutores() { return autores; }
    public List<Prestamo> getPrestamosActivos() { return prestamosActivos; }
    public Horario getHorario() { return horario; }
}
