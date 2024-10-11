package Repaso;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int numeroSecreto = random.nextInt(100) + 1;
		int intento;
		int intentosMaximos = 5;

		System.out.println("Adivina el numero entre 1 y 100:");

		for (int i = 1; i <= intentosMaximos; i++) {
			System.out.print("Introduce tu intento " + i + ": ");
			intento = scanner.nextInt();

			if (intento < numeroSecreto) {
				System.out.println("El número es mayor.");
			} else if (intento > numeroSecreto) {
				System.out.println("El número es menor.");
			} else {
				System.out.println("¡Felicidades! Has adivinado el número.");
				return; // Cambiar a verdadero para salir del bucle
			}
		}
		System.out.println("Lo siento, no adivinaste el numero, Era: " + numeroSecreto);
		scanner.close();
	}
}
