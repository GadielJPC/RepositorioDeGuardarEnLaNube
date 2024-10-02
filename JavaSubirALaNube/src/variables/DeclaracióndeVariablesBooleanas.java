package variables;

public class DeclaracióndeVariablesBooleanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean valor1 = true;
	boolean valor2 = false;
	
	boolean resultadoAND = valor1 && valor2;
	boolean resultadoOR = valor1 || valor2;
	boolean resultadoNOT1 = !valor1;
	boolean resultadoNOT2 = !valor2;
	
	System.out.println("Resultado de AND entre valor1 y valor2 " + resultadoAND);
	System.out.println("Resultado de OR entre valor1 y valor2 " + resultadoOR);
	System.out.println("Resultado de NOT sobre valor1 " + resultadoNOT1);
	System.out.println("Resultado de NOT sobre valor1 " + resultadoNOT2);
	}

}
