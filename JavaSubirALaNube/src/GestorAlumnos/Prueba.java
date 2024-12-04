package GestorAlumnos;

public class Prueba {

	public static void main(String[] args) {

		/*
		 * Crear una instancia de la clase Alumno. Ahora puedes usar Alumno1 para
		 * acceder a los metodos y atributos de la clase
		 */
		Alumno alumno1 = new Alumno();

		/*
		 * Aqui utilizamos los metodos setter para asignar valores a los atributos del
		 * objeto alumno1
		 */
		alumno1.setNombre("Juan");
		alumno1.setApellido("Perez Lopez");
		alumno1.setDNI("12345678A");
		alumno1.setedad(20);

		/*
		 * Utilizamos metodos getter para recuperar los valores de los atributos.
		 * Mostramos esta informacion en la consola System,out.println.
		 */
		System.out.println("Nombre: " + alumno1.getNombre());
		System.out.println("Apellido: " + alumno1.getApellido());
		System.out.println("DNI: " + alumno1.getDNI());
		System.out.println("edad: " + alumno1.getedad());
	}
}
