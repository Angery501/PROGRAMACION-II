package Juego;

public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        System.out.println("\n=== 🎮 Juego Adivina Número ===");
        juegoNormal.juega();

        System.out.println("\n=== 🎮 Juego Adivina Número PAR ===");
        juegoPar.juega();

        System.out.println("\n=== 🎮 Juego Adivina Número IMPAR ===");
        juegoImpar.juega();
    }
}