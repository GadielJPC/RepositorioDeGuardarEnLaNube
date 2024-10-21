package Array_bidimensional;

public class Encontrarlafilaconlasumamásalta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int filaMayorSuma = -1;
		int mayorSuma = Integer.MIN_VALUE;

		// Recorremos cada fila
		for (int i = 0; i < matriz.length; i++) {
			int sumaFila = 0;

			// Sumamos los elementos de la fila actual
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
			}

			if (sumaFila > mayorSuma) {
				mayorSuma = sumaFila;
				filaMayorSuma = i;
			}
		}
		System.out.println("La fila con la suma mas alta es la numero: " + filaMayorSuma);
	}
}