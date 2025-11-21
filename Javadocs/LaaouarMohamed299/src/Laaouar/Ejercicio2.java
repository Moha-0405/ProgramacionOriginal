/*
 * Descripción:te da 30 numeros aleatorios y luego pide los menores del numero selecionado e impares de 2 posiciones
 * Autor: Mohamed laaouar
 * Fecha: 12/11/2025
 */
package Laaouar;

import java.util.Scanner;

public class Ejercicio2 
{
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		final int fijo=30;
		int[] aleatorios=new int[fijo];
		
		for(int posicion=0;posicion<fijo;posicion++)
		{
			aleatorios[posicion] = (int)(Math.random() * 300);
		}
		
		for(int posicion=0;posicion<fijo;posicion++)
		{
			System.out.print(aleatorios[posicion]);
			System.out.println();
			System.out.println("-----");
		}
		int numeroTeclado;
		
			
		do
		{
			System.out.println("Dame un numero para que te muestre los menores de ese numero");
			numeroTeclado=teclado.nextInt();
		}while(numeroTeclado<0||numeroTeclado>300);
			
		for(int posicion=0;posicion<fijo;posicion++)
		{
			if(aleatorios[posicion]<numeroTeclado)
			{
				System.out.println("El numero es: "+aleatorios[posicion]+" y se encuentra en: "+(posicion+1));
			}
			
		}
		
		int posicion1Teclado;
		int posicion2Teclado;
		
		do
		{
			System.out.println("Dame la posicion 1. Valido solo del 0 al 29");
			posicion1Teclado=teclado.nextInt();
			
		}while(posicion1Teclado<0||posicion1Teclado>29);
		
		do
		{
			System.out.println("Dame la posicion 2 valido del 0 al 29 pero tiene que ser mayor al anterior numero");
			posicion2Teclado=teclado.nextInt();
			
		}while(posicion2Teclado<posicion1Teclado||posicion2Teclado>29);
		
		
		int contadorImpar=0;
		for(int posicion=0;posicion<fijo;posicion++)
		{
			if(posicion1Teclado<posicion)
			{
				if(posicion2Teclado>posicion)
				{
					if(aleatorios[posicion]%2!=0)
					{
						System.out.println("El numero impar de la posicion "+posicion+" es "+aleatorios[posicion]);
						contadorImpar++;
					}
					else
					{
						System.out.println(posicion+" esta posicion no tiene impar.");

					}
					
				}
			}
			
		}
		
		if(contadorImpar==0)
		{
			System.out.println("NO se ha encontrado ningun numero impar");

		}
		
		
	}
}
