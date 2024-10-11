package Repaso;

import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una cadena de texto: ");
		String cadena = scanner.nextLine();
		int contadorVocales = 0;

		for (char c : cadena.toCharArray()) {
			if ("AEIUOaeiou".indexOf(c) != -1) {
				contadorVocales++;
			}
		}

		System.out.println("La cadena tiene " + contadorVocales + " vocales.");
		scanner.close();
	}
}