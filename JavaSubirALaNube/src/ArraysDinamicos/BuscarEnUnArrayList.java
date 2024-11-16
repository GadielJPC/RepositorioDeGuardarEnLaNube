package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarEnUnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese 10 números
		System.out.println("Ingresa 10 números enteros:");
		for (int i = 0; i < 10; i++) {
			numeros.add(scanner.nextInt());
		}

		// Pedir un número para buscar
		System.out.println("Ingresa un número para buscar:");
		int numeroBuscado = scanner.nextInt();

		// Verificar si el número está presente y su índice
		if (numeros.contains(numeroBuscado)) {
			int indice = numeros.indexOf(numeroBuscado);
			System.out.println("El número " + numeroBuscado + " está en el índice " + indice);
		} else {
			System.out.println("El número no está presente en el ArrayList.");
		}
	}

}
