package Ejercicios_Subclases.Ejercicio3_Vehículos;

public class Avion extends Vehiculo {

	public Avion(int velocidad, int capacidad) {
		super(velocidad, capacidad);
	}

	public void volar() {
		System.out.println("¡El avion esta volando a gran altitud!");
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del avion:");
		super.mostrarDetalles();
	}
}
