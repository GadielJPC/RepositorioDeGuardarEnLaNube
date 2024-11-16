package CONTROL;

public class pregunta2 {

	// Método que calcula la suma desde 1 hasta n
	public static int calcularSumaHastaN(int n) {
		if (n <= 0) {
			return 0;
		}

		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += i;
		}

		return suma;
	}

	public static void main(String[] args) {
		int n = 10;
		int resultado = calcularSumaHastaN(n);
		System.out.println("La suma de los números de 1 a " + n + " es: " + resultado);
	}
}