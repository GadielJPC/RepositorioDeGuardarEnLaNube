package Empleados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;

public class Empleado {

	protected String nombre;
	protected String DNI;
	protected int anio;

	public void pedirDatos() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.print("Ingrese el DNI: ");
		DNI = scanner.nextLine();
		System.out.print("Ingrese el anio: ");
		anio = scanner.nextInt();
	}

	public void muestraDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + DNI);
		System.out.println("Anio: " + anio);
	}

	public void escribirFichero(String filename) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
			writer.write("Nombre: " + nombre + ", DNI: " + DNI + ", Año: " + anio);
			writer.newLine();
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}
}
