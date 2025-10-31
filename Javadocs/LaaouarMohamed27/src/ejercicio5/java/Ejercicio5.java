/*
 * Descripción: Hacemos una operacion con 2 valores.
 * Autor: Mohamed laaouar
 * Fecha: 10/10/2025
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		double resultado=0;
		
		System.out.print("Introduzca el valor 1: ");
		double num1=teclado.nextDouble();
		
		System.out.print("Introduzca el valor 2: ");
		double num2=teclado.nextDouble();
		
		System.out.println("Indique la operación que quiere realizar ");
		System.out.println("(1)suma"+"\n(2)resta"+"\n(3)multiplicación"+"\n(4)división");
		int operacion=teclado.nextInt();
		
		switch(operacion)
		{
			case 1:
			{
				resultado=num1+num2;
				System.out.println("Resultado: "+ resultado);
				break;
			}
			case 2:
			{
				resultado=num1-num2;
				System.out.println("Resultado: "+ resultado);
				break;
			}
			case 3:
			{
				resultado=num1*num2;
				System.out.println("Resultado: "+ resultado);
				break;
			}
			case 4:
			{
				resultado=num1/num2;
				System.out.println("Resultado: "+ resultado);
				break;
			}
			default:
			{
				System.out.println("No existe ninguna operación con ese numero seleccionado.");
			}
			
		
		}
		

	}

}
