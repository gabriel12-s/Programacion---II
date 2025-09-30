package javaapplication7;
public abstract class Figura {
    private String color;
    
    public Figura() {
        this.color = "negro";
    }
    
    public Figura(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "color: " + this.color;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();
}

