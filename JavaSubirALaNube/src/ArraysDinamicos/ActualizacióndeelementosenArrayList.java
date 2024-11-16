package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class ActualizacióndeelementosenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Llenar el ArrayList con 10 números
		for (int i = 0; i < 10; i++) {
			numeros.add(i + 1);
		}

		// Mostrar el ArrayList actual
		System.out.println("ArrayList actual: " + numeros);

		// Pedir al usuario que actualice un valor en una posición específica
		System.out.println("Ingresa el índice (0-9) del número que deseas actualizar:");
		int indice = scanner.nextInt();
		System.out.println("Ingresa el nuevo valor:");
		int nuevoValor = scanner.nextInt();

		// Actualizar el valor
		numeros.set(indice, nuevoValor);

		// Imprimir el ArrayList actualizado
		System.out.println("ArrayList actualizado: " + numeros);
	}

}
