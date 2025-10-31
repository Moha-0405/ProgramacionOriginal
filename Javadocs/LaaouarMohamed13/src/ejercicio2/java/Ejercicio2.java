/*
 * Descripción: Hacemos un cambio de moneda
 * Autor: Mohamed laaouar
 * Fecha: 01/10/2025
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		double pedirEuros, pedirPesetas, solicitaEuros, solicitaPesetas;
		
		System.out.println("Dime la cantidad de euros: ");
		pedirEuros=teclado.nextDouble();
		pedirPesetas= pedirEuros*166.386;
		
		System.out.println("La cantidad de pesetas son: "+ pedirPesetas);
		
		System.out.println("Dime la cantidad de pesetas: ");
		solicitaPesetas=teclado.nextDouble();
		solicitaEuros=solicitaPesetas/166.386;
		System.out.println("La cantidad de euros son: "+ solicitaEuros);
		
		
	}

}
