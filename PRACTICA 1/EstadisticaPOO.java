public class EstadisticaPOO {
    private double[] datos;

    public EstadisticaPOO(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double d : datos) suma += d;
        return suma / datos.length;
    }

    public double desviacion() {
        double suma = 0;
        double prom = promedio();
        for (double d : datos) suma += Math.pow(d - prom, 2);
        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("¿Cuántos datos desea ingresar?: ");
        int n = sc.nextInt();
        double[] datos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }
        EstadisticaPOO estadistica = new EstadisticaPOO(datos);
        System.out.printf("El promedio es %.2f\n", estadistica.promedio());
        System.out.printf("La desviación estándar es %.5f\n", estadistica.desviacion());
        sc.close();
    }
}
