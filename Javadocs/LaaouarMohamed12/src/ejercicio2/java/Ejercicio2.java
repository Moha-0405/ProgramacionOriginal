/*
 * Descripción: le solicitamos al usuario los datos y se lo muestro en pantalla
 * Autor: Mohamed laaouar
 * Fecha: 26/09/2025
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in); //declaramos
		
		System.out.println("Dame el nombre del equipo: ");
		String nombreEquipo=teclado.nextLine();  //declaramos y hacemos que pida datos
	
		System.out.println("Dame la año de fundación: ");
		short añoFundacion=teclado.nextShort();          //declaramos y hacemos que pida datos
		teclado.nextLine();
		System.out.println("Dame los nombre del estadio: ");
		String nombreEstadio=teclado.nextLine(); //declaramos y hacemos que pida datos
		
		System.out.println("Dame los nombre capitán: ");
		String nombreCapitan=teclado.nextLine(); //declaramos y hacemos que pida datos
		
		
		System.out.println("**********************************************************************************************");
		System.out.println("******* Nombre del Equipo: "+nombreEquipo+ " ***********************************************");
		System.out.println("******* Fundado en: "+añoFundacion+" ****************************************************************");
		System.out.println("******* Estadio: "+nombreEstadio+" ******************************************************************");
		
		System.out.println("****** Capitán: "+nombreCapitan+" *************************************************************");
		

	}

}
