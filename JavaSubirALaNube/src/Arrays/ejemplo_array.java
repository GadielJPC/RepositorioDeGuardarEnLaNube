package Arrays;

public class ejemplo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		System.out.println("Elementos del array:");
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}

	}
}