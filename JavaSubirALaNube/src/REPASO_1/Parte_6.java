package REPASO_1;

import java.util.Scanner;

public class Parte_6 {

	// Método para calcular el promedio
	public static double CalcularPromedio(int fisica, int quimica, int matematicas) {
		return (fisica + quimica + matematicas) / 3.0; // Sumamos y dividimos entre 3
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] estudiantes = new String[3];
		int[] fisica = new int[3];
		int[] quimica = new int[3];
		int[] matematicas = new int[3];

		// Ingreso de datos
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingrese el nombre del estudiante: ");
			estudiantes[i] = scanner.nextLine();

			System.out.print("Ingrese la nota de física: ");
			fisica[i] = scanner.nextInt();

			System.out.print("Ingrese la nota de química: ");
			quimica[i] = scanner.nextInt();

			System.out.print("Ingrese la nota de matemáticas: ");
			matematicas[i] = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer
		}

		// Cálculo y salida
		for (int i = 0; i < 3; i++) {
			double promedio = CalcularPromedio(fisica[i], quimica[i], matematicas[i]);
			System.out.println("El estudiante " + estudiantes[i] + " tiene un promedio de: " + promedio);
		}

		scanner.close();
	}
}