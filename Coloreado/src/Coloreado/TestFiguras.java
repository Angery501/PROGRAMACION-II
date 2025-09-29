package Coloreado;
import java.util.Random;

public class TestFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; 
            if (tipo == 1) {
                double lado = rand.nextInt(10) + 1;
                Cuadrado c = new Cuadrado(lado);
                c.setColor("Rojo");
                figuras[i] = c;
            } else {
                double radio = rand.nextInt(10) + 1;
                Circulo cir = new Circulo(radio);
                cir.setColor("Azul");
                figuras[i] = cir;
            }
        }

        System.out.println("\n--- Figuras generadas ---");
        for (Figura f : figuras) {
            System.out.println(f);
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }
            System.out.println("-------------------------");
        }
    }
}
