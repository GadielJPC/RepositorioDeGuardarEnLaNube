package NETFLIX;

public class Comprobar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula pelicula1 = new Pelicula();
		Pelicula pelicula2 = new Pelicula();

		pelicula1.setNombre("La mascara");
		pelicula1.setGenero("Comedia");
		pelicula1.setAño(1994);
		pelicula1.setDuracion(101);

		System.out.println("Nombre: " + pelicula1.getNombre());
		System.out.println("Genero: " + pelicula1.getGenero());
		System.out.println("Año: " + pelicula1.getAño());
		System.out.println("Duracion: " + pelicula1.getDuracion());
		System.out.println("");

		pelicula2.setNombre("Terrifier");
		pelicula2.setGenero("Terror");
		pelicula2.setAño(2016);
		pelicula2.setDuracion(92);

		System.out.println("Nombre: " + pelicula2.getNombre());
		System.out.println("Genero: " + pelicula2.getGenero());
		System.out.println("Año: " + pelicula2.getAño());
		System.out.println("Duracion: " + pelicula2.getDuracion());
		System.out.println("");

		Serie serie1 = new Serie();
		Serie serie2 = new Serie();

		serie1.setNombre("Euphoria");
		serie1.setGenero("Drama");
		serie1.setTemporadas(2);

		System.out.println("Nombre de la serie: " + serie1.getNombre());
		System.out.println("Genero: " + serie1.getGenero());
		System.out.println("Temporadas: " + serie1.getTemporadas());
		System.out.println("");

		serie2.setNombre("Juego de tronos");
		serie2.setGenero("Accion");
		serie2.setTemporadas(8);

		System.out.println("Nombre de la serie: " + serie2.getNombre());
		System.out.println("Genero: " + serie2.getGenero());
		System.out.println("Temporadas: " + serie2.getTemporadas());
		System.out.println("");

		Temporada temporada1 = new Temporada();
		Temporada temporada2 = new Temporada();

		temporada1.getNumero(2);
		temporada1.getCapitulos(60);

		System.out.println("Numeros de temporadas: " + temporada1.getNumero());
		System.out.println("Capitulos por temporada: " + temporada1.getCapitulos());
		System.out.println("");

		temporada2.getNumero(8);
		temporada2.getCapitulos(120);

		System.out.println("Numeros de temporadas: " + temporada2.getNumero());
		System.out.println("Capitulos por temporada: " + temporada2.getCapitulos());
		System.out.println("");

		Capitulo capitulos1 = new Capitulo();
		Capitulo capitulos2 = new Capitulo();

		capitulos1.getNumero(12);
		capitulos1.getDuracion(40);

		System.out.println("Numeros de capitulos: " + capitulos1.getNumero());
		System.out.println("Duracion: " + capitulos1.getDuracion());
		System.out.println("");

		capitulos2.getNumero(20);
		capitulos2.getDuracion(30);

		System.out.println("Numeros de capitulos: " + capitulos2.getNumero());
		System.out.println("Duracion: " + capitulos2.getDuracion());
		System.out.println("");

	}

}
