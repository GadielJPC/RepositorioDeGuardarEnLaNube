package TiendaEnLinea;

public class Cliente {

	private String nombre;
	private String email;
	private String direccion;

	public Cliente(String nombre, String email, String direccion) {
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override

	public String toString() {
		return "Datos del cliente " + nombre + ", email " + email + ", con direccion " + direccion;
	}

}
