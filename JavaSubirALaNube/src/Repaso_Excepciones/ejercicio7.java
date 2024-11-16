package Repaso_Excepciones;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int[] numeros = { 10, 20, 30, 40, 50 };
			System.out.print("Introduce un índice (0-4): ");
			int indice = scanner.nextInt();
			int valor = numeros[indice];
			System.out.println("El valor en el índice " + indice + " es: " + valor); // Mostrar el valor

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Índice fuera de rango. Introduce un número entre 0 y 4.");

		} finally {
			scanner.close(); // Cerrar siempre el Scanner
		}
	}
}