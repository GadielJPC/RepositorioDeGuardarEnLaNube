package LeerFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejecutar {

	public static void main(String[] args) {
		String path = "C:\\Users\\gadie\\OneDrive\\Escritorio\\escuela\\Programacion\\entrada.txt";
		File file = new File(path);

		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
