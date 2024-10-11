package Repaso;

public class SumaMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				suma += i;
			}
		}

		System.out.println("La suma de los multiplos 3 y 5 entre 1 y 1000 es: " + suma);
	}

}
