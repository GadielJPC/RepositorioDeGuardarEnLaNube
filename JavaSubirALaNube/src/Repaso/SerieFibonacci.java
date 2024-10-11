package Repaso;
import java.util.Scanner;

public class SerieFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el número de términos de la serie de Fibonacci que deseas: ");
		int n = scanner.nextInt();
		
		int a = 0, b = 1;
		
		System.out.println("Serie Fibonacci: ");
		for (int i = 1; i <= n; i++) {
		System.out.print(a + "");
		int siguiente = a + b;
		a = b;
		b = siguiente;
		}
		scanner.close();
	}
}