package Ejercicios_Subclases.Ejercicio1_FigurasGeométricas;

public class Figuras_Geometricas {

	public static void main(String[] args) {
		Figura circulo = new Circulo(5);
		Figura rectangulo = new Rectangulo(4, 6);
		Figura triangulo = new Triangulo(3, 4, 3, 4, 5);

		System.out.println("Cricualo:");
		System.out.println("Area: " + circulo.calcularArea() + " cm");
		System.out.println("Perimtro: " + circulo.calcularPerimetro() + " cm");
		System.out.println("");

		System.out.println("Rectangulo:");
		System.out.println("Area: " + rectangulo.calcularArea() + " cm");
		System.out.println("Perimetro: " + rectangulo.calcularPerimetro() + " cm");
		System.out.println("");

		System.out.println("Triangulo:");
		System.out.println("Area: " + triangulo.calcularArea() + " cm");
		System.out.println("Perimetro: " + triangulo.calcularPerimetro() + " cm");
		System.out.println("");
	}

}
