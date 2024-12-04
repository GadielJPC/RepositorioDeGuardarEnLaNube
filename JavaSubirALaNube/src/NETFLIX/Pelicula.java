package NETFLIX;

public class Pelicula {

	private String Nombre;
	private String Genero;
	private int Año;
	private int Duracion;

	public Pelicula() {
	}

	public String getNombre() {
		return Nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public int getAño() {
		return Año;
	}

	public int getDuracion() {
		return Duracion;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public void setGenero(String Genero) {
		this.Genero = Genero;
	}

	public void setAño(int Año) {
		this.Año = Año;
	}

	public void setDuracion(int Duracion) {
		this.Duracion = Duracion;
	}
}