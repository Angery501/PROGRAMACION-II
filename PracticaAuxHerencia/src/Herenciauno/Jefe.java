package Herenciauno;
public class Jefe extends Persona{
	
    private String sucursal;
    private String tipo;

    public Jefe(String nombre, String apellido, int ci, String sucursal, String tipo){
        super(nombre, apellido, ci);
        this.sucursal = sucursal;
        this.tipo = tipo;
    }
    public void mostrarJefe(){
        System.out.println("DATOS DEL JEFE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ci: " + ci);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Tipo: " + tipo);
    }
}
