/*
 * Descripción: Hacemos la media de los numeros positivos y negativos tambien contamos los ceros puestos.
 * Autor: Mohamed laaouar 
 * Fecha: 16/10/2025
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 
{
	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
	
		int numero=0;
		int contadorPositivo=0;
		int contadorNegativo=0;
		int contadorDeCeros=0;
		int sumaPositiva=0;
		int sumaNegativa=0;
		int mediaPositiva=0;
		int mediaNegativa=0;

		do
		{
			System.out.println("Dame un valor: ");
			numero=teclado.nextInt();
			if(numero>0)
			{
				contadorPositivo++;
				sumaPositiva=sumaPositiva+numero;
				mediaPositiva=sumaPositiva/contadorPositivo;
				
			}
			else if(numero<0)
			{
				contadorNegativo++;
				sumaNegativa=sumaNegativa+numero;
				mediaNegativa=sumaNegativa/contadorNegativo;
				
			}
			else
			{
				contadorDeCeros++;
			}
		} while(contadorPositivo+contadorNegativo+contadorDeCeros<10);			//se hace hasta que la suma salga 10
		
		System.out.println("La media de los valores positivos es: "+ mediaPositiva);
		System.out.println("La media de los valores negativos es: "+ mediaNegativa);
		System.out.println("El numero de cero intoducidos es: "+ contadorDeCeros);
		
	}
}
