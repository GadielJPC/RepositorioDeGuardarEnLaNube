package Ejercicios_Subclases.Ejercicio3_Vehículos;

public class Coche extends Vehiculo {

	public Coche(int velocidad, int capacidad) {
		super(velocidad, capacidad);
	}

	public void acelerar() {
		System.out.println("El coche esta acelerando. ¡Velocidad maxima alcanzada!");
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del coche:");
		super.mostrarDetalles();
	}
}
