
public class EcuacionLineal {

    private double a, b, c, d, e, f;


    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a; 
        this.b = b; 
        this.c = c; 
        this.d = d; 
        this.e = e; 
        this.f = f;
    }

    public boolean tieneSolucion() {
        return a * d - b * c != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

 

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
//----------------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese los coeficientes y términos independientes para el sistema de ecuaciones lineales 2x2:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        System.out.print("d: ");
        double d = sc.nextDouble();
        System.out.print("e: ");
        double e = sc.nextDouble();
        System.out.print("f: ");
        double f = sc.nextDouble();
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX() + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
        sc.close();
    }
}
