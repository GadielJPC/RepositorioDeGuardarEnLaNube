package TiendaEnLinea;

import java.time.LocalDate;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente("Juan Pérez", "juan@example.com", "Calle Falsa 123");

		Producto producto1 = new Producto(1, "Laptop", 1200.0);
		Producto producto2 = new Producto(2, "Mouse", 25.0);
		Producto producto3 = new Producto(3, "Teclado", 45.5);

		System.out.println("Productos disponibles:");
		System.out.println("1. " + producto1);
		System.out.println("2. " + producto2);
		System.out.println("3. " + producto3);

		Carrito carrito = new Carrito(1001);
		System.out
				.println("Seleccione los productos que desea agregar al carrito (ingrese el número, 0 para terminar):");
		while (true) {
			System.out.print("Producto (1-3): ");
			int opcion = scanner.nextInt();
			if (opcion == 0) {
				break;
			}
			switch (opcion) {
			case 1:
				carrito.agregarProducto(producto1);
				break;
			case 2:
				carrito.agregarProducto(producto2);
				break;
			case 3:
				carrito.agregarProducto(producto3);
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		}

		Pedido pedido = new Pedido(5001, LocalDate.now(), carrito.getCantidadTotalProductos(), cliente);
		carrito.setPedido(pedido);

		double montoTotal = carrito.getMontoTotal();
		Pago pago = new Pago("Tarjeta de crédito", montoTotal, "Pendiente");
		carrito.setPago(pago);

		System.out.println("--- Resumen de la Compra ---");
		System.out.println("Cliente: " + cliente);
		System.out.println("Carrito: " + carrito);
		System.out.println("Cantidad total de productos: " + carrito.getCantidadTotalProductos());
		System.out.println("Monto total: $" + montoTotal);
		System.out.println("Pedido: " + pedido);
		System.out.println("Pago: " + pago);

		pago.setEstado("Pagado");
		System.out.println("\nPago actualizado: " + pago);

		scanner.close();
	}
}