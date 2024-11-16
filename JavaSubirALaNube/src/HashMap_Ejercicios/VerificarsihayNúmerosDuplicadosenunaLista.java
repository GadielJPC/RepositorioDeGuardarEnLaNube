package HashMap_Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class VerificarsihayNúmerosDuplicadosenunaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 1, 2, 3, 4, 5, 6, 3 };
		encontrarDuplicado(numeros);
	}

	public static void encontrarDuplicado(int[] numeros) {
		Map<Integer, Integer> frecuencias = new HashMap<>();

		for (int numero : numeros) {
			frecuencias.put(numero, frecuencias.getOrDefault(numero, 0) + 1);
			if (frecuencias.get(numero) > 1) {
				System.out.println("El número " + numero + " está duplicado");
				return;
			}
		}
		System.out.println("No hay números duplicados");
	}

}
