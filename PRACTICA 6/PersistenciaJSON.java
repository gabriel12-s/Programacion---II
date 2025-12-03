
package biblioteca;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaJSON {
    private static final Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();
    
   
    public static <T> void guardarEnJSON(String nombreArchivo, T objeto) {
        try (FileWriter writer = new FileWriter(nombreArchivo + ".json")) {
            gson.toJson(objeto, writer);
            System.out.println(" Datos guardados en: " + nombreArchivo + ".json");
        } catch (IOException e) {
            System.out.println("✗Error al guardar " + nombreArchivo + ": " + e.getMessage());
        }
    }
    
   
    public static <T> void guardarListaEnJSON(String nombreArchivo, List<T> lista) {
        
        if (lista == null) {
            lista = new ArrayList<>();
        }
        guardarEnJSON(nombreArchivo, lista);
    }
    
  
    public static <T> List<T> cargarListaDesdeJSON(String nombreArchivo, Class<T> clase) {
        File archivo = new File(nombreArchivo + ".json");
        
       
        if (!archivo.exists()) {
            System.out.println(" Archivo no encontrado: " + nombreArchivo + ".json - Se creará uno nuevo");
            return new ArrayList<>();
        }
        
        
        if (archivo.length() == 0) {
            System.out.println(" Archivo vacío: " + nombreArchivo + ".json - Retornando lista vacía");
            return new ArrayList<>();
        }
        
        try (FileReader reader = new FileReader(archivo)) {
           
            StringBuilder contenido = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                contenido.append((char) character);
            }
            
           
            if (contenido.toString().trim().isEmpty()) {
                System.out.println(" Archivo con contenido vacío: " + nombreArchivo + ".json");
                return new ArrayList<>();
            }
            
         
            Type tipoLista = TypeToken.getParameterized(List.class, clase).getType();
            List<T> lista = gson.fromJson(contenido.toString(), tipoLista);
            
         
            if (lista == null) {
                System.out.println(" No se pudieron cargar datos de: " + nombreArchivo + ".json");
                return new ArrayList<>();
            }
            
            System.out.println(" Datos cargados desde: " + nombreArchivo + ".json (" + lista.size() + " registros)");
            return lista;
            
        } catch (IOException e) {
            System.out.println(" Error al leer archivo " + nombreArchivo + ": " + e.getMessage());
            return new ArrayList<>();
        } catch (com.google.gson.JsonSyntaxException e) {
            System.out.println(" Error en formato JSON de " + nombreArchivo + ": " + e.getMessage());
           
            System.out.println("Creando nuevo archivo con formato correcto...");
            List<T> listaVacia = new ArrayList<>();
            guardarListaEnJSON(nombreArchivo, listaVacia);
            return listaVacia;
        }
    }
    
  
    public static <T> T cargarDesdeJSON(String nombreArchivo, Class<T> clase) {
        File archivo = new File(nombreArchivo + ".json");
        
        if (!archivo.exists() || archivo.length() == 0) {
            System.out.println("ℹ Archivo no disponible: " + nombreArchivo + ".json");
            return null;
        }
        
        try (FileReader reader = new FileReader(archivo)) {
            T objeto = gson.fromJson(reader, clase);
            System.out.println(" Objeto cargado desde: " + nombreArchivo + ".json");
            return objeto;
        } catch (IOException | com.google.gson.JsonSyntaxException e) {
            System.out.println(" Error al cargar " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }
    
  
    public static void guardarAutores(List<Autor> autores) {
        guardarListaEnJSON("autores", autores);
    }
    
    public static List<Autor> cargarAutores() {
        return cargarListaDesdeJSON("autores", Autor.class);
    }
    
    public static void guardarLibros(List<Libro> libros) {
        guardarListaEnJSON("libros", libros);
    }
    
    public static List<Libro> cargarLibros() {
        return cargarListaDesdeJSON("libros", Libro.class);
    }
    
    public static void guardarPrestamos(List<Prestamo> prestamos) {
        guardarListaEnJSON("prestamos", prestamos);
    }
    
    public static List<Prestamo> cargarPrestamos() {
        return cargarListaDesdeJSON("prestamos", Prestamo.class);
    }
    
    public static void guardarEstudiantes(List<Estudiante> estudiantes) {
        guardarListaEnJSON("estudiantes", estudiantes);
    }
    
    public static List<Estudiante> cargarEstudiantes() {
        return cargarListaDesdeJSON("estudiantes", Estudiante.class);
    }
    
   
    public static void inicializarArchivos() {
        System.out.println("=== INICIALIZANDO ARCHIVOS JSON ===");
        
        
        String[] archivos = {"autores", "libros", "prestamos", "estudiantes"};
        
        for (String archivo : archivos) {
            File f = new File(archivo + ".json");
            if (!f.exists() || f.length() == 0) {
                System.out.println("Creando/limpiando: " + archivo + ".json");
                guardarListaEnJSON(archivo, new ArrayList<>());
            }
        }
        System.out.println("=== ARCHIVOS LISTOS ===\n");
    }
}