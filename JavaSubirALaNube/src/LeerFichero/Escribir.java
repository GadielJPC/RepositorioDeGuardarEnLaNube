package LeerFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir {

	public static void main(String[] args) {
		String path = "C:\\Users\\gadie\\OneDrive\\Escritorio\\escuela\\Programacion\\entrada.txt";
		File file = new File(path);

		try {
			Scanner scanner = new Scanner(file);
			System.out.println("Contenido actual del archivo:");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();

			FileWriter writer = new FileWriter(file, true);
			writer.write("\nNueva línea añadida al archivo.");
			writer.close();

			System.out.println("\nSe ha añadido una nueva línea al archivo.");

		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encontró.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo.");
			e.printStackTrace();
		}
	}
}