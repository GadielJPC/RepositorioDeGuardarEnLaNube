package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesbásicasconArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nombres = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String nombre;

		// Pedir al usuario que ingrese nombres hasta que ingrese "fin"
		System.out.println("Ingresa nombres (escribe 'fin' para terminar):");
		while (true) {
			nombre = scanner.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}
			nombres.add(nombre);
		}

		// Imprimir los nombres ingresados
		System.out.println("Nombres ingresados: " + nombres);

		// Eliminar un nombre específico
		System.out.println("Ingresa el nombre que deseas eliminar:");
		String nombreAEliminar = scanner.nextLine();
		nombres.remove(nombreAEliminar);

		// Imprimir la lista actualizada
		System.out.println("Lista actualizada: " + nombres);
	}
}