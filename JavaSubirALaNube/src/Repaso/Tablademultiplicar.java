package Repaso;

import java.util.Scanner;

public class Tablademultiplicar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un numero entero: ");
		int numero = scanner.nextInt();

		System.out.println("Tabla de multiplicar del " + numero + ":");
		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		scanner.close();
	}
}
