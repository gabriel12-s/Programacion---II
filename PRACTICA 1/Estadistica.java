
public class Estadistica {
    
    public static double promedio(double[] datos) {
        double suma = 0; 
        for (double d : datos) suma += d; 
        return suma / datos.length; 
    }

    
    public static double desviacion(double[] datos) {
        double suma = 0;
        double prom = promedio(datos); // Calcular el promedio
        for (double d : datos) suma += Math.pow(d - prom, 2);
        return Math.sqrt(suma / (datos.length - 1));
    }
    //----------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Cuantos datos desea ingresar?: ");
        int n = sc.nextInt();
        double[] datos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }
        System.out.printf("El promedio es %.2f\n", promedio(datos));
        System.out.printf("La desviacion estandar es %.5f\n", desviacion(datos));
        sc.close();
    }
} 
