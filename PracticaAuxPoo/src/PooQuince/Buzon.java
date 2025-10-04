package PooQuince;

import java.util.ArrayList;

class Solucion {
    static class Buzon {
        int nro;
        String[] c50;

        Buzon(int nro) {
            this.nro = nro;
            this.c50 = new String[50];
        }
    }

    static class Carta {
        String codigo;
        String descripcion;

        Carta(String codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }
    }

    public static void main(String[] args) {
        Buzon b1 = new Buzon(1);
        b1.c50[0] = "C123"; b1.c50[1] = "C456"; b1.c50[2] = "C789";

        Buzon b2 = new Buzon(2);
        b2.c50[0] = "C124"; b2.c50[1] = "C457"; b2.c50[2] = "C780";

        Buzon b3 = new Buzon(3);
        b3.c50[0] = "C125"; b3.c50[1] = "C458"; b3.c50[2] = "C781";

        Carta c1 = new Carta("C123", "Juan Alvarez");
        Carta c2 = new Carta("C456", "Pepe Mujica");
        Carta c3 = new Carta("C789", "Paty Vasques");

        String destinatarioX = "Pepe Mujica";
        int contadorX = 0;
        if (c1.descripcion.equals(destinatarioX)) contadorX++;
        if (c2.descripcion.equals(destinatarioX)) contadorX++;
        if (c3.descripcion.equals(destinatarioX)) contadorX++;
        System.out.println("Cartas recibidas por " + destinatarioX + ": " + contadorX);

        String codigoAEliminar = "C456";
        for (int i = 0; i < b1.c50.length; i++) {
            if (b1.c50[i] != null && b1.c50[i].equals(codigoAEliminar)) {
                b1.c50[i] = null;
                break;
            }
        }

        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add(c1.descripcion);
        destinatarios.add(c2.descripcion);
        destinatarios.add(c3.descripcion);
        for (String destinatario : destinatarios) {
            boolean recibido = false;
            for (String codigo : b1.c50) {
                if (codigo != null && destinatarios.contains(codigo)) {
                    recibido = true;
                    break;
                }
            }
            if (recibido) {
                System.out.println(destinatario + " ha recibido una carta.");
            }
        }

        String palabraClave = "amigo";
        Carta cartaConPalabra = null;
        if (c1.descripcion.contains(palabraClave)) cartaConPalabra = c1;
        else if (c2.descripcion.contains(palabraClave)) cartaConPalabra = c2;
        else if (c3.descripcion.contains(palabraClave)) cartaConPalabra = c3;
        if (cartaConPalabra != null) {
            System.out.println("Palabra '" + palabraClave + "' encontrada en carta con código: " + cartaConPalabra.codigo);
        } else {
            System.out.println("Palabra '" + palabraClave + "' no encontrada.");
        }

        for (int i = 0; i < b1.c50.length; i++) {
            if (b1.c50[i] != null) {
                for (Carta c : new Carta[]{c1, c2, c3}) {
                    if (c.codigo.equals(b1.c50[i])) {
                        System.out.println("Código: " + c.codigo + ", Remitente: Buzon " + b1.nro + ", Destinatario: " + c.descripcion);
                    }
                }
            }
        }
    }
}