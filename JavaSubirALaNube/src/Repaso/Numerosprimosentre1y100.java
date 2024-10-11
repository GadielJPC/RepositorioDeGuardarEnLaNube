package Repaso;

public class Numerosprimosentre1y100 {
	
	  public static void main(String[] args) {
		  System.out.println("Numeros pares entre 1 y 100:");
		  
		  for (int numero = 2; numero <= 100; numero++) {
			  boolean esPrimo = true;
			  
		  
		  for (int i = 2; i <= Math.sqrt(numero); i++) {
			  if (numero % i == 0) {
				  esPrimo = false;
				  break;
			  }
		  }
			  
		  if (esPrimo) {
			  System.out.println(numero);
		  	}
	  	}
	}
	
}

