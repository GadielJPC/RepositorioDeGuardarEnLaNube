package CONTROL;

public class pregunta1 {

	// Método que evalúa el número y devuelve un mensaje basado en las condiciones
	public static String evaluarNumero(int n) {
		if (n > 0 && n % 2 == 0) {
			return "El número es positivo y par.";
		} else if (n > 0 && n % 2 != 0) {
			return "El número es positivo e impar.";
		} else if (n < 0) {
			return "El número es negativo.";
		} else {
			return "El número es cero.";
		}
	}

	public static void main(String[] args) {
		// Ejemplos de funcionamiento del método con los valores dados
		int[] valores = { -5, 0, 8, 15 };

		for (int n : valores) {
			String resultado = evaluarNumero(n);
			System.out.println("Para n = " + n + ": " + resultado);
		}
	}
}