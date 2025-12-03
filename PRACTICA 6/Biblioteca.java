
package biblioteca;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    
  
    PersistenciaJSON.inicializarArchivos();
}
    
  
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
       
        PersistenciaJSON.guardarLibros(libros);
    }
    
    public void agregarAutor(Autor autor) {
        autores.add(autor);
        System.out.println("Autor registrado: " + autor.getNombre());
       
        PersistenciaJSON.guardarAutores(autores);
    }
    
    public void prestarLibro(Estudiante estudiante, Libro libro) {
        if (libros.contains(libro)) {
            Prestamo prestamo = new Prestamo(estudiante, libro);
            prestamosActivos.add(prestamo);
            System.out.println("Prestamo realizado exitosamente");
            prestamo.mostrarInfo();
            
            PersistenciaJSON.guardarPrestamos(prestamosActivos);
        } else {
            System.out.println("Error: El libro no está disponible en la biblioteca");
        }
    }
    
   
    public void guardarTodo() {
        System.out.println("\n=== GUARDANDO TODOS LOS DATOS ===");
        PersistenciaJSON.guardarAutores(autores);
        PersistenciaJSON.guardarLibros(libros);
        PersistenciaJSON.guardarPrestamos(prestamosActivos);
        System.out.println("=== DATOS GUARDADOS ===\n");
    }
    
    
    public void cargarTodo() {
        System.out.println("\n=== CARGANDO DATOS GUARDADOS ===");
        
        List<Autor> autoresCargados = PersistenciaJSON.cargarAutores();
        if (autoresCargados != null && !autoresCargados.isEmpty()) {
            this.autores = autoresCargados;
            System.out.println("Autores cargados: " + autores.size());
        }
        
        List<Libro> librosCargados = PersistenciaJSON.cargarLibros();
        if (librosCargados != null && !librosCargados.isEmpty()) {
            this.libros = librosCargados;
            System.out.println("Libros cargados: " + libros.size());
        }
        
        List<Prestamo> prestamosCargados = PersistenciaJSON.cargarPrestamos();
        if (prestamosCargados != null && !prestamosCargados.isEmpty()) {
            this.prestamosActivos = prestamosCargados;
            System.out.println("Préstamos cargados: " + prestamosActivos.size());
        }
        
        System.out.println("=== DATOS CARGADOS ===\n");
    }
    
   
    public void mostrarEstado() {
        System.out.println("\n ESTADO DE LA BIBLIOTECA: " + nombre + " ===");
        if (horario != null) {
            horario.mostrarHorario();
        }
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
        // Guardar antes de cerrar
        guardarTodo();
        prestamosActivos.clear();
        System.out.println("Todos los prestamos activos han sido eliminados");
    }
    public void guardarDatos(){
        Gson gson = new Gson();
        try{
            FileWriter w = new FileWriter("biblioteca.json");
            gson.toJson(this, w);
            w.close();
        } catch(Exception e){
            System.out.println("ERROR EN GUARDADO----" + e);
        }
    
    }
    public void cargarDatos(){
        Gson gson = new Gson();
        try{
            FileReader r = new FileReader("biblioteca.json");
            Biblioteca b = gson.fromJson(r, Biblioteca.class);
            
            this.horario = b.getHorario();
            this.autores = b.getAutores();
            this.libros = b.getLibros();
            this.prestamosActivos = b.getPrestamosActivos();
            
            r.close();
        } catch(Exception e){
            System.out.println("ERROR EN GUARDADO----" + e);
        }
    }
    
    public void eliminarDatos(){
        try {
            File f = new File("biblioteca.json");
            if(f.delete()){
                this.autores.clear();
                this.libros.clear();
                this.prestamosActivos.clear();
                
                
                
                System.out.println("SE BORRO EXITOSAMENTE");
                JOptionPane.showConfirmDialog(null, "SE BORRO EL ARCHIVO Y LOS DATOS", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                System.out.println("NO SE LOGRO BORRAR EL ARCHIVO");
                JOptionPane.showConfirmDialog(null, "HUBO UN ERROR","ERROR", JOptionPane.ERROR);
            }
        } catch (Exception e){
            System.out.println("ERROR EN ELIMINACION DE DATOS---\n\n" + e);
        }
    }
    
    // Getters y setters (necesarios para GSON)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public List<Libro> getLibros() { return libros; }
    public void setLibros(List<Libro> libros) { this.libros = libros; }
    
    public List<Autor> getAutores() { return autores; }
    public void setAutores(List<Autor> autores) { this.autores = autores; }
    
    public List<Prestamo> getPrestamosActivos() { return prestamosActivos; }
    public void setPrestamosActivos(List<Prestamo> prestamosActivos) { this.prestamosActivos = prestamosActivos; }
    
    public Horario getHorario() { return horario; }
    public void setHorario(Horario horario) { this.horario = horario; }

    void agregarLibro(String autorName, String nombreEstudiante, String libroTitulo, String prestamoInfo) {
       
        if (autorName != null && !autorName.trim().isEmpty()) {
            Autor a = new Autor();
            a.setNombre(autorName.trim());
            autores.add(a);
        }

       
        Libro nuevoLibro = new Libro();
        nuevoLibro.setTitulo(libroTitulo != null ? libroTitulo.trim() : "");
        if (autorName != null && !autorName.trim().isEmpty()) {
            nuevoLibro.setAutor(autorName.trim());
        }
        libros.add(nuevoLibro);

        
        Estudiante est = new Estudiante();
        est.setNombre(nombreEstudiante != null ? nombreEstudiante.trim() : "");

        
        Prestamo p = new Prestamo(est, nuevoLibro);

        if (prestamoInfo != null && !prestamoInfo.trim().isEmpty()) {
            String s = prestamoInfo.trim();
            String[] parts = s.split("[,;]");
            try {
                if (parts.length >= 1 && !parts[0].trim().isEmpty()) p.setFechaPrestamo(parts[0].trim());
                if (parts.length >= 2 && !parts[1].trim().isEmpty()) p.setFechaDevolucion(parts[1].trim());
            } catch (Exception ex) {
                System.out.println("Aviso: formato de fecha no válido, usando fechas por defecto.");
            }
        }

        prestamosActivos.add(p);

        System.out.println("Registro agregado en memoria: Libro='" + nuevoLibro.getTitulo() + "', Estudiante='" + est.getNombre() + "'");
    }

}