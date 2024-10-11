package Repaso;
import java.util.Scanner;

public class SumadeLosPrimeros_N_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce un numero entero positivo 	N:");
		int N = scanner.nextInt();
		
		if (N > 0) {
			int suma = 0;
			
			for (int i = 1; i <= N; i++){
				suma += i;
		}
			System.out.println("La suma de los primeros numeros " + N + " numeros naturales es: " + suma);
	}	else {
		System.out.println("El numero debe ser entero positivo");
	}
		scanner.close();
		
		}
	}
