package Arrays;

public class InvertirUnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 1, 2, 3, 4, 5 };

		int[] numerosInvertidos = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			numerosInvertidos[i] = numeros[numeros.length - 1 - i];
		}

		System.out.println("Array invertido:");
		for (int i = 0; i < numerosInvertidos.length; i++) {
			System.out.println(numerosInvertidos[i]);
		}
	}
}