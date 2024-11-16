package Repaso_Excepciones;

public class ejercicio8 {

	public static void main(String[] args) {
		String texto = null; // Texto nulo

		try {
			// Intentamos obtener la longitud de una cadena nula
			int longitud = texto.length(); // Línea que puede lanzar la excepción
			System.out.println("La longitud de la cadena es: " + longitud);
		} catch (NullPointerException e) {
			System.out.println("Error: La cadena es nula y no tiene longitud.");
		}
	}
}
