package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InvertirloselementosdeunArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
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

		// Invertir el ArrayList
		Collections.reverse(numeros);

		// Imprimir el ArrayList en orden inverso
		System.out.println("ArrayList en orden inverso: " + numeros);
	}

}
