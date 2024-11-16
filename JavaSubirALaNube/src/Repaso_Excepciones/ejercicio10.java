package Repaso_Excepciones;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce el numerador: ");
			int numerador = scanner.nextInt();

			System.out.print("Introduce el denominador: ");
			int denominador = scanner.nextInt();
			// Intentamos realizar la división
			int resultado = numerador / denominador; // Línea que puede lanzar la excepción
			System.out.println("El resultado de la division es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Eror: no se puede dividir entre cero");

		} finally {
			scanner.close();
		}
	}
}
