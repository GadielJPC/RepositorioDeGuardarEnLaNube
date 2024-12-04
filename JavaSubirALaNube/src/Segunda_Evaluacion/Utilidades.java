package Segunda_Evaluacion;

import java.util.Scanner;

public class Utilidades {
	public static void mostrarMensaje() {

		System.out.println("EN ESTE METODO VAMOS A MOSTRAR UN UNMERO POR PANTALLA");

		Scanner leer = new Scanner(System.in);

		System.out.println("Introdue unnumero por teclado");

		String cadena = leer.nextLine();

		System.out.println("Vamos a imprimir por pantalla");

	}

	public static void calcularNumeroPrimo() {

		System.out.println("EN ESTE METODO VAMOS A CALCULAR SI UN UNMERO ES PRIMO");
		// vamos a calcular si unnumero es primo
		Scanner leer = new Scanner(System.in);

		System.out.println("Introdue unnumero por teclado y calcularemos si es primo");

		int numero = leer.nextInt();

		int contador = 0;

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				contador++;
			}

		}

		if (contador == 2) {// esPrimo
			System.out.println("El numero " + numero + " es Primo");

		}

	}

}
