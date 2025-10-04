package Herenciaocho;

public class Geografico extends Mapa {
    private String maximoRelieve;
    private String tipoClima;

    public Geografico() {
        super();
        this.maximoRelieve = "Desconocido";
        this.tipoClima = "Desconocido";
    }

    public Geografico(String tamaño, String ubicacion, String maximoRelieve, String tipoClima) {
        super(tamaño, ubicacion);
        this.maximoRelieve = maximoRelieve;
        this.tipoClima = tipoClima;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== MAPA GEOGRÁFICO ===");
        super.mostrar();
        System.out.println("Máximo relieve: " + maximoRelieve);
        System.out.println("Tipo de clima: " + tipoClima);
    }
}

