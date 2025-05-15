package LeerFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModificarArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\gadie\\OneDrive\\Escritorio\\escuela\\Programacion\\entrada.txt";
		File file = new File(path);
		List<String> lines = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
			reader.close();
			for (int i = 0; i < lines.size(); i++) {
				if (lines.get(i).contains("Nota final")) {
					lines.set(i, "Nota final: Aprobado");
					break;
				}
			}

			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for (String modifiedLine : lines) {
				writer.write(modifiedLine);
				writer.newLine();
			}
			writer.close();

			System.out.println("El archivo ha sido modificado correctamente.");

		} catch (IOException e) {
			System.out.println("Ocurrió un error al leer o escribir el archivo.");
			e.printStackTrace();
		}
	}
}
