package com.example.debug;

public class BúsquedadeElementoenunArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 1, 2, 3, 4, 5 };
		int buscar = 3;
		System.out.println("¿El número está en el array? " + contiene(numeros, buscar));
	}

	public static boolean contiene(int[] arr, int valor) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valor) {
				return true;
			}
		}
		return false;
	}

}