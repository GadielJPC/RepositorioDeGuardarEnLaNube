package CONTROL;

public class pregunta1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		evaluarNumero(-5);
		evaluarNumero(8);
		evaluarNumero(15);
		evaluarNumero(0);

	}

	public static void evaluarNumero(int numero) {
		if (numero > 0 && numero % 2 == 0) {
			System.out.println("El numero es positivo y par");
		} else if (numero > 0 && numero % 2 != 0) {
			System.out.println("El numero es positivo y impar");
		} else if (numero < 0) {
			System.out.println("El numero es negativo");
		} else if (numero == 0) {
			System.out.println("El numero es cero");
		}
	}
}
