package EXAMEN_ENTORNOSFINAL1;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Notificable {
	private String nombre;
	private String email;
	private String telefono;
	private List<Pedido> pedidos;

	public Cliente(String nombre, String email, String telefono) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.pedidos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Notificación enviada al cliente: " + nombre);
	}
}