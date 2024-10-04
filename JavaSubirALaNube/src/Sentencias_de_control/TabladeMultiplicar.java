package Sentencias_de_control;

import java.util.Scanner;

public class TabladeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	        
	        // Pedir al usuario que ingrese un número
	        System.out.print("Introduce un número entero: ");
	        int numero = scanner.nextInt();
	        
	        // Imprimir la tabla de multiplicar del número
	        System.out.println("Tabla de multiplicar del " + numero + ":");
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	        
	        // Cerrar el Scanner
	        scanner.close();
	    }
	}

