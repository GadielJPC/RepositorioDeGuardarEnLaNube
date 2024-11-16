package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class SumartodosloselementosdeunArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int suma = 0;

		// Pedir al usuario que ingrese números
		System.out.println("Ingresa números (ingresa un número negativo para terminar):");
		while (true) {
			int numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			numeros.add(numero);
		}

		// Sumar todos los elementos
		for (int numero : numeros) {
			suma += numero;
		}

		// Imprimir la suma
		System.out.println("La suma de los elementos es: " + suma);
	}

}
