package REPASO_1;

import java.util.Scanner;

public class Parte_3 {

	public static Boolean esPrimo(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el numero a verificar");

		int n = scanner.nextInt();

		if (esPrimo(n)) {
			System.out.println("El numero " + n + " es primo");
		} else {
			System.out.println("El numero " + n + " no es primo");
		}
		scanner.close();
	}

}
