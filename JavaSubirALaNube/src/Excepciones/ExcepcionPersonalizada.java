package Excepciones;

class EdadInvalidaException extends Exception {
	public EdadInvalidaException(String mensaje) {
		super(mensaje);
	}
}

class Persona {
	private int edad;

	public void setEdad(int edad) throws EdadInvalidaException {
		if (edad < 0) {
			throw new EdadInvalidaException("La edad no puede ser negativa.");
		}
		this.edad = edad;
	}
}

public class ExcepcionPersonalizada {
	public static void main(String[] args) {
		Persona persona = new Persona();
		try {
			persona.setEdad(-5);
		} catch (EdadInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}