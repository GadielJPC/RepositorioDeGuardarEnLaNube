package Interfaz_Netflix;

public class Pelicula {
	private String nombre;
	private String genero;
	private int duracion; // Duración en minutos
	private String director;
	private String añoEstreno;

	public Pelicula(String nombre, String genero, int duracion, String director, String añoEstreno) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.director = director;
		this.añoEstreno = añoEstreno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getDirector() {
		return director;
	}

	public String getAñoEstreno() {
		return añoEstreno;
	}

	@Override
	public String toString() {
		return "Pelicula: " + nombre + ", Género: " + genero + ", Duración: " + duracion + " min, Director: " + director
				+ ", Año de Estreno: " + añoEstreno;
	}
}