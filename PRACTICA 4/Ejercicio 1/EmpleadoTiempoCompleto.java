package javaapplication6;
public class EmpleadoTiempoCompleto extends Empleado {
    private double salario_anual;
    
    public EmpleadoTiempoCompleto() {
        this.salario_anual = 0;
    }
    
    public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
        super(nombre);
        this.salario_anual = salario_anual;
    }
    
    public double getSalarioAnual() {
        return this.salario_anual;
    }
    
    public void setSalarioAnual(double salario_anual) {
        this.salario_anual = salario_anual;
    }
    
    @Override
    public double CalcularSalarioMensual() {
        return this.salario_anual / 12;
    }
    
    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto: " + super.toString() + 
               ", salario_anual = " + this.salario_anual;
    }
}