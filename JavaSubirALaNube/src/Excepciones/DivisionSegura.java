package Excepciones;

import java.util.Scanner;

public class DivisionSegura {
	public static double dividir(int numerador, int denominador) throws ArithmeticException {
		if (denominador == 0) {
			throw new ArithmeticException("No se puede dividir por cero.");
		}
		return (double) numerador / denominador;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Ingresa el numerador: ");
			int numerador = scanner.nextInt();
			System.out.print("Ingresa el denominador: ");
			int denominador = scanner.nextInt();

			double resultado = dividir(numerador, denominador);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
