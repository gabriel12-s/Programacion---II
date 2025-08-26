
public class EcuacionCuadratica {
    
    private double a, b, c;

   
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a; 
        this.b = b; 
        this.c = c; 
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        double disc = getDiscriminante(); 
        if (disc < 0) return 0; 
        return (-b + Math.sqrt(disc)) / (2 * a); 
    }

    
    public double getRaiz2() {
        double disc = getDiscriminante(); 
        if (disc < 0) return 0; 
        return (-b - Math.sqrt(disc)) / (2 * a); 
    }
//----------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese los coeficientes a, b y c de la ecuacion cuadratica ax^2 + bx + c = 0:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double disc = eq.getDiscriminante();

        if (disc > 0) {
            System.out.println("La ecuacion tiene dos raices " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (disc == 0) {
            System.out.println("La ecuacion tiene una raiz " + eq.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        sc.close();
    }
}
