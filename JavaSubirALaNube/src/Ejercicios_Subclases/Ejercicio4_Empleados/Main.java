package Ejercicios_Subclases.Ejercicio4_Empleados;

public class Main {

	public static void main(String[] args) {
		Empleado gerente = new Gerente("Ana", 3000);
		Empleado programador = new Programador("Albert", 2500, 5);
		Empleado diseñador = new Diseñador("Maria", 2000, 10);

		gerente.mostrarDetalles();
		System.out.println("");

		programador.mostrarDetalles();
		System.out.println("");

		diseñador.mostrarDetalles();
		System.out.println("");
	}

}
