package EXAMEN_ENTORNOSFINAL1;

public class ItemPedido {
	private int cantidad;
	private double precioUnitario;
	private Pedido pedido;
	private Producto producto;

	public ItemPedido(int cantidad, double precioUnitario, Pedido pedido, Producto producto) {
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.pedido = pedido;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Producto getProducto() {
		return producto;
	}
}