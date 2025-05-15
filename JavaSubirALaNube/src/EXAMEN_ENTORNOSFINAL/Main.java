package EXAMEN_ENTORNOSFINAL;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Juan Pérez", "juan@ejemplo.com");
		Pedido pedido = new Pedido(101, new Date(), cliente);
		Producto laptop = new ProductoFisico(201, "Laptop", 999.99, 2.5);
		Producto ebook = new ProductoDigital(202, "E-book", 19.99, 5.0);

		ItemPedido item1 = new ItemPedido(2, 999.99, pedido, laptop);
		ItemPedido item2 = new ItemPedido(1, 19.99, pedido, ebook);

		pedido.agregarItem(item1);
		pedido.agregarItem(item2);

		cliente.enviarNotificacion();
		pedido.enviarNotificacion();
		pedido.mostrarProductosPedidos();
	}
}