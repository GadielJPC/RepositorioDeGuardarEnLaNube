package Gestion_Canciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_de_canciones {

	private static ArrayList<cancion> canciones = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char opcion;

		do {
			System.out.println("--- Menú ---");
			System.out.println("A. Alta de canción");
			System.out.println("B. Listado de canciones");
			System.out.println("C. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.next().charAt(0);
			scanner.nextLine(); // Consumir el salto de línea

			switch (Character.toUpperCase(opcion)) { // Ignorar mayúsculas o minúsculas
			case 'A':
				alta();
				break;
			case 'B':
				listado();
				break;
			case 'C':
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (Character.toUpperCase(opcion) != 'C');
	}

	private static void alta() {
		System.out.print("Ingrese el nombre de la canción: ");
		String NombreCancion = scanner.nextLine();

		System.out.print("Ingrese el grupo de música: ");
		String Grupomúsica = scanner.nextLine();

		System.out.print("Ingrese el año de la publicación: ");
		int AñoDePublicación = scanner.nextInt();
		scanner.nextLine(); // Consumir el salto de línea pendiente

		cancion nuevaCancion = new cancion(NombreCancion, Grupomúsica, AñoDePublicación);
		canciones.add(nuevaCancion);

		System.out.println("¡Canción añadida con éxito!");
	}

	private static void listado() {
		if (canciones.isEmpty()) {
			System.out.println("No hay canciones registradas.");
		} else {
			System.out.println("Listado de Canciones:");
			for (cancion c : canciones) {
				System.out.println(c); // Llama automáticamente a c.toString()
			}
		}
	}
}