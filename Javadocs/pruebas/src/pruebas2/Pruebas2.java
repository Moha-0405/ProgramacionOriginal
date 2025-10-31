package pruebas2;

import java.util.Scanner;

public class Pruebas2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Piensa en un número del 1 al 100 y no me lo digas.");
		System.out.println("Voy a intentar adivinarlo...");
		System.out.println("Cuando te diga un número, responde con:");
		System.out.println("  - 'mayor' si tu número es más grande");
		System.out.println("  - 'menor' si tu número es más pequeño");
		System.out.println("  - 'igual' si he acertado\n");

		int min = 1;
		int max = 100;
		String respuesta;
		int intento;

		do {
			intento = (min + max) / 2;  // Adivinamos el número del medio
			System.out.println("¿Es " + intento + "? (mayor/menor/igual)");
			
			respuesta = sc.next();  // Leemos la respuesta del usuario

			// Comparamos sin usar equals
			if (respuesta.compareToIgnoreCase("mayor") == 0) {
				min = intento + 1;  // Ajustamos el rango hacia arriba
			}
			else if (respuesta.compareToIgnoreCase("menor") == 0) {
				max = intento - 1;  // Ajustamos el rango hacia abajo
			}
			else if (respuesta.compareToIgnoreCase("igual") == 0) {
				System.out.println("\n¡Genial! He adivinado tu número: " + intento);
			}
			else {
				System.out.println("Por favor, escribe 'mayor', 'menor' o 'igual'.");
			}

		} while (respuesta.compareToIgnoreCase("igual") != 0);  // Se repite hasta acertar

		sc.close();
	}
}
