package Empleado;

class EmpleadoTiempoHorario extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + " | Horas: " + horasTrabajadas + 
               " | Tarifa: " + tarifaPorHora +
               " | Salario Mensual: " + calcularSalarioMensual();
    }
}