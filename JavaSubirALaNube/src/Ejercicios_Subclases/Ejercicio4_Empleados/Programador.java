package Ejercicios_Subclases.Ejercicio4_Empleados;

public class Programador extends Empleado {

	private int proyectosRealizados;

	public Programador(String nombre, double salarioBase, int proyectosRealizados) {
		super(nombre, salarioBase);
		this.proyectosRealizados = proyectosRealizados;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (proyectosRealizados * salarioBase * 0.15);
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del programador:");
		super.mostrarDetalles();
		System.out.println("Proyectos realizados: " + proyectosRealizados);
	}
}
