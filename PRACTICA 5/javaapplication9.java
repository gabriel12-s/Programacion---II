package javaapplication9;
public class JavaApplication9 {
    public static void main(String[] args) {
        System.out.println(" ------  BIBLIOTECA UMSA  ------ \n");  
       
        System.out.println("---------------------------");
        
        System.out.println(" COMPOSICION:");
        System.out.println("   - Biblioteca crea su propio Horario ");
        System.out.println("   - Libro crea sus propias Paginas \n");
        
        Biblioteca bibliotecaUMSA = new Biblioteca(
            "Biblioteca Central UMSA", "Lunes a Viernes", "08:00", "20:00"
        );
        
        Libro libro1 = new Libro("Cien An~os de Soledad", "978-8437604947");
        libro1.agregarPagina(1, "Muchos an~os después...");
        libro1.agregarPagina(2, "El mundo era tan reciente...");
        
        System.out.println("------------------");
        System.out.println(" AGREGACION:");
        
        System.out.println("----------------");
        System.out.println("   - Biblioteca agrega Libros");
        System.out.println("   - Biblioteca agrega Autores\n");
        
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peruana");
        
        System.out.println("------ -----------");
        System.out.println("   AUTOR :");
        autor1.mostrarInfo();
        
        bibliotecaUMSA.agregarAutor(autor1);
        bibliotecaUMSA.agregarAutor(autor2);
        
        Libro libro2 = new Libro("La Ciudad y los Perros", "978-8420471835");
        libro2.agregarPagina(1, "El jaguar silbo.");
        
        System.out.println("------------------");
        System.out.println("   LIBRO :");
        libro2.mostrarInfo();
        
        bibliotecaUMSA.agregarLibro(libro1);
        bibliotecaUMSA.agregarLibro(libro2);
        
        System.out.println("----------------------");
        System.out.println(" ASOCIACION:");
        System.out.println("   - Prestamo asocia Estudiante con Libro temporalmente");
        System.out.println("   - Relacion de uso entre objetos independientes\n");
        
        Estudiante estudiante1 = new Estudiante("2021001", "Juan Perez");
        Estudiante estudiante2 = new Estudiante("2021002", "Hugo Quispe");
        
        System.out.println("   Realizando prestamos :");
        bibliotecaUMSA.prestarLibro(estudiante1, libro1);
        bibliotecaUMSA.prestarLibro(estudiante2, libro2);
        System.out.println("-------------------------");
        
        bibliotecaUMSA.mostrarEstado();
        
        System.out.println("CIERRE :");
        bibliotecaUMSA.cerrarBiblioteca();
    }
}










