package Ejercicios_Subclases.Ejercicio4_Empleados;

public class Empleado {

	protected String nombre;
	protected double salarioBase;

	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public double calcularSalario() {
		return salarioBase;
	}

	public void mostrarDetalles() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario Base: " + salarioBase);
		System.out.println("Salario Total: " + calcularSalario() + " €");
	}
}
