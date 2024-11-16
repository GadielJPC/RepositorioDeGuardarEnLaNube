package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

class CrearArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese 5 números
		System.out.println("Ingresa 5 números enteros:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt();
			numeros.add(numero); // Agregar el número al ArrayList
		}

		// Imprimir el contenido del ArrayList
		System.out.println("Números ingresados: " + numeros);
	}
}