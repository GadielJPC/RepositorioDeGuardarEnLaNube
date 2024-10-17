package Arrays;

import java.util.Arrays;
import java.util.Random;

public class OrdenarUnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		Random rand = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100);
		}
		// Imprimir el array original
		System.out.println("Array original: " + Arrays.toString(numeros));

		// Ordenar el array
		Arrays.sort(numeros);

		// Imprimir el array ordenado
		System.out.println("Array ordenado: " + Arrays.toString(numeros));
	}

}
