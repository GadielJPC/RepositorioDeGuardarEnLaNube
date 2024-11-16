package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lecturadearchivos {

	public static void main(String[] args) {
		// Se crea un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicita al usuario que ingrese la ruta del archivo a leer
		System.out.print("Ingresa la ruta del archivo a leer: ");
		String rutaArchivo = scanner.nextLine();

		// Intenta abrir y leer el archivo especificado por el usuario
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;
			// Lee y muestra cada línea del archivo hasta llegar al final
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// Maneja cualquier excepción que ocurra al intentar leer el archivo
			System.out.println("Error al leer el archivo: " + e.getMessage());
		} finally {
			// Cierra el objeto Scanner para liberar los recursos
			scanner.close();
		}
	}
}