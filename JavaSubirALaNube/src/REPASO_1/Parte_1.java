package REPASO_1;

public class Parte_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		if (n <= 0) {
			System.out.println("El numero mayor debe ser mayor que 0");
		} else {
			int suma = 0;
			for (int i = 1; i <= n; i++) {
				suma += i;
			}
			System.out.println("la suma de los numeros desde 1 hasta " + n + " es: " + suma);
		}
	}
}
