package HashMap_Ejercicios;

import java.util.HashMap;

public class Diccionario {

	public static void main(String[] args) {
		// Crear un HashMap para almacenar el diccionario
		HashMap<String, String> diccionario = new HashMap<>();

		// Añadir palabras y definiciones al diccionario
		diccionario.put("Hola", "Saludo o expresión de bienvenida.");
		diccionario.put("Mundo", "Todo lo que existe, tanto lo físico como lo espiritual.");
		diccionario.put("Computadora", "Máquina electrónica que procesa información.");
		diccionario.put("Java", "Lenguaje de programación orientado a objetos.");
		diccionario.put("Diccionario", "Objeto que contiene un conjunto de elementos en forma de pares clave-valor.");
		diccionario.put("Estudiante", "Persona que está aprendiendo en una institución educativa.");
		diccionario.put("Profesor", "Persona que enseña a los estudiantes.");
		diccionario.put("Programación", "Proceso de diseñar y construir un conjunto de instrucciones.");
		diccionario.put("Desarrollo", "Proceso de crear y mejorar productos o servicios.");
		diccionario.put("Tecnología", "Conjunto de conocimientos y técnicas para crear herramientas y productos.");

		// Utilizar las funciones del HashMap
		System.out.println("Número de elementos en el diccionario: " + diccionario.size());
		System.out.println("¿El diccionario está vacío? " + diccionario.isEmpty());

		// Obtener el valor de una clave
		String palabra = "Hola";
		System.out.println("Definición de '" + palabra + "': " + diccionario.get(palabra));

		// Comprobar si contiene una clave y un valor
		System.out.println("¿Contiene la clave 'Java'? " + diccionario.containsKey("Java"));
		System.out.println("¿Contiene el valor 'Saludo o expresión de bienvenida.'? "
				+ diccionario.containsValue("Saludo o expresión de bienvenida."));

		// Remover una palabra
		diccionario.remove("Hola");
		System.out.println("Después de remover 'Hola', número de elementos: " + diccionario.size());

		// Limpiar el diccionario
		diccionario.clear();
		System.out.println("Número de elementos después de limpiar: " + diccionario.size());
	}

}
