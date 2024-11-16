package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Miltiplesexcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Ingresa el primer número: ");
			int num1 = scanner.nextInt();
			System.out.print("Ingresa el segundo número: ");
			int num2 = scanner.nextInt();

			int resultado = num1 / num2;
			System.out.println("Resultado de la división: " + resultado);
		} catch (InputMismatchException e) {
			System.out.println("Error: Entrada inválida. Debes ingresar números enteros.");
		} catch (ArithmeticException e) {
			System.out.println("Error: No se puede dividir por cero.");
		} finally {
			scanner.close();
		}
	}

}
