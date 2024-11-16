package Repaso_variables;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;

		// Intercambiamos los valores de a y b sin usar una tercera variable
		a = a + b; // a ahora tiene la suma de ambos valores
		b = a - b; // b obtiene el valor original de a
		a = a - b; // a obtiene el valor original de b

		// Mostramos los valores intercambiados por consola
		System.out.println("El valor de a después del intercambio es: " + a);
		System.out.println("El valor de b después del intercambio es: " + b);
	}

}
