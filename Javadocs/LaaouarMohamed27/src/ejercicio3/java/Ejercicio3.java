/*
 * Descripción: Inserta la nota y sale que resultado es
 * Autor: Mohamed laaouar
 * Fecha: 09/10/2025
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Inserte su nota: ");
		int nota=teclado.nextInt();
		String resultado;
		
		switch (nota) 
		{
			case 0,1,2,3,4:{
				resultado="Insuficiente";
				break;
			}
			case 5:
			{
				resultado="Suficiente";
				break;
			}
			case 6:
			{
				resultado="Bien";
				break;
			}
			case 7,8:
			{
				resultado="Notable";
				break;
			}
			case 9,10:
			{
				resultado="Sobresaliente";
				break;
			}
			default:
			{
				resultado="Datos erroneos";
			}
			
		}
		
		if(nota<=10&&nota>=0)
		{
		System.out.println  ("Tu nota final es "+nota+", un "+ resultado);
		}
		else
		{
			System.out.println  (resultado);
		}
	}

}
