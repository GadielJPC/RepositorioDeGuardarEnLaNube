package Repaso;

import java.util.Scanner;

public class Factorialdeunnúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un numero positivo: ");
		int numero = scanner.nextInt();

		if (numero >= 0) {
			int factorial = 1;

			for (int i = 1; i <= numero; i++) {
				factorial *= i;

			}

			System.out.println("El factorial de " + numero + " es: " + factorial);
		} else {
			System.out.println("El numero debe ser un entero positivo.");
		}

		scanner.close();
	}
}