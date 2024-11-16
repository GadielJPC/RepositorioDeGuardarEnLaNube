package CONTROL;

public class pregunta3 {

	// Método que encuentra el máximo y mínimo en un arreglo de enteros
	public static int[] encontrarMaximoMinimo(int[] numeros) {
		// Verificar si el arreglo está vacío
		if (numeros == null || numeros.length == 0) {
			return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }; // Retorna valores extremos si el arreglo está
																		// vacío
		}

		// Inicializar máximo y mínimo con el primer elemento del arreglo
		int maximo = numeros[0];
		int minimo = numeros[0];

		// Recorrer el arreglo para encontrar el máximo y el mínimo
		for (int num : numeros) {
			if (num > maximo) {
				maximo = num;
			}
			if (num < minimo) {
				minimo = num;
			}
		}

		// Retornar un arreglo con el máximo y el mínimo
		return new int[] { maximo, minimo };
	}

	public static void main(String[] args) {
		// Definir el arreglo de ejemplo
		int[] numeros = { 3, 7, 2, 8, 4 };

		// Llamar al método encontrarMaximoMinimo y almacenar el resultado
		int[] resultado = encontrarMaximoMinimo(numeros);

		// Mostrar el máximo y el mínimo en la consola
		System.out.println("El valor máximo es: " + resultado[0]);
		System.out.println("El valor mínimo es: " + resultado[1]);
	}
}