package Repaso;
import java.util.Scanner;

public class Sumadenúmerosparesyimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce el numero " + i + ": ");
			int numero = scanner.nextInt();
		
			
		if (numero % 2 == 0) {
			sumaPares += numero; 
		} else {
			sumaImpares += numero;
			}
		}
		
		System.out.println("Suma de numeros pares: " + sumaPares);
		System.out.println("Suma de numeros impares: " + sumaImpares);
		
		scanner.close();
	}

}
