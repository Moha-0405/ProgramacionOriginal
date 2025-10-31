/*
 * Descripción: Hacemos los math que nos pide
 * Autor: Mohamed laaouar
 * Fecha: 01/10/2025
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 
{
	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		double num1,num2;
		System.out.println("Dame el numero del primero: ");
		num1=teclado.nextDouble();
		System.out.println("Dame el numero del segundo: ");
		num2=teclado.nextDouble();
		
		double numMenor;
		numMenor=Math.min(num1, num2);
		System.out.println("El numero menor es: "+numMenor);
		
		double numElevado= Math.pow(num1, num2);
		System.out.println("El numero elevado es: "+ numElevado);
		
		double numRaiz=Math.sqrt(num1);
		System.out.println("La raíz cuadrada del primer numero es: "+ numRaiz);
		
		num2=Math.random();
		System.out.println("El numero aleatorio del segundo numero es: "+ num2);
	}
}
