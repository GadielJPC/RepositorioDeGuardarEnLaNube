package Interfaz_Netflix;

class Capitulo {
	private String nombre;
	private int duracion; // Duración en minutos

	public Capitulo(String nombre, int duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return nombre + " (" + duracion + " min)";
	}
}