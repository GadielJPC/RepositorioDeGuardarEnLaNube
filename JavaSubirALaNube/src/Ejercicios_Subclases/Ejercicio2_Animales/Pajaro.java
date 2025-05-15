package Ejercicios_Subclases.Ejercicio2_Animales;

public class Pajaro extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println("El pajaro hace: ¡Pio pio!");
	}

	@Override
	public void moverse() {
		System.out.println("El pajaro vuela alto en el cielo.");
	}
}
