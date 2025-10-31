/*
 * Descripción: Hacemos un pequeño juego en el que tu das un numero e intentas acertar el numero aleatorio 
 * Autor: Mohamed laaouar 
 * Fecha: 17/10/2025
 */
package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 
{
	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		double numero;
		int aleatorio=(int)(Math.random()*51);
		
		do
		{
		
			System.out.println("Dame un numero ");
			numero=teclado.nextDouble();
			if(numero>aleatorio)
			{
				System.out.println("Mayor");
			}
			else if(numero<aleatorio)
			{
				System.out.println("Menor");
			}
			else
			{
				System.out.println("Has acertado ");
			}
			
		} while(numero!=aleatorio);
		
	}
}
