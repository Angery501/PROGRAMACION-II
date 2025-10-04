package Herenciacinco;
public abstract class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public void mostrar(){
        System.out.println("Conductor: "+conductor);
        System.out.println("Placa: "+placa);
    }

    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
    }
}