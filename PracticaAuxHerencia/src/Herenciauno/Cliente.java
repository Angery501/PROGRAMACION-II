package Herenciauno;
public class Cliente extends Persona{
    private int nroCOmpra;
    private int idCliente;

    public Cliente(String nombre, String apellido, int ci, int nroCOmpra, int idCliente){
        super(nombre, apellido, ci);
        this.nroCOmpra = nroCOmpra;
        this.idCliente = idCliente;
    }
    public void mostrarCliente(){
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ci: " + ci);
        System.out.println("Nro COmpra: " + nroCOmpra);
        System.out.println("IdCliente: " + idCliente);
    }
}
