package Segunda_Evaluacion;

public class Coche {
	private String numBastidor;
	private String matricula;
	private String modelo;
	private String marca;

	public Coche() {
	}

	public Coche(String mat) {
		this.matricula = mat;
	}

	public Coche(String basti, String matric, String mod, String marca) {
		this.numBastidor = basti;
		this.matricula = matric;
		this.modelo = mod;
		this.marca = marca;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String string) {
		// TODO Auto-generated method stub

	}

}
