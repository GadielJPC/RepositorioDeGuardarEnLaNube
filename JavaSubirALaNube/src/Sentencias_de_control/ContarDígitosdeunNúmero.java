package Sentencias_de_control;

import java.util.Scanner;

public class ContarDígitosdeunNúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(System.in);
		int numero = scanner.nextInt();
		
		// Validar que el número sea positivo
        if (numero < 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {
            int contadorDigitos = 0; // Inicializar el contador de dígitos
            
            // Bucle para contar los dígitos
            while (numero != 0) {
                numero = numero / 10; // Reducir el número dividiéndolo entre 10
                contadorDigitos++;    // Aumentar el contador en cada iteración
            }
            
            // Imprimir la cantidad de dígitos
            System.out.println("El número tiene " + contadorDigitos + " dígitos.");
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
}