package prueba3;  // Declaramos el paquete

import java.util.Scanner;  // Importamos Scanner para leer datos del usuario

public class prueba3 {

	public static void main(String[] args) {
		
		// Creamos un objeto Scanner para leer desde el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca los valores de A y B
		System.out.print("Introduce el valor de A: ");
		int A = sc.nextInt();
		
		System.out.print("Introduce el valor de B: ");
		int B = sc.nextInt();
		
		// Variable donde guardaremos el resultado (empezamos en 1)
		int resultado = 1;
		
		// Si el exponente es positivo, multiplicamos A tantas veces como indique B
		for (int i = 1; i <= B; i++) {
			resultado = resultado * A;
		}
		
		// Mostramos el resultado final
		System.out.println("\n" + A + " elevado a " + B + " es: " + resultado);
		
		// Cerramos el Scanner
		sc.close();
	}
}
