package Repaso;
import java.util.Scanner;

public class TrianguloAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Introduce el numero de filas para el triangulo: ");
		int n = scanner.nextInt();
		
		
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.println("*");
            }
            
            System.out.println();
        }
        scanner.close();
	}
}