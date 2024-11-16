package HashMap_Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class InvertirClavesyValoresdeunHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> mapaOriginal = new HashMap<>();
		mapaOriginal.put("a", 1);
		mapaOriginal.put("b", 2);
		mapaOriginal.put("c", 3);

		Map<Integer, String> mapaInvertido = invertirMapa(mapaOriginal);
		System.out.println("Mapa invertido: " + mapaInvertido);
	}

	public static Map<Integer, String> invertirMapa(Map<String, Integer> mapa) {
		Map<Integer, String> mapaInvertido = new HashMap<>();

		for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
			mapaInvertido.put(entrada.getValue(), entrada.getKey());
		}

		return mapaInvertido;
	}

}
