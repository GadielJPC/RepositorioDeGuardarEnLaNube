package Array_bidimensional;

public class Sumarloselementosdeunamatriz2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = {
				{1, 2 ,3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int suma = 0;
		
		 // Recorremos la matriz y sumamos los elementos
		for (int  i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		
		System.out.println("La suma de todos los elementos es: " + suma);
	}

}
