/*
 * Descripción: Comprobamos si tiene los requisitos para poder acceder al curso y le pedimos el nombre y apellidos si es admitido
 * Autor: Mohamed laaouar
 * Fecha: 03/10/2025
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 
{
	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Inserte la edad: ");
		byte edad=teclado.nextByte();
		
		if(edad<18)
		{
			System.out.print("No tiene la edad requerida para realizar estos estudios ");
		}
		else
		{
			teclado.nextLine();
			System.out.print("Inserte su nombre: ");
			String nombre=teclado.nextLine();
			
			System.out.print("Inserte sus apellidos: ");
			String apellidos=teclado.nextLine();
			
			System.out.println();
			System.out.println("Nombre: " +nombre+ " \nApellidos: "+apellidos+ "\nEdad: " +edad+"\n"+ " \nUsted ha sido admitido");
		}
	}
}
