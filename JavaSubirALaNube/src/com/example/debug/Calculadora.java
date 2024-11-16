package com.example.debug;

public class Calculadora {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		System.out.println("Suma: " + sumar(a, b));
		System.out.println("Resta: " + restar(a, b));
		System.out.println("Multiplicación: " + multiplicar(a, b));
		try {
			System.out.println("División: " + dividir(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		}
	}

	public static int sumar(int x, int y) {
		return x + y;
	}

	public static int restar(int x, int y) {
		return x - y;
	}

	public static int multiplicar(int x, int y) {
		return x * y; // Corregido para realizar la multiplicación
	}

	public static int dividir(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("División por cero"); // Prevenir división por cero
		}
		return x / y;
	}
}
