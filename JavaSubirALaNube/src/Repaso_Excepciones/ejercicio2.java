package Repaso_Excepciones;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Índice fuera de los límites del array");
		}
	}

}
