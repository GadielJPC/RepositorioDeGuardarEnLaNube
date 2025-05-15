package EXAMEN_ENTORNOSFINAL;

public abstract class Producto {
	private int idProducto;
	private String nombre;
	private double precioBase;

	public Producto(int idProducto, String nombre, double precioBase) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
}
