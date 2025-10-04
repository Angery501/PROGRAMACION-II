package Herenciasiete;

public class Docente extends Persona {
    private double sueldo;
    private String regProfesional;

    public Docente() {
        super();
    }

    public Docente(String nombre, String paterno, String materno, int edad, double sueldo, String regProfesional) {
        super(nombre, paterno, materno, edad);
        this.sueldo = sueldo;
        this.regProfesional = regProfesional;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== DOCENTE ===");
        super.mostrar();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Registro Profesional: " + regProfesional);
    }
}
