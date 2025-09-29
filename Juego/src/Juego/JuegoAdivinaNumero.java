package Juego;
import java.util.Random;
import java.util.Scanner;
class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public void juega() {
        reiniciaPartida(numeroDeVidas);
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // 0 a 10
        Scanner sc = new Scanner(System.in);

        System.out.println("🔢 Adivina un número entre 0 y 10");

        while (true) {
            System.out.print("👉 Ingresa tu número: ");
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("✅ Acertaste!! El número era: " + numeroAAdivinar);
                actualizaRecord();
                break;
            } else {
                System.out.println("❌ Fallaste...");
                if (!quitaVida()) break;

                if (intento < numeroAAdivinar) {
                    System.out.println("Pista: El número es mayor.");
                } else {
                    System.out.println("Pista: El número es menor.");
                }
            }
        }
    }
}