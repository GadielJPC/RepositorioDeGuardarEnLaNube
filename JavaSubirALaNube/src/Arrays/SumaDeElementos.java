package Arrays;

public class SumaDeElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		System.out.println("Elementos del array:");
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		System.out.println("La suma de los elementos del array: " + suma);
	}
}
