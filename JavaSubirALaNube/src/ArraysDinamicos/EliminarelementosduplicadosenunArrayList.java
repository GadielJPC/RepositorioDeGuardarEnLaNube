package ArraysDinamicos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EliminarelementosduplicadosenunArrayList {

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

		// Eliminar duplicados usando un HashSet
		HashSet<Integer> sinDuplicados = new HashSet<>(numeros);
		numeros.clear(); // Limpiar el ArrayList original
		numeros.addAll(sinDuplicados); // Volver a agregar los números únicos

		// Imprimir el ArrayList sin duplicados
		System.out.println("ArrayList sin duplicados: " + numeros);
	}

}
