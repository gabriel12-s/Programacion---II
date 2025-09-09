public class Vector3D {
    private double x, y, z;

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D sumar(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D multiplicarEscalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normal() {
        double mag = longitud();
        if (mag == 0) return new Vector3D();
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector3D productoVectorial(Vector3D v) {
        double newX = this.y * v.z - this.z * v.y;
        double newY = this.z * v.x - this.x * v.z;
        double newZ = this.x * v.y - this.y * v.x;
        return new Vector3D(newX, newY, newZ);
    }

    public Vector3D proyeccionOrtogonal(Vector3D b) {
        double escalar = this.productoEscalar(b) / (b.longitud() * b.longitud());
        return b.multiplicarEscalar(escalar);
    }

    public boolean esPerpendicular(Vector3D v) {
        return this.productoEscalar(v) == 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 0, 0);  
        Vector3D b = new Vector3D(0, 1, 0);  

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        Vector3D c = a.sumar(b);
        System.out.println("a + b = " + c);

        Vector3D d = a.multiplicarEscalar(2);
        System.out.println("2 * a = " + d);

        System.out.println("Longitud de a: " + a.longitud());

        System.out.println("Normal de a: " + a.normal());

        System.out.println("a * b = " + a.productoEscalar(b));

        System.out.println("a x b = " + a.productoVectorial(b));

        System.out.println("a y b son perpendiculares? " + a.esPerpendicular(b));

        System.out.println("Proyeccion de a sobre b: " + a.proyeccionOrtogonal(b));
    }
}

