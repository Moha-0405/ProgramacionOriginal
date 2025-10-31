package ejercicioPropuesto;

import java.util.Scanner;

public class Ejercicio2 
{
	public static void main(String[] args) 
	{

		Scanner teclado= new Scanner(System.in);
		
		int numAcertadas, numFalladas;
		double fallada, acertada, notaFinal;
		String resultado;
		System.out.println("Inserte las preguntas acertadas: ");
		numAcertadas=teclado.nextInt();
		System.out.println("Inserte las preguntas falladas: ");
		numFalladas=teclado.nextInt();
		
		
		if(numAcertadas+numFalladas<=20)
		{
			acertada= (numAcertadas*0.5);
			fallada=(numFalladas*0.25);
			notaFinal=(acertada-fallada);
			int redondear = (int) Math.floor(notaFinal);
			
			if(notaFinal<0)
			{
				notaFinal=0;
			}
			
					
			switch (redondear) 
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
			System.out.println  ("Tu nota final es "+notaFinal+", un "+ resultado);
			
		}
		else
		{
			System.out.println  ("Datos erroneos");
		}
	}
}
