package javaapplication7;
public class Cuadrado extends Figura implements Coloreado {
    private double lado;
    public Cuadrado() {
        this.lado = 1;
    }
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    public double getLado() {
        return this.lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
    @Override
    public double getPerimetro() {
        return 4 * this.lado;
    }
    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }
    @Override
    public String toString() {
        return "Cuadrado: " + super.toString() + ", lado = " + this.lado;
    }
}


