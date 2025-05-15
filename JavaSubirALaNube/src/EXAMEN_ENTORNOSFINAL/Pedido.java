package EXAMEN_ENTORNOSFINAL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements Notificable {
	private int idPedido;
	private Date fechaPedido;
	private Cliente cliente;
	private List<ItemPedido> items;

	public Pedido(int idPedido, Date fechaPedido, Cliente cliente) {
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.cliente = cliente;
		this.items = new ArrayList<>();
	}

	public int getIdPedido() {
		return idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemPedido> getItems() {
		return items;
	}

	public void agregarItem(ItemPedido item) {
		items.add(item);
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Estado del pedido " + idPedido + " actualizado para el cliente " + cliente.getNombre());
	}

	public void mostrarProductosPedidos() {
		System.out.println("Productos en el pedido " + idPedido + ":");
		if (items.isEmpty()) {
			System.out.println("  No hay productos en este pedido.");
		} else {
			for (ItemPedido item : items) {
				System.out.println("  - Producto: " + item.getProducto().getNombre() + ", Cantidad: "
						+ item.getCantidad() + ", Precio unitario: $" + item.getPrecioUnitario());
			}
		}
	}
}