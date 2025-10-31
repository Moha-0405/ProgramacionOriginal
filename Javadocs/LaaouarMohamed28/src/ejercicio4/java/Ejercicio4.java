/*
 * Descripción: Hacemos la media de los numeros mayores a 0.
 * Autor: Mohamed laaouar 
 * Fecha: 16/10/2025
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 
{
	
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un valor positivo: ");
		int numero=teclado.nextInt();
		int contador=1;
		int suma=0;
		int media=0;
		if(numero>0)
		{
			while(numero!=0)					
			{
				suma=suma+numero;
				System.out.println("Dame otro valor positivo(0 para terminar): ");
				numero=teclado.nextInt();
				contador++;
			}
			contador--;
			media=suma/contador;
			System.out.println("Cantidad de números mayores a 0 es: "+ contador+"\nLa media es: "+ media);
		}
		else if(numero<0)
		{
			System.out.println("El valor no es positivo.");
		}
		else
		{
			System.out.println("Se acaba la función al poner 0");
		}
	}
}
