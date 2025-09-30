
package javaapplication7;
import java.util.Random;
public class JavaApplication7 {
    public static void main(String[] args) {
        Random random = new Random();
        Figura[] figuras = new Figura[5];
        for (int i = 0; i < 5; i++) {
            if (random.nextBoolean()) {
                figuras[i] = new Cuadrado(1 + random.nextDouble() * 9);
            } else {
                figuras[i] = new Circulo(1 + random.nextDouble() * 9);
            }
        }
        for (Figura f : figuras) {
            System.out.printf("%n%s - Area: %.2f, Perimetro: %.2f%n", 
                f.getClass().getSimpleName(), f.getArea(), f.getPerimetro());
            
            if (f instanceof Coloreado coloreado) {
                System.out.println("colorear: " + coloreado.comoColorear());
            }
        }
    }
    
}
