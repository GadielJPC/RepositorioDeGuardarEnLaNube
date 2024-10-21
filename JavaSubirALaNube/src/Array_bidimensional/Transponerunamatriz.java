package Array_bidimensional;

public class Transponerunamatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Creamos una nueva matriz con dimensiones invertidas
		int[][] transpuesta = new int[matriz[0].length][matriz.length];

		// Recorremos la matriz original y transponemos sus elementos
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				transpuesta[j][i] = matriz[i][j];
			}
		}

		System.out.println("Matriz transpuesta:");
		for (int i = 0; i < transpuesta.length; i++) {
			for (int j = 0; j < transpuesta[i].length; j++) {
				System.out.print(transpuesta[i][j] + "");
			}
			System.out.println();
		}
	}

}
