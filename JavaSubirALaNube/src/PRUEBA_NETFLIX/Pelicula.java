package PRUEBA_NETFLIX;

public class Pelicula {
	private String nombre;
	private String genero;

	public Pelicula(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}
}
