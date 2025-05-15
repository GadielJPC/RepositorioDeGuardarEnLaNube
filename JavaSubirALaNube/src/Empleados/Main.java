package Empleados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugadores jugador = new Jugadores();
		jugador.pedirDatos();
		jugador.muestraDatos();

		Masajista masajista = new Masajista();
		masajista.pedirDatos();
		masajista.muestraDatos();

		MasajistaConFederacion masajistaFederado = new MasajistaConFederacion();
		masajistaFederado.pedirDatos();
		masajistaFederado.muestraDatos();
	}
}