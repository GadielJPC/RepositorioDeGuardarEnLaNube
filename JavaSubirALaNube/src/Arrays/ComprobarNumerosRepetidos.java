package Arrays;

public class ComprobarNumerosRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 3, 7, 3, 5, 7, 9, 10, 5, 2, 9 };

		System.out.println("Numeros repetidos en el array:");

		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				// Si se encuentra un número repetido, se imprime
				if (numeros[i] == numeros[j]) {
					System.out.println(numeros[i]);
					break; // Para evitar imprimir el mismo número varias veces
				}
			}
		}

	}

}
