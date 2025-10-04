package HerenciaQuince;

public class MainTriatlon {
    public static void main(String[] args) {

    	Triatleta t1 = new Triatleta("Luis Miguel", "Mariposa", "Montaña", 10.5);

        t1.mostrarInfo();

        System.out.println("\n=== ACCIONES DEL TRIATLETA ===");
        t1.nadar();
        t1.pedalear();
        t1.correr();
    }
}

