package javaapplication6;
public class EmpleadoTiempoHorario extends Empleado {
    private double horas_trabajadas;
    private double tarifa_por_hora;
    
    public EmpleadoTiempoHorario() {
        this.horas_trabajadas = 0;
        this.tarifa_por_hora = 0;
    }
    public EmpleadoTiempoHorario(String nombre, double horas_trabajadas, double tarifa_por_hora) {
        super(nombre);
        this.horas_trabajadas = horas_trabajadas;
        this.tarifa_por_hora = tarifa_por_hora;
    }
    public double getHorasTrabajadas() {
        return this.horas_trabajadas;
    }
    public void setHorasTrabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }
    public double getTarifaPorHora() {
        return this.tarifa_por_hora;
    }
    public void setTarifaPorHora(double tarifa_por_hora) {
        this.tarifa_por_hora = tarifa_por_hora;
    }
    @Override
    public double CalcularSalarioMensual() {
        return this.horas_trabajadas * this.tarifa_por_hora;
    }
    @Override
    public String toString() {
        return "EmpleadoTiempoHorario: " + super.toString() + 
               ", horas_trabajadas = " + this.horas_trabajadas + 
               ", tarifa_por_hora = " + this.tarifa_por_hora;
    }
}



