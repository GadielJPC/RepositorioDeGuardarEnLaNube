package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto aut = new Auto();
		aut.setId(1L);
		aut.setMarca("Renault");
		aut.setModelo("Duster");

		List<Propietario> listaPropietarios = new ArrayList<Propietario>();

		Propietario prop1 = new Propietario();
		Propietario prop2 = new Propietario();

		prop1.setId(350L);
		prop1.setNombre("Luis");
		prop1.setApellido("Mora");

		prop2.setId(750L);
		prop2.setNombre("Alberto");
		prop2.setApellido("Corrales");

		listaPropietarios.add(prop1);
		listaPropietarios.add(prop2);

		aut.setListaPropietarios(listaPropietarios);

		System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " tiene como propietarios a:");
		for (Propietario propietario : aut.getListaPropietarios()) {
			System.out.println("  - " + propietario.getNombre() + " " + propietario.getApellido());
		}
	}
}