package Herenciaocho;

public class Mapa {
    protected String tamaño;
    protected String ubicacion;

    public Mapa() {
        this.tamaño = "Desconocido";
        this.ubicacion = "Desconocida";
    }

    public Mapa(String tamaño, String ubicacion) {
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
    }

    public void mostrar() {
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Ubicación: " + ubicacion);
    }
}
