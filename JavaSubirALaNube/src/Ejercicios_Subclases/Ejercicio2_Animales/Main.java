package Ejercicios_Subclases.Ejercicio2_Animales;

public class Main {

	public static void main(String[] args) {

		Animal perro = new Perro();
		Animal gato = new Gato();
		Animal pajaro = new Pajaro();

		System.out.println("Perro: ");
		perro.hacerSonido();
		perro.moverse();
		System.out.println("");

		System.out.println("Gato: ");
		gato.hacerSonido();
		gato.moverse();
		System.out.println("");

		System.out.println("Pajaro: ");
		pajaro.hacerSonido();
		pajaro.moverse();
	}

}
