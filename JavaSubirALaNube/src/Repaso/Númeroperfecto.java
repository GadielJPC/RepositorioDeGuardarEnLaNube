package Repaso;
import java.util.Scanner;

import java.util.Scanner;

	public class Númeroperfecto {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un numero entero positivo: ");
		int numero = scanner.nextInt();
		int sumaDivisores = 0;

		for (int i = 1; i < numero; i++) {
			if (numero % 1 == 0) {
				sumaDivisores += i;
			}
		}

		if (sumaDivisores == numero) {
			System.out.println(numero + " es  un numero perfecto");
		} else {
			System.out.println(numero + " no es  un numero perfecto");
		}

		scanner.close();
	}

}
