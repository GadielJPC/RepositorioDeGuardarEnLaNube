package Ejercicios_Subclases.Ejercicio3_Vehículos;

public class Vehiculo {

	protected int velocidad;
	protected int capacidad;

	public Vehiculo(int velocidad, int capacidad) {
		this.capacidad = capacidad;
		this.velocidad = velocidad;
	}

	public void mostrarDetalles() {
		System.out.println("Velocidad: " + velocidad + " km/h.");
		System.out.println("Capacidad: " + capacidad + " personas.");
	}
}
