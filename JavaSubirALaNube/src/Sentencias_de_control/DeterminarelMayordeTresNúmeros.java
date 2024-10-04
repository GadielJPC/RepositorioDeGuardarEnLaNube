package Sentencias_de_control;

import java.util.Scanner;

public class DeterminarelMayordeTresNúmeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	     System.out.print("Introduce numero 1: ");
	     int numero = scanner.nextInt();
	     System.out.print("Introduce numero 2: ");
	     int numero2 = scanner.nextInt();
	     System.out.print("Introduce numero 3: ");
	     int numero3 = scanner.nextInt();
	     
	     if (numero == numero2 && numero2 == numero3) {
	     System.out.println("Todos los numeros son iguales");
	     
	}	else if (numero >= numero2 && numero >= numero3) {
		System.out.println("El numero mayor es: " + numero);
	}	else if (numero2 >= numero && numero2 >= numero3) {
		System.out.println("El numero mayor es: " + numero2);
	}	else {
		System.out.println("El numero mayor es: " + numero3);
	}
	     scanner.close();
	}
}