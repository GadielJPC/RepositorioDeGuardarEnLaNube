package GestorAlumnos;

public class Alumno {

	/*
	 * estas variables almacenan la informacion. Se declarar como private para que
	 * no puedan ser accedidos ni modificados directamente desde fuera de la clase
	 */
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	/*
	 * es un constructor por defecto que permite crear un objeto "Alumno" sin
	 * necesidad de asignar valores iniciales si no se declara, se genera
	 * automaticamente
	 */
	public Alumno() {
	}

	/*
	 * estos metodos permiten obtener los valores de los atributos "private" desde
	 * fuera de la clase. Por ejemplo, alumno1.getNombre() devuelve el nombre del
	 * alumno
	 */
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDNI() {
		return dni;
	}

	public int getedad() {
		return edad;
	}

	/*
	 * Estos metodos permiten modificar los valores de los atributos "private".
	 * Usamos this.atribute para diferenciar entre la variable local y la de
	 * instancia. Por ejemplo, en this.nombre = nombre, el primer "nombre" se
	 * refiere al atributo de la clase y el segundo al parametro que recibe el
	 * metodo
	 */
	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public void setApellido(String Apellido) {
		this.apellido = Apellido;
	}

	public void setDNI(String DNI) {
		this.dni = DNI;
	}

	public void setedad(int edad) {
		this.edad = edad;
	}
}
