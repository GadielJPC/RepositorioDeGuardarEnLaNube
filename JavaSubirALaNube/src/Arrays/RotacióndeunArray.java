package Arrays;

import java.util.Arrays;

public class RotacióndeunArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 1, 2, 3, 4, 5 };

		// Guardar el último elemento
		int ultimo = numeros[numeros.length - 1];

		// Mover los demás elementos una posición a la derecha
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}

		// Colocar el último elemento en la primera posición
		numeros[0] = ultimo;

		// Imprimir el array rotado
		System.out.println("Array rotado: " + Arrays.toString(numeros));
	}

}
