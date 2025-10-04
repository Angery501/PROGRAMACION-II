package Herenciaocho;

public class MainMapa {
    public static void main(String[] args) {

        Politico mp = new Politico("Grande", "América del Sur", 5, "Democrático");
        Geografico mg = new Geografico("Mediano", "Europa", "Montañas", "Templado");
        Etnico me1 = new Etnico("Pequeño", "Asia", 3, new String[]{"Han", "Tibetanos", "Uigures"});
        Etnico me2 = new Etnico("Grande", "Sudamérica", 2, new String[]{"Aymara", "Quechua"});

        Mapa[] mapas = {mp, mg, me1, me2};
        for (Mapa m : mapas) {
            m.mostrar(); 
        }

        System.out.println("\n=== MAPAS CON LA ETNIA 'Aymara' ===");
        for (Mapa m : mapas) {
            if (m instanceof Etnico) {
                Etnico e = (Etnico) m;
                if (e.tieneEtnia("Aymara")) {
                    e.mostrar();
                }
            }
        }
    }
}

