package HerenciaTrece;

public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== ADMINISTRATIVO ===");
        super.mostrar();
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo total: " + sueldoTotal());
    }

    @Override
    public float sueldoTotal() {
        return sueldoMes; 
    }
}

