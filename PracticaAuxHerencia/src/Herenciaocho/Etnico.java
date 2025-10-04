package Herenciaocho;

public class Etnico extends Mapa {
    private int nroEtnias;
    private String[] nombresEtnicos;

    public Etnico() {
        super();
        this.nroEtnias = 0;
        this.nombresEtnicos = new String[20];
    }

    public Etnico(String tamaño, String ubicacion, int nroEtnias, String[] nombresEtnicos) {
        super(tamaño, ubicacion);
        this.nroEtnias = nroEtnias;
        this.nombresEtnicos = nombresEtnicos;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== MAPA ÉTNICO ===");
        super.mostrar();
        System.out.println("Número de etnias: " + nroEtnias);
        System.out.print("Etnias: ");
        for (int i = 0; i < nroEtnias; i++) {
            System.out.print(nombresEtnicos[i]);
            if (i < nroEtnias - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public boolean tieneEtnia(String etniaBuscada) {
        for (int i = 0; i < nroEtnias; i++) {
            if (nombresEtnicos[i].equalsIgnoreCase(etniaBuscada)) {
                return true;
            }
        }
        return false;
    }
}
