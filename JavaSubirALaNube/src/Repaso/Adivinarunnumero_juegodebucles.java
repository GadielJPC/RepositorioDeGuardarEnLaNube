package Repaso;
import java.util.Random;
import java.util.Scanner;


public class Adivinarunnumero_juegodebucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Random random = new Random();
	     Scanner scanner = new Scanner(System.in);
	     
	     int numeroSecreto = random.nextInt(10) + 1;
	     int intento = 0;
	     boolean adivinado = false;
	     
	     System.out.println("Adivina el numero entre 1 y 10:");
	     
	     
	     while (!adivinado) {
	    	 System.out.print("Introduce tu intento: ");
	    	 intento = scanner.nextInt();
	    	 
	    	 if (intento < numeroSecreto) {
	                System.out.println("El número es mayor.");
	            } else if (intento > numeroSecreto) {
	                System.out.println("El número es menor.");
	            } else {
	                System.out.println("¡Felicidades! Has adivinado el número.");
	                adivinado = true; // Cambiar a verdadero para salir del bucle
	            }
	        }
	     }
	}

