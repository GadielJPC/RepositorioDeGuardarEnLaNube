package EXAMEN_ENTORNOSFINAL1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements Notificable {
	private Date fecha;
	private String estado;
	private Cliente cliente;
	private List<PedidoProducto> productos;

	public Pedido(Date fecha, String estado, Cliente cliente) {
		this.fecha = fecha;
		this.estado = estado;
		this.cliente = cliente;
		this.productos = new ArrayList<>();
		cliente.agregarPedido(this);
	}

	public Date getFecha() {
		return fecha;
	}

	public String getEstado() {
		return estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<PedidoProducto> getProductos() {
		return productos;
	}

	public void agregarProducto(Producto producto, int cantidad) {
		productos.add(new PedidoProducto(this, producto, cantidad));
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Notificación enviada sobre pedido en estado: " + estado);
	}
}