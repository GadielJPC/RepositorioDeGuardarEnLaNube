package HashMap_Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class BuscarlaCalificacióndeunEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> students = new HashMap<>();
		students.put("Juan", 90);
		students.put("Ana", 85);
		students.put("Carlos", 78);

		String nombreBuscado = "Ana";
		System.out.println("Calificación de " + nombreBuscado + ": " + buscarCalificacion(students, nombreBuscado));
	}

	public static Integer buscarCalificacion(Map<String, Integer> estudiantes, String nombre) {
		return estudiantes.getOrDefault(nombre, -1); // Devuelve -1 si el nombre no existe
	}

}
