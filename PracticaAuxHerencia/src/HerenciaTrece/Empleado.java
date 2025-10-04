package HerenciaTrece;

public class Empleado {
    protected String nombre;
    protected float sueldoMes;

    public Empleado() {
        this.nombre = "Desconocido";
        this.sueldoMes = 0;
    }

    public Empleado(String nombre, float sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo mensual: " + sueldoMes);
    }

    // Método polimórfico
    public float sueldoTotal() {
        return sueldoMes;
    }

    public float getSueldoMes() {
        return sueldoMes;
    }
}
