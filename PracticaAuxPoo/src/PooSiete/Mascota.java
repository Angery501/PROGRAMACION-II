package PooSiete;
//ejercicio7
public class Mascota {
    
    private String nombre;
    private String tipo;
    private int energia;

    
    public Mascota(String nombre, String tipo, int energia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
    }

    
    public void alimentar() {
        energia += 20;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " ha sido alimentado. Energía actual: " + energia);
    }

    
    public void jugar() {
        energia -= 15;
        if (energia < 0) {
            energia = 0;
        }
        System.out.println(nombre + " ha jugado. Energía actual: " + energia);
    }

    
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " | Tipo: " + tipo + " | Energía: " + energia);
    }
    public static void main(String[] args) {
        
        Mascota perro = new Mascota("Firulais", "Perro", 50);
        Mascota gato = new Mascota("Misu", "Gato", 70);

        
        perro.mostrarInfo();
        gato.mostrarInfo();

        
        perro.alimentar();
        gato.alimentar();

        
        perro.jugar();
        gato.jugar();

        
        perro.mostrarInfo();
        gato.mostrarInfo();
    }
}
