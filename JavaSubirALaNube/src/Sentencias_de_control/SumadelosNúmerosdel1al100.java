package Sentencias_de_control;

public class SumadelosNúmerosdel1al100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		
		for (int i = 1; i <= 100; i++) {
			suma += i;
	}
		System.out.println("La suma de los numeros del 1 al 100 es: " + suma);
	}
}