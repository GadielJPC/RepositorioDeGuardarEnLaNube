package examen_entornos;

public class ProductoDigital extends Producto {
	private double tamanoArchivo;

	public ProductoDigital(int idProducto, String nombre, double precioBase, double tamanoArchivo) {
		super(idProducto, nombre, precioBase);
		this.tamanoArchivo = tamanoArchivo;
	}

	public double getTamanoArchivo() {
		return tamanoArchivo;
	}

	public void setTamanoArchivo(double tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}
}