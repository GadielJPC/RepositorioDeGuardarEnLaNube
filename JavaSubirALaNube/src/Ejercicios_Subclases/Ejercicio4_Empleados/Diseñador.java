package Ejercicios_Subclases.Ejercicio4_Empleados;

public class Diseñador extends Empleado {
	private int horasExtras;

	public Diseñador(String nombre, double salarioBase, int horasExtras) {
		super(nombre, salarioBase);
		this.horasExtras = horasExtras;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (horasExtras * 10);
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del diseñador:");
		super.mostrarDetalles();
		System.out.println("Horas extras realizadas: " + horasExtras);
	}
}
