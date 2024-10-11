package Repaso;

import java.util.Scanner;

public class Sumadelosdígitosdeunnúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un numero entero: ");
		int numero = scanner.nextInt();
		int suma = 0;

		while (numero != 0) {
			suma += numero % 10;
			numero /= 10;
		}

		System.out.println("La suma de los digitos es: " + suma);
		scanner.close();
	}

}
