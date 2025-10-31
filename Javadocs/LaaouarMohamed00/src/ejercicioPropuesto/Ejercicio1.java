package ejercicioPropuesto;

import java.util.Scanner;
/*
 * Descripción: Pedimos el numero de preguntas acertadas y falladas para calcular la nota
 * Autor: Mohamed laaouar
 * Fecha: 07/10/2025
 */
public class Ejercicio1 
{
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int numAcertadas, numFalladas;
		double fallada, acertada, notaFinal;
		
		System.out.println("Inserte las preguntas acertadas: ");
		numAcertadas=teclado.nextInt();
		System.out.println("Inserte las preguntas falladas: ");
		numFalladas=teclado.nextInt();
		
		acertada= (numAcertadas*0.5);
		fallada=(numFalladas*0.25);
		notaFinal=(acertada-fallada);
		
		if(numAcertadas+numFalladas<=20)
		{
			if ( notaFinal < 5 )
			{
				System.out.println ("Tu nota final es "+notaFinal+", INSUFICIENTE");
			}
			else if ( notaFinal < 6  )
			{
				System.out.println ("Tu nota final es "+notaFinal+", SUFICIENTE");
			}
			else if (  notaFinal < 7  )
			{
				System.out.println  ("Tu nota final es "+notaFinal+", BIEN");
			}
			else if ( notaFinal < 9 )
			{
				System.out.println  ("Tu nota final es "+notaFinal+", NOTABLE");
			}
			else 
			{
				System.out.println  ("Tu nota final es "+notaFinal+", SOBRESALIENTE");
			}
		}
		else
		{
			System.out.println ("Datos erróneos");
		}
	}
}
