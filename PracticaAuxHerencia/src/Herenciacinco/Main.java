package Herenciacinco;
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("João", "ABC123", 1, 50, "SindicatoX");
        Auto auto = new Auto("Maria", "XYZ789", 2, 4, true);
        Moto moto = new Moto("Pedro", "MNO456", 3, 250, false);
        System.out.println("DATOS DE LOS CONDUCTORES");
        System.out.println("\nBUS");
        bus.mostrar();
        System.out.println("\nAUTO");
        auto.mostrar();
        System.out.println("\nMOTO");
        moto.mostrar();
        System.out.println("\nDATOS DESPUES DE CAMBIAR DE CONDuCTOR");
        bus.cambiarConductor("Roberto");
        System.out.println("Novo condutor de Bus es: " + bus.conductor);
        auto.cambiarConductor("Jorge");
        System.out.println("Novo condutor de auto es: " + auto.conductor);
        moto.cambiarConductor("Marcos");
        System.out.println("Novo condutor de Moto : " + moto.conductor);
    }
}