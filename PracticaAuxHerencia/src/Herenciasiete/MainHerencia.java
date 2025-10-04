package Herenciasiete;

public class MainHerencia {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Luis", "Pérez", "Mamani", 20, "RU123", "MAT001");
        Estudiante e2 = new Estudiante("Ana", "Gómez", "López", 22, "RU456", "MAT002");
        Docente d1 = new Docente("Carlos", "Torrez", "Ramos", 22, 4500, "RP789");

        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        double promedio = Estudiante.promedio(e1, e2);
        System.out.println("\nPromedio de edad de los estudiantes: " + promedio);

        e1.modificarEdad(23);
        System.out.println("\nDespués de modificar edad del estudiante 1:");
        e1.mostrar();

        if (e2.getEdad() == d1.getEdad()) {
            System.out.println("\nEl estudiante " + e2.nombre + " tiene la misma edad que el docente.");
        } else {
            System.out.println("\nNingún estudiante tiene la misma edad que el docente.");
        }
    }
}
