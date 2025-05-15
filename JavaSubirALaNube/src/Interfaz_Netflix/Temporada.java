package Interfaz_Netflix;

import java.util.List;

class Temporada {
	private int numero;
	private List<Capitulo> capitulos;

	public Temporada(int numero, List<Capitulo> capitulos) {
		this.numero = numero;
		this.capitulos = capitulos;
	}

	public int getNumero() {
		return numero;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	@Override
	public String toString() {
		StringBuilder detalles = new StringBuilder();
		detalles.append("Temporada ").append(numero).append(": ");
		for (Capitulo capitulo : capitulos) {
			detalles.append(capitulo.toString()).append(" ");
		}
		return detalles.toString();
	}
}
