package Empleado;

import java.util.Scanner;

public class TestEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del empleado tiempo completo: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese salario anual: ");
            double salario = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salario);
        }

        for (int i = 3; i < 5; i++) {
            System.out.print("Ingrese nombre del empleado tiempo horario: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.print("Ingrese tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("\n--- Lista de empleados ---");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}