package Repaso_Excepciones;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = "10a";

		try {
			int resultado = Integer.parseInt(numero); // Posible línea de error
			System.out.println("El número es: " + resultado);
		} catch (NumberFormatException e) {
			System.out.println("Error: Formato de número inválido");
		}
	}
}