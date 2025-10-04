package Herenciaocho;

public class Politico extends Mapa {
    private int nroPaisesLimitrofes;
    private String sistemaGobierno;

    public Politico() {
        super();
        this.nroPaisesLimitrofes = 0;
        this.sistemaGobierno = "Desconocido";
    }

    public Politico(String tamaño, String ubicacion, int nroPaisesLimitrofes, String sistemaGobierno) {
        super(tamaño, ubicacion);
        this.nroPaisesLimitrofes = nroPaisesLimitrofes;
        this.sistemaGobierno = sistemaGobierno;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== MAPA POLÍTICO ===");
        super.mostrar();
        System.out.println("N° Países Limítrofes: " + nroPaisesLimitrofes);
        System.out.println("Sistema de Gobierno: " + sistemaGobierno);
    }
}

