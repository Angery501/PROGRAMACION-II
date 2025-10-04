package PooDos;

//Ejercicio2

public class Bus {
	private int pasajeros;
	private int capacidad;
	private double pasajes;

	public Bus (int capacidad) {
		this.pasajeros=0;
		this.capacidad = capacidad;
		this.pasajes= 0.0;
	}
		
	public void subirPasajero (int x) {
		int asientosDisponibles = capacidad - pasajeros;
		if (x > asientosDisponibles ) {
			System.out.println("No hay asientos disponibles. Solo hay "+ asientosDisponibles );
			pasajeros = pasajeros + asientosDisponibles;
		}else {
			pasajeros = pasajeros + x;
			System.out.println("se subieron " + x+ " pasjeros");
		}
		System.out.println("Ahora hay "+ pasajeros + " pasajeros en el bus");
	}
	public double cobrarPasaje () {
		double costoPorPasajero = 1.5;
		double cobroTotal = pasajeros * costoPorPasajero ;
		pasajes = pasajes + cobroTotal;
		System.out.println("Se cobraron "+cobroTotal+"Bs en pasajes" );
		return cobroTotal;
		
	}
	public int asientosDisponibles() {
		int Disponibles = capacidad - pasajeros;
		System.out.println("Los asientos disponibles son "+Disponibles);
		return Disponibles;
	}
	
	public static void main (String [] args) {
		Bus puma = new Bus(30);
		puma.asientosDisponibles();
		puma.subirPasajero(10);
		puma.cobrarPasaje();
		puma.asientosDisponibles();
		puma.subirPasajero(50);
		puma.cobrarPasaje();
		puma.asientosDisponibles();
	}
}