package Arrays;

public class EncontrarElMayorYElMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		int mayor = numeros[0];
		int menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		System.out.println("Elementos del array:");
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}

		System.out.println("El numero mayor es: " + menor);
		System.out.println("El numero menor es: " + mayor);

	}

}
