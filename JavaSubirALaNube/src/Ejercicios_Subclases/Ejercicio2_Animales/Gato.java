package Ejercicios_Subclases.Ejercicio2_Animales;

public class Gato extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println("El gato hace: ¡Miau miau!");
	}

	@Override
	public void moverse() {
		System.out.println("El gato camina sigilosamente.");
	}
}
