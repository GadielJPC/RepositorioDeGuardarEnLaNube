package Segunda_Evaluacion;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("ELIGE LA OPCION QUE DESEAS");
		System.out.println("1. PARA MOSTRAR MENSAJE");
		System.out.println("2. PARA CALCULAR NUMERO PRIMO");

		Utilidades util = new Utilidades();

		int numero = leer.nextInt();

		switch (numero) {
		case 1:
			util.mostrarMensaje();
			break;
		case 2:
			util.calcularNumeroPrimo();
			break;
		default:
			System.out.println("La opcion elegida noes la correcta");
		}

		Coche coche = new Coche();

		Coche coche2 = new Coche("asd");

		Coche coche3 = new Coche("marca", "matri", "modelo", "basti");

		coche.setMarca("Ferrari");
		coche.setMatricula("45646XXX");
		coche.setModelo("Testa Rossa");
		coche.setNumBastidor("4567");

		System.out.println("VAMOS A IMPRIMIR LOS ATRIUTOS DE COCHE");
		String marca = coche.getMarca();
		String matricula = coche.getMatricula();
		String modelo = coche.getModelo();
		String numBastidor = coche.getNumBastidor();

		System.out.println(marca);
		System.out.println(matricula);
		System.out.println(modelo);
		System.out.println(numBastidor);

		System.out.println("VAMOS A IMPRIMIR LOS ATRIUTOS DE COCHE2");
		System.out.println(coche2.getMatricula());

	}

}
