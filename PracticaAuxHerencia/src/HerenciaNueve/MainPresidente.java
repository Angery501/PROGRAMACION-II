package HerenciaNueve;

public class MainPresidente {
    public static void main(String[] args) {

        Partido p1 = new Partido("Partido Verde", "Líder Nacional");
        Presidente pres1 = new Presidente("Luis", "Arce", "Economista", 20, p1);

        Presidente pres2 = new Presidente("Gabriel", "Borja", "Abogado", 15, new Partido("Partido Social", "Secretario"));

        Presidente pres3 = new Presidente("María", "Suárez", "Ingeniera Civil", 10, new Partido("Partido Popular", "Miembro"));

        Presidente[] presidentes = {pres1, pres2, pres3};

        for (Presidente p : presidentes) {
            p.mostrar();
        }

        String nombreBuscado = "María";
        System.out.println("\n=== BÚSQUEDA DE PRESIDENTE: " + nombreBuscado + " ===");

        boolean encontrado = false;
        for (Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Profesión: " + p.profesion);
                System.out.println("Partido político: " + p.getPartido().nombreP);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un presidente con ese nombre.");
        }
    }
}

