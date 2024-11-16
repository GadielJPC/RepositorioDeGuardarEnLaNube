package Repaso_debugs;

public class ejercicio4 {
	public static void main(String[] args) {
		int numerador = 10;
		int denominador = 0;
		int resultado;

		if (denominador != 0) {
			resultado = numerador / denominador;
			System.out.println("El resultado es: " + resultado);
		} else {
			System.out.println("Error: No se puede dividir por cero");
		}
	}
}