/*
 * Descripción: calculamos el cuadrado del numero que le pedimos
 * Autor: Mohamed laaouar 
 * Fecha: 16/10/2025
 */
package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 
{
	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un valor(Un valor negativo se termina la funcion): ");
		int numero=teclado.nextInt();
		
		do
		{
			
			int operacion=numero*numero;
			System.out.println(numero+"="+ operacion);
			System.out.println("Dame otro valor: ");
			numero=teclado.nextInt();
		} while(numero>=0);
		
		
	}
}
