package Repaso;

import java.util.Scanner;

public class Promediodeunaseriedenumeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la cantidad de numeros: ");
		int n = scanner.nextInt();
		double suma = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Introduce el número " + i + ": ");
			suma += scanner.nextDouble();
		}

		double promedio = suma / n;
		System.out.println("El promedio es: " + promedio);

		scanner.close();
	}

}
