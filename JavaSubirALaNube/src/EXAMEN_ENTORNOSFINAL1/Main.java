package EXAMEN_ENTORNOSFINAL1;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Juan", "juan@mail.com", "123456789");
		Producto producto1 = new ProductoFisico("Libro", 20.0, 10);
		Producto producto2 = new ProductoDigital("Ebook", 10.0, 100);

		Pedido pedido = new Pedido(new Date(), "En proceso", cliente);
		pedido.agregarProducto(producto1, 2);
		pedido.agregarProducto(producto2, 1);

		cliente.enviarNotificacion();
		pedido.enviarNotificacion();
	}
}