package TiendaEnLinea;

public class Pago {

	private String tipoPago;
	private double monto;
	private String estado;

	public Pago(String tipoPago, double monto, String estado) {
		this.tipoPago = tipoPago;
		this.monto = monto;
		this.estado = estado;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public double getMonto() {
		return monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Datos del pago " + "tipoPago: " + tipoPago + ", monto: " + monto + ", estado: " + estado;
	}
}
