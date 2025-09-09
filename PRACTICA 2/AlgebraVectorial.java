public class Vector {
    private double x, y;

    public Vector() {
        this.x = 0;
        this.y = 0;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y);
    }

    public double productoEscalar(Vector v) {
        return this.x * v.x + this.y * v.y;
    }

    public boolean esPerpendicular(Vector v) {
        return this.productoEscalar(v) == 0;
    }

    public boolean esPerpendicular(Vector v, double tolerancia) {
        double producto = this.productoEscalar(v);
        return Math.abs(producto) < tolerancia;
    }

    public boolean esParalelo(Vector v) {
        double cruce = this.x * v.y - this.y * v.x;
        return cruce == 0 && !esPerpendicular(v);
    }

    public Vector proyeccionOrtogonal(Vector b) {
        double escalar = this.productoEscalar(b) / (b.magnitud() * b.magnitud());
        return new Vector(escalar * b.x, escalar * b.y);
    }

    public double componenteEn(Vector b) {
        return this.productoEscalar(b) / b.magnitud();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Vector a = new Vector(1, 0);  
        Vector b = new Vector(0, 1);  

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("a y b son perpendiculares? " + a.esPerpendicular(b));
        System.out.println("Producto escalar a*b = " + a.productoEscalar(b));

        Vector c = new Vector(2, 0);  // Vector (2, 0), paralelo a a
        System.out.println("a y c son paralelos? " + a.esParalelo(c));

        Vector proj = a.proyeccionOrtogonal(b);
        System.out.println("Proyeccion de a sobre b: " + proj);

        System.out.println("Componente de a en b: " + a.componenteEn(b));
    }
}
