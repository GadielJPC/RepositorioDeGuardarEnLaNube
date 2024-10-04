package Sentencias_de_control;
import java.util.Scanner;

public class Menúconswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Bucle del menú
        while (opcion != 5) {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            // Variables para los números
            int num1, num2;

            switch (opcion) {
                case 1:
                    // Suma
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    // Resta
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    // Multiplicación
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    // División
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre 0.");
                    }
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println(); // Línea en blanco para separar iteraciones del menú
        }

        // Cerrar el Scanner
        scanner.close();
    }
}