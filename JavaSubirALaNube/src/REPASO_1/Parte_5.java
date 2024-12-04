package REPASO_1;

import java.util.Scanner;

class Parte_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el numero a verificar");

		int n = scanner.nextInt();

		int factorizar = 1;

		for (int i = 1; i <= n; i++) {
			factorizar *= i;
		}
		System.out.println("el factor es: " + factorizar);
		scanner.close();
	}
}