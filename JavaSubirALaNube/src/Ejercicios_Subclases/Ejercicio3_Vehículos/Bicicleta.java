package Ejercicios_Subclases.Ejercicio3_Vehículos;

public class Bicicleta extends Vehiculo {

	public Bicicleta(int velocidad, int capacidad) {
		super(velocidad, capacidad);
	}

	public void hacerPirueta() {
		System.out.println("¡La bicicleta esta haciendo una pirueta expectacular!");
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles de la bicicleta:");
		super.mostrarDetalles();
	}
}
