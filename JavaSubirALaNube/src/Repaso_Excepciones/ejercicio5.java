package Repaso_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introduce un número entero: ");
			int numero = scanner.nextInt();
			System.out.println("El número es: " + numero);
		} catch (InputMismatchException e) {
			System.out.println("Error: entrada no valida. Introduce un numero entero");
		}
	}
}
