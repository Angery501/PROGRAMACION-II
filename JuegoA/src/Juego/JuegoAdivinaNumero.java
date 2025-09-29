package Juego;
import java.util.Random;
import java.util.Scanner;

class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int num) {
        return num >= 0 && num <= 10;
    }

    public void juega() {
        reiniciaPartida(numeroDeVidas);
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); 
        Scanner sc = new Scanner(System.in);

        System.out.println("🔢 Adivina un número entre 0 y 10");

        while (true) {
            System.out.print("👉 Ingresa tu número: ");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("⚠️ Número inválido, debe estar entre 0 y 10.");
                continue;
            }

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
