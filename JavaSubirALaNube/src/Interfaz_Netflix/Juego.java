package Interfaz_Netflix;

public class Juego {
	private String nombre;
	private String genero;
	private String plataforma;
	private String desarrollador;
	private String añoLanzamiento;

	public Juego(String nombre, String genero, String plataforma, String desarrollador, String añoLanzamiento) {
		this.nombre = nombre;
		this.genero = genero;
		this.plataforma = plataforma;
		this.desarrollador = desarrollador;
		this.añoLanzamiento = añoLanzamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public String getAñoLanzamiento() {
		return añoLanzamiento;
	}

	@Override
	public String toString() {
		return "Juego: " + nombre + ", Género: " + genero + ", Plataforma: " + plataforma + ", Desarrollador: "
				+ desarrollador + ", Año de Lanzamiento: " + añoLanzamiento;
	}
}