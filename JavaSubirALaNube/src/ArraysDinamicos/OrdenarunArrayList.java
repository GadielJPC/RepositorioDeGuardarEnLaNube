package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarunArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Pedir números al usuario hasta que ingrese un número negativo
		System.out.println("Ingresa números (un número negativo para detener):");
		while (true) {
			int numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			numeros.add(numero);
		}

		// Ordenar el ArrayList
		Collections.sort(numeros);

		// Imprimir el ArrayList ordenado
		System.out.println("ArrayList ordenado: " + numeros);
	}

}
