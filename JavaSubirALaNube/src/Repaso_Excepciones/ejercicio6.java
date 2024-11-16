package Repaso_Excepciones;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce un número decimal: ");
			String input = scanner.nextLine();
			double numero = Double.parseDouble(input);
			System.out.println("El número decimal ingresado es: " + numero); // Mostrar el número ingresado

		} catch (NumberFormatException e) {
			System.out.println("Error: Entrada no válida. Introduce un número decimal válido.");

		} finally {
			scanner.close(); // Cerrar siempre el Scanner
		}
	}
}