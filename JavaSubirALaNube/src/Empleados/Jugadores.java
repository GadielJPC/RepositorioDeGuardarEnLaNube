package Empleados;

import java.util.Scanner;

public class Jugadores extends Empleado {
	private int dorsal;
	private String demarcacion;

	public void pedirDatos() {
		super.pedirDatos();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el dorsal: ");
		dorsal = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ingrese la demarcacion: ");
		demarcacion = scanner.nextLine();
	}

	@Override
	public void muestraDatos() {
		super.muestraDatos();
		System.out.println("Dorsal: " + dorsal);
		System.out.println("Demarcacion: " + demarcacion);
	}
}