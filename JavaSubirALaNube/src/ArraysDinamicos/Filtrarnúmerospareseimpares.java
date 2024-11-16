package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Filtrarnúmerospareseimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese números
		System.out.println("Ingresa números (ingresa un número negativo para terminar):");
		while (true) {
			int numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			numeros.add(numero);
		}

		// Separar los números en pares e impares
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				pares.add(numero);
			} else {
				impares.add(numero);
			}
		}

		// Imprimir los números pares e impares
		System.out.println("Números pares: " + pares);
		System.out.println("Números impares: " + impares);
	}

}
