package HerenciaQuince;

public class Triatleta implements Nadador, Ciclista, Corredor {
    private String nombre;
    private String estiloNatacion;
    private String tipoBicicleta;
    private double distanciaPreferida;

    public Triatleta(String nombre, String estiloNatacion, String tipoBicicleta, double distanciaPreferida) {
        this.nombre = nombre;
        this.estiloNatacion = estiloNatacion;
        this.tipoBicicleta = tipoBicicleta;
        this.distanciaPreferida = distanciaPreferida;
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando estilo " + estiloNatacion + ".");
    }

    @Override
    public void pedalear() {
        System.out.println(nombre + " está pedaleando en una bicicleta tipo " + tipoBicicleta + ".");
    }

    @Override
    public void correr() {
        System.out.println(nombre + " está corriendo una distancia de " + distanciaPreferida + " km.");
    }

    public void mostrarInfo() {
        System.out.println("\n=== DATOS DEL TRIATLETA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Estilo de natación: " + estiloNatacion);
        System.out.println("Tipo de bicicleta: " + tipoBicicleta);
        System.out.println("Distancia preferida: " + distanciaPreferida + " km");
    }
}
