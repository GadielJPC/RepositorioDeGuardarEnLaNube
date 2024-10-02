package variables;

public class IntercambiarelValordeDosVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		
		System.out.println("Antes del intercambio:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Despues del intercambio:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
