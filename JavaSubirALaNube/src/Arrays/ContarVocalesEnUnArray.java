package Arrays;

public class ContarVocalesEnUnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] cadena = { 'H', 'o', 'l', 'a', 'M', 'u', 'n', 'd', 'o' };
		int contadorVocales = 0;

		// Contar las vocales en el array
		for (char c : cadena) {
			if (esVocal(c)) {
				contadorVocales++;
			}
		}

		// Imprimir el resultado
		System.out.println("Número de vocales: " + contadorVocales);
	}

	public static boolean esVocal(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

}
