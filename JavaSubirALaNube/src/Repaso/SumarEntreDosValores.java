package Repaso;

import java.util.Scanner;

public class SumarEntreDosValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introdice el primero numero (A): ");
		int a = scanner.nextInt();

		System.out.print("Introdice el primero numero (B): ");
		int b = scanner.nextInt();
		int suma = 0;

		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			suma += i;
		}

		System.out.println("La suma de los numeros entre " + a + " y " + b + " es: " + suma);
		scanner.close();
	}
}
