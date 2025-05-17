package EXAMEN_ENTORNOSFINAL1;

public class PedidoProducto {
	private Pedido pedido;
	private Producto producto;
	private int cantidad;

	public PedidoProducto(Pedido pedido, Producto producto, int cantidad) {
		this.pedido = pedido;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}
}