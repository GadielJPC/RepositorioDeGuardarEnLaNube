package Interfaces;
import java.util.Scanner;
import java.util.Random;


public class AdivinarunNúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // Generar un número aleatorio entre 1 y 100
	        int numeroAleatorio = random.nextInt(100) + 1;
	        int intento = 0;
	        int numeroUsuario;

	        System.out.println("Adivina el número entre 1 y 100:");

	        // Bucle para seguir pidiendo al usuario hasta que adivine
	        while (intento != numeroAleatorio) {
	            // Leer el intento del usuario
	            System.out.print("Introduce un número: ");
	            numeroUsuario = scanner.nextInt();

	            if (numeroUsuario < numeroAleatorio) {
	                System.out.println("El número es mayor.");
	            } else if (numeroUsuario > numeroAleatorio) {
	                System.out.println("El número es menor.");
	            } else {
	                System.out.println("¡Felicidades! Has adivinado el número.");
	                break; // Terminar el bucle si adivina correctamente
	            }
	        }

	        // Cerrar el Scanner
	        scanner.close();
	    }
	}
	
