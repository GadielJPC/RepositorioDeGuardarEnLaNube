package CONTROL;

import java.util.Scanner;

public class pregunta2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero = leer.nextInt();
		CalcularSumaHastaN(numero);
		leer.close();

	}

	public static int CalcularSumaHastaN(int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		System.out.println("La suma de de los numeros hasta N es: " + suma);
		return suma;
	}
}