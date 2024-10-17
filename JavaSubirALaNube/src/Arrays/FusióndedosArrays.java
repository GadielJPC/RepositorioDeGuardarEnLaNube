package Arrays;

import java.util.Arrays;

public class FusióndedosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 2, 4, 6, 8, 10 };

		// Crear un nuevo array para almacenar la fusión
		int[] fusion = new int[array1.length + array2.length];

		// Copiar elementos de array1 y array2 al nuevo array
		System.arraycopy(array1, 0, fusion, 0, array1.length);
		System.arraycopy(array2, 0, fusion, array1.length, array2.length);

		// Imprimir el array fusionado
		System.out.println("Array fusionado: " + Arrays.toString(fusion));

	}

}
