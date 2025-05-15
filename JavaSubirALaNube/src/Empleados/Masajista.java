package Empleados;

import java.util.Scanner;

public class Masajista extends Empleado {
	private int numeroColegiado;

	public void pedirDatos() {
		super.pedirDatos();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el numero de colegiado: ");
		numeroColegiado = scanner.nextInt();
	}

	@Override
	public void muestraDatos() {
		super.muestraDatos();
		System.out.println("Numero de colegiado: " + numeroColegiado);
	}

}
