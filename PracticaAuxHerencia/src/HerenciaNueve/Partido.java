package HerenciaNueve;

public class Partido {
    protected String nombreP;
    protected String rol;

    public Partido() {
        this.nombreP = "Sin partido";
        this.rol = "Ninguno";
    }

    public Partido(String nombreP, String rol) {
        this.nombreP = nombreP;
        this.rol = rol;
    }

    public void mostrar() {
        System.out.println("Partido político: " + nombreP);
        System.out.println("Rol en el partido: " + rol);
    }
}

