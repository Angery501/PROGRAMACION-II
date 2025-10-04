package HerenciaTrece;

public class Chef extends Empleado {
    private int horaExtra;
    private String tipo;
    private float sueldoHora;

    public Chef(String nombre, float sueldoMes, int horaExtra, String tipo, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.tipo = tipo;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== CHEF ===");
        super.mostrar();
        System.out.println("Tipo: " + tipo);
        System.out.println("Horas extra: " + horaExtra);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Sueldo total: " + sueldoTotal());
    }

    @Override
    public float sueldoTotal() {
        return sueldoMes + (horaExtra * sueldoHora);
    }
}
