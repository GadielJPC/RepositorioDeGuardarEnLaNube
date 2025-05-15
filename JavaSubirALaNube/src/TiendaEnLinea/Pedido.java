package TiendaEnLinea;

import java.time.LocalDate;

public class Pedido {

	private int numeroDeSerie;
	private LocalDate fecha;
	private int totalDeProductos;
	private Cliente cliente;

	public Pedido(int numeroDeSerie, LocalDate fecha, int totalProductos, Cliente cliente) {
		this.numeroDeSerie = numeroDeSerie;
		this.fecha = fecha;
		this.totalDeProductos = totalProductos;
		this.cliente = cliente;
	}

	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getTotalDeProductos() {
		return totalDeProductos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setTotalDeProductos(int totalDeProductos) {
		this.totalDeProductos = totalDeProductos;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Haz realicado el pedido " + "numeroDeSerie: " + numeroDeSerie + ", fecha: " + fecha
				+ ", totalDeProductos: " + totalDeProductos + ", confirmar usuario: " + cliente;
	}
}
