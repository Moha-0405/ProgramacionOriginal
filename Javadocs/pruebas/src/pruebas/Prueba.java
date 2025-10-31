package pruebas;  // Declaramos el paquete donde está la clase

import java.util.Scanner;  // Importamos la clase Scanner para leer datos del teclado

public class Prueba 
{
	public static void main(String[] args) 
	{
		// Creamos un objeto Scanner para poder leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca una cantidad
		System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
		int cantidad = sc.nextInt();  // Guardamos la cantidad introducida en la variable "cantidad"

		// Comprobamos si la cantidad es múltiplo de 5
		if (cantidad % 5 != 0) {  
			System.out.println("La cantidad debe ser múltiplo de 5.");
			sc.close();  // Cerramos el Scanner para liberar recursos
			return;      // Salimos del programa porque la cantidad no es válida
		}

		// Creamos un array con los valores de los billetes disponibles
		int[] billetes = {500, 200, 100, 50, 20, 10, 5};

		// Mostramos un mensaje inicial
		System.out.println("\nDesglose de billetes necesarios:");

		// Recorremos el array de billetes usando un bucle for tradicional
		for (int i = 0; i < billetes.length; i++) {
			// Calculamos cuántos billetes de este tipo se pueden usar
			int numBilletes = cantidad / billetes[i];
			
			// Si se pueden usar uno o más billetes de este tipo
			if (numBilletes > 0) {
				// Mostramos cuántos billetes de este tipo se necesitan
				System.out.println(numBilletes + " billete(s) de " + billetes[i] + " €");
				
				// Actualizamos la cantidad restante después de usar esos billetes
				cantidad = cantidad % billetes[i];
			}
		}

		// Cerramos el objeto Scanner
		sc.close();
	}
}
