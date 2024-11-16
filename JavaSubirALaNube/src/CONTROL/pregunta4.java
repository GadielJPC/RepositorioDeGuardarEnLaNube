package CONTROL;

public class pregunta4 {

	// Método que cuenta cuántas veces aparece subcadena en texto
	public static int contarOcurrencias(String texto, String subcadena) {
		if (texto == null || subcadena == null || subcadena.isEmpty()) {
			return 0; // Retorna 0 si texto o subcadena son nulos o subcadena es vacía
		}

		int contador = 0;
		int indice = 0;

		// Buscar subcadena en texto de forma repetida
		while ((indice = texto.indexOf(subcadena, indice)) != -1) {
			contador++;
			indice += subcadena.length(); // Avanza el índice para evitar contar la misma ocurrencia
		}

		return contador;
	}

	public static void main(String[] args) {
		String texto = "abracadabra";
		String subcadena = "abra";

		int resultado = contarOcurrencias(texto, subcadena);
		System.out.println(
				"La subcadena '" + subcadena + "' aparece " + resultado + " veces en el texto '" + texto + "'.");
	}
}