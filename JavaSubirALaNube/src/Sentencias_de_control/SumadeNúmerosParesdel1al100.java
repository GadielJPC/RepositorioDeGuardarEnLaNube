package Sentencias_de_control;

public class SumadeNúmerosParesdel1al100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int suma = 0;

	        // Bucle para recorrer los números del 1 al 100
	        for (int i = 1; i <= 100; i++) {
	            // Verificar si el número es par
	            if (i % 2 == 0) {
	                suma += i;  // Sumar el número par a la variable suma
	            }
	        }

	        // Imprimir la suma de los números pares
	        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
	    }
	}