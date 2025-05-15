package Empleados;

import java.util.Scanner;

public class MasajistaConFederacion extends Empleado {
	private String idFederacion;

	public void pedirDatos() {
		super.pedirDatos();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el ID de federación: ");
		idFederacion = scanner.nextLine();
	}

	@Override
	public void muestraDatos() {
		super.muestraDatos();
		System.out.println("ID de Federación: " + idFederacion);
	}
}
