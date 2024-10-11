package Repaso;

import java.util.Scanner;

public class Númerodedígitosdeunnúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un numero entero ");
		int numero = scanner.nextInt();

		int contador = 0;

		if (numero == 0) {
			contador = 1;
		} else {
			while (numero != 0) {
				numero /= 10;
				contador++;

			}
		}
		System.out.println("El numero tiene " + contador + " digitos.");

		scanner.close();
	}

}
