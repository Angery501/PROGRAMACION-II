package PooTres;
//ejercicio3
public class Producto {
	private String nombre;
	private int precio;
	private int stock;
	
	public Producto (String nombre, int precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public void Vender(int cantidad) {
		int cantTotal = stock - cantidad;
		if (cantidad > stock) {
			System.out.println("No se puede vender mas de"+stock+" "+nombre+"s");
			stock = stock - cantTotal;
		}else {
			stock = stock - cantidad;
			System.out.println("Se vendieron "+cantidad+" "+nombre+"s");
		}
		System.out.println("ya solo quedan "+stock+" "+nombre+"s");
	}
	public void reabastecer(int cantidad) {
		stock = stock + cantidad;
		System.out.println("Reabastecemmos "+cantidad+" "+nombre+"s");
		System.out.println("Ahora hay "+stock+" "+nombre+"s");
	}
	public void mostrar() {
		System.out.println("el Producto es: "+ nombre);
		System.out.println("su precio es de: "+ precio+" Bs.");
		System.out.println("Y hay "+stock+" unidades de "+nombre);
	}
	public static void main (String [] args) {
		Producto uno = new Producto ("manzana", 5, 20);
		uno.mostrar();
		uno.Vender(10);
		uno.reabastecer(20);
	}
	
}