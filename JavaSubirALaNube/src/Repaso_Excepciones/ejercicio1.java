package Repaso_Excepciones;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerador = 10;
		int denominador = 0;
		int resultado;

		try {
			resultado = numerador / denominador;
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: no se puede dividir por cero");
		}
	}

}
