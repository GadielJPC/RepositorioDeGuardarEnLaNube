package Ejercicios_Subclases.Ejercicio4_Empleados;

public class Gerente extends Empleado {

	public Gerente(String nombre, double salarioBase) {
		super(nombre, salarioBase);
	}

	@Override
	public double calcularSalario() {
		return salarioBase * 1.20;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del gerente:");
		super.mostrarDetalles();
	}
}
