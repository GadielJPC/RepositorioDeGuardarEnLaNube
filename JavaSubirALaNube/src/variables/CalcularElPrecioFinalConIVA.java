package variables;

public class CalcularElPrecioFinalConIVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double precio = 100.0;
	double IVA = 21.0;
	
	double PrecioconIVA = precio + (precio * IVA / 100);
	
	System.out.println("El precio con IVA del producto es " + PrecioconIVA + " euros");
	}

}
