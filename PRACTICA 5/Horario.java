
package javaapplication9;


public class Horario {
    private String diasApertura;
    private String horaApertura;
    private String horaCierre;
    
    public Horario(String diasApertura, String horaApertura, String horaCierre) {
        this.diasApertura = diasApertura;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }
    
    public void mostrarHorario() {
        System.out.println("Horario de atencion: " + diasApertura + 
                          ", de " + horaApertura + " a " + horaCierre);
    }
    
    public String getDiasApertura() { return diasApertura; }
    public String getHoraApertura() { return horaApertura; }
    public String getHoraCierre() { return horaCierre; }
}
