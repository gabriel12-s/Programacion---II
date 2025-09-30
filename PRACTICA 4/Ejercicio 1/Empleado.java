public package javaapplication6;
public abstract class Empleado {
    private String nombre;
    
    protected Empleado() {
        this.nombre = "";
    }
    
    protected Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double CalcularSalarioMensual();
    
    @Override
    public String toString() {
        return "nombre: " + this.nombre;
    }
}

 {
    
}
