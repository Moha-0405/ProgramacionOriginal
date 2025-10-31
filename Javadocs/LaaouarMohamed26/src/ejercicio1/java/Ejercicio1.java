/*
 * Descripción: Comprobamos si los dos numeros cuales mayor o si son iguales
 * Autor: Mohamed laaouar
 * Fecha: 03/10/2025
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 
{
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int num1,num2;
		System.out.print("Inserte el primer numero: ");
		num1=teclado.nextInt();
		System.out.print("Inserte el segundo numero: ");
		num2=teclado.nextInt();
		
		if(num1>num2)
		{
			System.out.print("El primer numero es mayor al segundo.");
		}
		else
		{
			if(num1==num2)
			{
				System.out.print("Los dos numeros son iguales");
			}
			else
			{
				System.out.print("El segundo numero es mayor al primero.");
			}
		}
	}
}
