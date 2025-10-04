package PooTrece;

import java.util.Arrays;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] vitaminas; 

    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        this.vitaminas = new String[30]; 
        for (int i = 0; i < vitaminas.length; i++) {
            this.vitaminas[i] = vitaminas[i];
        }
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNroVitaminas() { return nroVitaminas; }

    public String[] getVitaminas() {
        String[] v = new String[nroVitaminas];
        for (int i = 0; i < nroVitaminas; i++) {
            v[i] = vitaminas[i];
        }
        return v;
    }

    public void mostrarInfo() {
        System.out.print("Fruta: " + nombre + " | Tipo: " + tipo + " | Vitaminas: ");
        for (int i = 0; i < nroVitaminas; i++) {
            System.out.print(vitaminas[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fruta kiwi = new Fruta("Kiwi", "Subtropical", new String[]{"K", "C", "E"});
        Fruta naranja = new Fruta("Naranja", "Cítrica", new String[]{"C", "A"});
        Fruta manzana = new Fruta("Manzana", "Templada", new String[]{"B", "C"});

        kiwi.mostrarInfo();
        naranja.mostrarInfo();
        manzana.mostrarInfo();

        Fruta[] frutas = {kiwi, naranja, manzana};
        Fruta maxVitaminas = frutas[0];
        for (Fruta f : frutas) {
            if (f.getNroVitaminas() > maxVitaminas.getNroVitaminas()) {
                maxVitaminas = f;
            }
        }
        System.out.println("\nLa fruta con más vitaminas es: " + maxVitaminas.getNombre());

        System.out.println("Vitaminas de la Naranja: " + Arrays.toString(naranja.getVitaminas()));

        int countC = 0;
        for (Fruta f : frutas) {
            for (String v : f.getVitaminas()) {
                if (v.equalsIgnoreCase("C")) {
                    countC++;
                    break; 
                }
            }
        }
        System.out.println("Número de frutas con vitamina C: " + countC);

        System.out.println("\nVitaminas ordenadas alfabéticamente en cada fruta:");
        for (Fruta f : frutas) {
            String[] ordenadas = f.getVitaminas().clone();
            Arrays.sort(ordenadas);
            System.out.println(f.getNombre() + " → " + Arrays.toString(ordenadas));
        }
    }
}

