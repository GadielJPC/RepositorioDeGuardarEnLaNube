package Ejercicios_Subclases.Ejercicio1_FigurasGeométricas;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		this.altura = altura;
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

}
