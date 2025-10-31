/*
 * Descripción: Hacemos y mostramos el ceil, floor y round.
 * Autor: Mohamed laaouar
 * Fecha: 01/10/2025
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame el dato: ");
		double dato=teclado.nextDouble();
		double ceil= Math.ceil(dato);
		double floor= Math.floor(dato);
		double round= Math.round(dato);
		
		System.out.println("Mostramos primero el ceil: "+ceil+ "\nAhora mostramos el floor: "+floor+"\nY por ultimo te mostrare el round: "+round);
	}

}
