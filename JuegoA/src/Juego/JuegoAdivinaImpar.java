package Juego;

class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            System.out.println("⚠️ Número inválido, debe estar entre 0 y 10.");
            return false;
        }
        if (num % 2 != 0) {
            return true;
        } else {
            System.out.println("⚠️ El número debe ser IMPAR.");
            return false;
        }
    }
}