package Ejercicios_Subclases.Ejercicio3_Vehículos;

public class Main {

	public static void main(String[] args) {

		Coche coche = new Coche(180, 5);
		Bicicleta bicicleta = new Bicicleta(25, 1);
		Avion avion = new Avion(900, 180);

		System.out.println("Coche:");
		coche.mostrarDetalles();
		coche.acelerar();
		System.out.println("");

		System.out.println("");
		bicicleta.mostrarDetalles();
		bicicleta.hacerPirueta();
		System.out.println("");

		System.out.println("Avion:");
		avion.mostrarDetalles();
		avion.volar();
	}

}
