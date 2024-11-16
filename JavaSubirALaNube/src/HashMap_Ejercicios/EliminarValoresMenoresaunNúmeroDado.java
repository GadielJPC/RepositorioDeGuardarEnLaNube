package HashMap_Ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EliminarValoresMenoresaunNúmeroDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> frutas = new HashMap<>();
		frutas.put("apple", 5);
		frutas.put("banana", 2);
		frutas.put("orange", 3);

		int valorMinimo = 3;
		eliminarValoresMenores(frutas, valorMinimo);
		System.out.println("Mapa resultante: " + frutas);
	}

	public static void eliminarValoresMenores(Map<String, Integer> map, int minValue) {
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			if (entry.getValue() < minValue) {
				iterator.remove();
			}
		}
	}

}
