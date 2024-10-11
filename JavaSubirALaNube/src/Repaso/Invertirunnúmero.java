package Repaso;
import java.util.Scanner;

public class Invertirunnúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero: ");
		int numero = scanner.nextInt();
		int numeroInvertido = 0;
		
		
		while (numero != 0) {
			int digito = numero % 10;
			numeroInvertido = (numeroInvertido * 10) + digito;
			numero /= 10;
		}
		
		System.out.println("El numero invertido es: " + numeroInvertido);
		
		scanner.close();
	}

}
