package Arrays;

public class PromediodelosElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] numeros = { 5.2f, 3.8f, 7.1f, 6.0f, 4.3f, 9.5f };

		float suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		float promedio = suma / numeros.length;

		System.out.println("El promedio de los elementos es: " + promedio);
	}
}