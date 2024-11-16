package Repaso_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce un número entero: ");

			// Intentamos leer el número
			int numero = scanner.nextInt(); // Línea que puede lanzar la excepción
			System.out.println("El número ingresado es: " + numero);

		} catch (InputMismatchException e) {
			System.out.println("Error: Entrada no válida. Introduce un número entero.");

		} finally {
			scanner.close(); // Cerrar siempre el Scanner
		}
	}
}