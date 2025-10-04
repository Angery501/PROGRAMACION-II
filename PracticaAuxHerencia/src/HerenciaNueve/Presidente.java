package HerenciaNueve;

public class Presidente extends Politico {
    private String nombre;
    private String apellido;
    private Partido partido;

    public Presidente() {
        super();
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.partido = new Partido();
    }

    public Presidente(String nombre, String apellido, String profesion, int añosExp, Partido partido) {
        super(profesion, añosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public void mostrar() {
        System.out.println("\n=== PRESIDENTE ===");
        System.out.println("Nombre: " + nombre + " " + apellido);
        super.mostrar();
        partido.mostrar();
    }

    public String getNombre() {
        return nombre;
    }

    public Partido getPartido() {
        return partido;
    }
}
