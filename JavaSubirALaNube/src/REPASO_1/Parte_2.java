package REPASO_1;

public class Parte_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("El numero maximos es " + max);
		System.out.println("El numero minimo es " + min);
	}

}
