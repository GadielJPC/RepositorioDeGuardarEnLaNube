package com.example.debug;

public class ConcatenacióndeCadenasenunBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] palabras = { "Java", "es", "divertido" };
		System.out.println("Resultado: " + concatenar(palabras));
	}

	public static String concatenar(String[] palabras) {
		String resultado = "";
		for (int i = 0; i < palabras.length; i++) {
			resultado += palabras[i];
			if (i < palabras.length - 1) {
				resultado += " ";
			}
		}
		return resultado;
	}

}
