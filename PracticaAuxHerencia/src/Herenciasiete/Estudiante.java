package Herenciasiete;

public class Estudiante extends Persona {
    private String ru;
    private String matricula;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String paterno, String materno, int edad, String ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== ESTUDIANTE ===");
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Matrícula: " + matricula);
    }

    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public static double promedio(Estudiante e1, Estudiante e2) {
        return (e1.getEdad() + e2.getEdad()) / 2.0;
    }
}
