package Ejercicios_Subclases.Ejercicio2_Animales;

public class Perro extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println("El perro hace: ¡Guau guau!");
	}

	@Override
	public void moverse() {
		System.out.println("El perro corre rapidamente.");
	}
}
