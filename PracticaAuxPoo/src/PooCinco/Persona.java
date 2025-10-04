package PooCinco;
//Ejercicio5

public class Persona {
	private String nombre;
	private String paterno;
	private String materno;
	private int edad;
	private int CI;

	public Persona(String nombre, String paterno, String materno, int edad, int cI) {
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.edad = edad;
		CI = cI;
	}
	
	public void mostraDatos() {
		System.out.println(" >>>>>> Datos de la Persona <<<<<< ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido paterno: "+paterno);
		System.out.println("Apellido materno: "+materno);
		System.out.println("Edad: "+edad);
		System.out.println("CI: "+CI);
		System.out.println("-+-+-+-+-+-");
	}
	
	public void mayorDeEdad () {
		if (edad >= 18) {
			System.out.println(nombre+" Si es  mayor de edad");
		}else{
			System.out.println(nombre+" No es mayor de edad");
		}
	}
	public void modificarEdad (int nuevaEdad) {
		edad = nuevaEdad;
	} 
	
	public String getPaterno() {
		return paterno;
	}

	public static void main (String [] args) {
		Persona p1 = new Persona("Jorge","Perez","Ochoa",23,14801224);
		Persona p2 = new Persona("Valentina","Perez","Cuisara",15,7463225);
		p1.mostraDatos();
		p2.mostraDatos();
		p1.mayorDeEdad();
		p2.mayorDeEdad();
		p1.modificarEdad(17);
		p2.modificarEdad(30);
		System.out.println("\n...Datos despues de modificar la edad...");
		p1.mostraDatos();
		p2.mostraDatos();
		
		System.out.println("\n ...Comparamos apellidos...");
		 if (p1.getPaterno().equalsIgnoreCase(p2.getPaterno())) {
			 System.out.println("Si son iguales, el apellido es " +p1.getPaterno());
		 }else {
			 System.out.println("No son iguales");
	
		 }
		
	}
}