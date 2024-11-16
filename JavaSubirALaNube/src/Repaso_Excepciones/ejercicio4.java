package Repaso_Excepciones;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = null;

		try {
			System.out.println(nombre.length());
		} catch (NullPointerException e) {
			System.out.println("Error: la cadena es nula");
		}
	}
}
