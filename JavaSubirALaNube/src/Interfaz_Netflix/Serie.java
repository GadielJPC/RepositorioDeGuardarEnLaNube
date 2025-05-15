package Interfaz_Netflix;

import java.util.List;

public class Serie {
	private String nombre;
	private String genero;
	private List<Temporada> temporadas;

	public Serie(String nombre, String genero, List<Temporada> temporadas) {
		this.nombre = nombre;
		this.genero = genero;
		this.temporadas = temporadas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	@Override
	public String toString() {
		StringBuilder detalles = new StringBuilder();
		detalles.append("Serie: ").append(nombre).append(", Género: ").append(genero).append("\n");
		for (Temporada temporada : temporadas) {
			detalles.append(temporada.toString()).append("\n");
		}
		return detalles.toString();
	}
}