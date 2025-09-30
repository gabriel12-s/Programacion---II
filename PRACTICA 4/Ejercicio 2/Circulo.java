
package javaapplication7;
public class Circulo extends Figura {
    private double radio;
    public Circulo() {
        this.radio = 1;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
    @Override
    public String toString() {
        return "Circulo: " + super.toString() + ", radio = " + this.radio;
    }
}

