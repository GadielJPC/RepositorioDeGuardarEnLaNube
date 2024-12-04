package Gestion_Canciones;

public class cancion {

	private String NombreCancion;
	private String Grupomúsica;
	private int AñoDePublicación;

	public cancion(String NombreCancion, String Grupomúsica, int AñoDePublicación) {
		this.NombreCancion = NombreCancion;
		this.Grupomúsica = Grupomúsica;
		this.AñoDePublicación = AñoDePublicación;
	}

	public void setNombreCancion(String NombreCancion) {
		this.NombreCancion = NombreCancion;
	}

	public String getNombreCancion() {
		return NombreCancion;
	}

	public void setGrupomúsica(String Grupomúsica) {
		this.Grupomúsica = Grupomúsica;
	}

	public String getGrupomúsica() {
		return Grupomúsica;
	}

	public void setAñoDePublicación(int AñoDePublicación) {
		this.AñoDePublicación = AñoDePublicación;
	}

	public int getAñoDePublicación() {
		return AñoDePublicación;
	}

	public String toString() {
		return "Grupo: " + Grupomúsica + " | Canción: " + NombreCancion + " | Año de Publicación: " + AñoDePublicación;
	}
}