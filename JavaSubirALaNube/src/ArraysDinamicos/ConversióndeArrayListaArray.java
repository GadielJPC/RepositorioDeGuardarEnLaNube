package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Random;

public class ConversióndeArrayListaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		// Llenar el ArrayList con 10 números aleatorios
		for (int i = 0; i < 10; i++) {
			numeros.add(random.nextInt(100) + 1);
		}

		// Convertir el ArrayList en un array
		Integer[] array = new Integer[numeros.size()];
		numeros.toArray(array);

		// Imprimir el array
		System.out.println("ArrayList convertido a Array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
