package EXAMEN_ENTORNOSFINAL;

public class Cliente implements Notificable {
	private int idCliente;
	private String nombre;
	private String correo;

	public Cliente(int idCliente, String nombre, String correo) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.correo = correo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Notificación enviada a " + nombre + " en " + correo);
	}
}