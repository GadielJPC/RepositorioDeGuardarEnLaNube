package NETFLIX;

public class Serie {

	private String Nombre;
	private String Genero;
	private int Temporadas;

	public Serie() {
	}

	public String getNombre() {
		return Nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public int getTemporadas() {
		return Temporadas;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public void setGenero(String Genero) {
		this.Genero = Genero;
	}

	public void setTemporadas(int Temporadas) {
		this.Temporadas = Temporadas;
	}

}
