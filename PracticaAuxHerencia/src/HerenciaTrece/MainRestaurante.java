package HerenciaTrece;

public class MainRestaurante {
    public static void main(String[] args) {
        Chef chef = new Chef("Remy", 2500, 10, "Gourmet", 50);

        Mesero mes1 = new Mesero("Alfredo", 1800, 200, 5, 30);
        Mesero mes2 = new Mesero("Linguini", 1900, 150, 4, 25);

        Administrativo adm1 = new Administrativo("Colette", 2100, "Gerente");
        Administrativo adm2 = new Administrativo("Skinner", 2200, "Administrador General");

        Empleado[] empleados = {chef, mes1, mes2, adm1, adm2};

        System.out.println("=== LISTA DE EMPLEADOS ===");
        for (Empleado e : empleados) {
            e.mostrar();
        }

        float x = 1900;
        System.out.println("\n=== EMPLEADOS CON SUELDO MENSUAL IGUAL A " + x + " ===");
        for (Empleado e : empleados) {
            if (e.getSueldoMes() == x) {
                e.mostrar();
            }
        }
    }
}
