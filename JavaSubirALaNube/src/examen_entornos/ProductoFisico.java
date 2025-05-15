package examen_entornos;

public class ProductoFisico extends Producto {
	private double peso;

	public ProductoFisico(int idProducto, String nombre, double precioBase, double peso) {
		super(idProducto, nombre, precioBase);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
