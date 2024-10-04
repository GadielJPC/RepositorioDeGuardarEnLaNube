package Sentencias_de_control;

import java.util.Scanner;

public class CalificacionSegunPuntuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Leer la puntuación del usuario
	        System.out.print("Introduce una puntuación de 0 a 100: ");
	        int puntuacion = scanner.nextInt();
        
        if (puntuacion >= 90) {
            System.out.println("Calificación: A");
        } else if (puntuacion >= 80) {
            System.out.println("Calificación: B");
        } else if (puntuacion >= 70) {
            System.out.println("Calificación: C");
        } else if (puntuacion >= 60) {
            System.out.println("Calificación: D");
        } else if (puntuacion < 60 && puntuacion >= 0) {
            System.out.println("Calificación: F");
        } else {
            System.out.println("Puntuación inválida. Debe estar entre 0 y 100.");
        }

        scanner.close(); // Cerrar el Scanner
    }
}