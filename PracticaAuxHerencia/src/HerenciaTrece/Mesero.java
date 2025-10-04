package HerenciaTrece;

public class Mesero extends Empleado {
    private double propina;
    private int horaExtra;
    private float sueldoHora;

    public Mesero(String nombre, float sueldoMes, double propina, int horaExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.propina = propina;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== MESERO ===");
        super.mostrar();
        System.out.println("Propina: " + propina);
        System.out.println("Horas extra: " + horaExtra);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Sueldo total: " + sueldoTotal());
    }

    @Override
    public float sueldoTotal() {
        return (float)(sueldoMes + (horaExtra * sueldoHora) + propina);
    }
}

