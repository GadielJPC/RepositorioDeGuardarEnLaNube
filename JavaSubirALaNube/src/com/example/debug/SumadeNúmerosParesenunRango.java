package com.example.debug;

public class SumadeNúmerosParesenunRango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Suma de números pares de 1 a 10: " + sumarPares(1, 10));
	}

	public static int sumarPares(int inicio, int fin) {
		int suma = 0;
		for (int i = inicio; i <= fin; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}
		return suma;
	}

}
