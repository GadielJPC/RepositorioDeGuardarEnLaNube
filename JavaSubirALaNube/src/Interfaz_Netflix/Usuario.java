package Interfaz_Netflix;

public class Usuario {
	private String nombre;
	private String password;
	private String rol;

	public Usuario(String nombre, String password, String rol) {
		this.nombre = nombre;
		this.password = password;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public String getRol() {
		return rol;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario: " + nombre + ", Rol: " + rol;
	}
}
