package Excepciones;

import java.util.Scanner;

public class ValidacionEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Ingresa un número positivo: ");
			int numero = Integer.parseInt(scanner.nextLine());

			if (numero < 0) {
				throw new IllegalArgumentException("El número no puede ser negativo.");
			}

			System.out.println("Número ingresado: " + numero);
		} catch (NumberFormatException e) {
			System.out.println("Error: Debes ingresar un número válido.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
