
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];
        
        System.out.println("Ingrese 5 empleados ,3 tiempo completo y 2 tiempo en horario:");
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEmpleado " + (i + 1) + " - Nombre: ");
            String nombre = scanner.nextLine();
            
            if (i < 3) {
                System.out.print("Salario Anual: ");
                empleados[i] = new EmpleadoTiempoCompleto(nombre, scanner.nextDouble());
            } else {
                System.out.print("Horas Trabajadas: ");
                double horas = scanner.nextDouble();
                System.out.print("Tarifa por Hora: ");
                empleados[i] = new EmpleadoTiempoHorario(nombre, horas, scanner.nextDouble());
            }
            scanner.nextLine();
        }
        System.out.println("\n SalarioS Mensuales");
        for (Empleado emp : empleados) {
            System.out.printf("%s: $%,.2f%n", emp.getNombre(), emp.CalcularSalarioMensual());
        }
        scanner.close();
    }
}


