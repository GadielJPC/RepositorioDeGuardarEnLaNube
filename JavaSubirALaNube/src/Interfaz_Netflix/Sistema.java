package Interfaz_Netflix;

import java.util.*;

public class Sistema {
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static List<Serie> listaSeries = new ArrayList<>();
	private static List<Pelicula> listaPeliculas = new ArrayList<>();
	private static List<Juego> listaJuegos = new ArrayList<>();

	public static void main(String[] args) {

		listaUsuarios.add(new Usuario("admin", "patata", "Administrador"));
		listaUsuarios.add(new Usuario("user1", "patata", "Usuario"));

		listaSeries.add(new Serie("Stranger Things", "Ciencia ficción",
				Arrays.asList(
						new Temporada(1,
								Arrays.asList(new Capitulo("Capítulo 1", 60), new Capitulo("Capítulo 2", 60),
										new Capitulo("Capítulo 3", 55))),
						new Temporada(2, Arrays.asList(new Capitulo("Capítulo 1", 62), new Capitulo("Capítulo 2", 60),
								new Capitulo("Capítulo 3", 58))))));

		listaSeries.add(new Serie("The Witcher", "Fantasía", Arrays.asList(
				new Temporada(1, Arrays.asList(new Capitulo("Capítulo 1", 50), new Capitulo("Capítulo 2", 52))),
				new Temporada(2, Arrays.asList(new Capitulo("Capítulo 1", 58), new Capitulo("Capítulo 2", 60))))));

		listaPeliculas.add(new Pelicula("Avengers: Endgame", "Acción", 181, "Anthony Russo", "2019"));
		listaPeliculas.add(new Pelicula("Inception", "Ciencia ficción", 148, "Christopher Nolan", "2010"));

		listaJuegos.add(new Juego("The Last of Us", "Aventura", "PS4", "Naughty Dog", "2013"));
		listaJuegos.add(new Juego("The Witcher 3", "RPG", "PC, PS4", "CD Projekt Red", "2015"));

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. Acceder como Administrador");
			System.out.println("2. Acceder como Usuario");
			System.out.println("0. Salir");
			System.out.print("Selecciona una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();

			if (opcion == 1) {
				if (login(scanner)) {
					accederComoAdministrador(scanner);
				}
			} else if (opcion == 2) {
				if (login(scanner)) {
					accederComoUsuario(scanner);
				}
			} else if (opcion == 0) {
				break;
			}
		}
		scanner.close();
	}

	public static boolean login(Scanner scanner) {
		System.out.print("Introduce tu nombre de usuario: ");
		String nombreUsuario = scanner.nextLine();
		System.out.print("Introduce tu contraseña: ");
		String password = scanner.nextLine();

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getNombre().equals(nombreUsuario) && usuario.getPassword().equals(password)) {
				System.out.println("¡Acceso exitoso! Bienvenido, " + usuario.getNombre());
				return true;
			}
		}
		System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
		return false;
	}

	public static void accederComoAdministrador(Scanner scanner) {
		while (true) {
			System.out.println("\nMenú Administrador:");
			System.out.println("1. Añadir Usuario");
			System.out.println("2. Borrar Usuario");
			System.out.println("3. Modificar Usuario");
			System.out.println("4. Listar Usuarios");
			System.out.println("0. Volver al Menú Principal");
			System.out.print("Selecciona una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();

			if (opcion == 1) {
				añadirUsuario(scanner);
			} else if (opcion == 2) {
				borrarUsuario(scanner);
			} else if (opcion == 3) {
				modificarUsuario(scanner);
			} else if (opcion == 4) {
				listarUsuarios();
			} else if (opcion == 0) {
				break;
			}
		}
	}

	public static void añadirUsuario(Scanner scanner) {
		System.out.print("Introduce el nombre de usuario: ");
		String nombre = scanner.nextLine();
		System.out.print("Introduce la contraseña: ");
		String password = scanner.nextLine();
		System.out.print("Introduce el rol (Administrador/Usuario): ");
		String rol = scanner.nextLine();

		Usuario nuevoUsuario = new Usuario(nombre, password, rol);
		listaUsuarios.add(nuevoUsuario);
		System.out.println("Usuario añadido exitosamente.");
	}

	public static void borrarUsuario(Scanner scanner) {
		System.out.print("Introduce el nombre del usuario a eliminar: ");
		String nombre = scanner.nextLine();

		listaUsuarios.removeIf(usuario -> usuario.getNombre().equals(nombre));
		System.out.println("Usuario eliminado si existía.");
	}

	public static void modificarUsuario(Scanner scanner) {
		System.out.print("Introduce el nombre del usuario a modificar: ");
		String nombre = scanner.nextLine();

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getNombre().equals(nombre)) {
				System.out.print("Introduce el nuevo nombre: ");
				usuario.setNombre(scanner.nextLine());
				System.out.print("Introduce la nueva contraseña: ");
				usuario.setPassword(scanner.nextLine());
				System.out.print("Introduce el nuevo rol (Administrador/Usuario): ");
				usuario.setRol(scanner.nextLine());
				System.out.println("Usuario modificado exitosamente.");
				return;
			}
		}
		System.out.println("Usuario no encontrado.");
	}

	public static void listarUsuarios() {
		if (listaUsuarios.isEmpty()) {
			System.out.println("No hay usuarios registrados.");
		} else {
			for (Usuario usuario : listaUsuarios) {
				System.out.println(usuario);
			}
		}
	}

	public static void accederComoUsuario(Scanner scanner) {
		while (true) {
			System.out.println("\nMenú Usuario:");
			System.out.println("1. Ver Series");
			System.out.println("2. Ver Películas");
			System.out.println("3. Ver Juegos");
			System.out.println("0. Volver al Menú Principal");
			System.out.print("Selecciona una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();

			if (opcion == 1) {
				verSeries();
			} else if (opcion == 2) {
				verPeliculas();
			} else if (opcion == 3) {
				verJuegos();
			} else if (opcion == 0) {
				break;
			}
		}
	}

	public static void verSeries() {
		if (listaSeries.isEmpty()) {
			System.out.println("No hay series disponibles.");
		} else {
			for (Serie serie : listaSeries) {
				System.out.println(serie);
			}
		}
	}

	public static void verPeliculas() {
		if (listaPeliculas.isEmpty()) {
			System.out.println("No hay películas disponibles.");
		} else {
			for (Pelicula pelicula : listaPeliculas) {
				System.out.println(pelicula);
			}
		}
	}

	public static void verJuegos() {
		if (listaJuegos.isEmpty()) {
			System.out.println("No hay juegos disponibles.");
		} else {
			for (Juego juego : listaJuegos) {
				System.out.println(juego);
			}
		}
	}
}