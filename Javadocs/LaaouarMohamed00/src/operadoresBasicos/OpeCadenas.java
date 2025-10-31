/*
 * Descripción: Nos da la longitud de lo que escribas
 * Autor: Mohamed laaouar
 * Fecha: 25/09/2025
 */
package operadoresBasicos;

import java.util.Scanner;

public class OpeCadenas 
{
	public static void main(String[]arg)
	{
		Scanner teclado= new Scanner(System.in); //declaramos
		
		String nombre;
		int longitud;
		
		System.out.println("Dime el nombre: ");
		nombre= teclado.nextLine();
		
		longitud= nombre.length();
		System.out.println("Tu nombre tiene "+ longitud+ " cararteres.");
		
		String nombreMinuscula;
		nombreMinuscula=nombre.toLowerCase();
		
		System.out.println("Tu nombre es minúscula es "+ nombreMinuscula);
		
		String nombreMayuscula=nombre.toUpperCase();;
		System.out.println("Tu nombre es mayúscula es "+ nombreMayuscula);
	}
}
