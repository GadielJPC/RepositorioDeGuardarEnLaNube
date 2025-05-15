package TiendaEnLinea;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private int idCarrito;
	private List<Producto> productos;
	private Pedido pedido;
	private Pago pago;

	public Carrito(int idCarrito) {
		this.idCarrito = idCarrito;
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public void quitarProducto(Producto producto) {
		productos.remove(producto);
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public int getCantidadTotalProductos() {
		return productos.size();
	}

	public double getMontoTotal() {
		double total = 0.0;
		for (Producto p : productos) {
			total += p.getPrecio();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Datos del Carrito" + "idCarrito: " + idCarrito + ", productos: " + productos + ", pedido: " + pedido
				+ ", pago: " + pago;
	}
}
