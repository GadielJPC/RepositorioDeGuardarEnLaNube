package CONTROL;

public class pregunta5 {

	public static int encontrarIndice(int[] arreglo, int valor) {
		for (int i = 0; i < arreglo.length; i++) { // Cambio en la condición del bucle
			if (arreglo[i] == valor) {
				return i;
			}
		}
		return -1; // Retorna -1 si el valor no se encuentra en el arreglo
	}

	public static void main(String[] args) {
		int[] arreglo = { 5, 3, 8, 4 };
		int valorBuscado = 3;
		int indice = encontrarIndice(arreglo, valorBuscado);
		System.out.println("El índice de " + valorBuscado + " en el arreglo es: " + indice);
	}
}