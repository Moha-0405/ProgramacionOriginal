/*
 * Descripción: Le enseñamos que valor cualitativo que tiene la nota 
 * Autor: Mohamed laaouar
 * Fecha: 08/10/2025
 */
package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 
{
	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Inserte el nombre: ");
		String nombre=teclado.nextLine();
		
		System.out.print("Inserte sus apellidos: ");
		String apellidos=teclado.nextLine();
		
		System.out.print("Inserte sus ciclo formativo: ");
		String cicloFormativo=teclado.nextLine();
		
		System.out.print("Inserte su nota académica: ");
		int notaAcademica=teclado.nextInt();
		
		if(notaAcademica>=0&&notaAcademica<=10)
		{
			if ( notaAcademica < 5 )
			{
				System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos+ "\nCiclo Formativo: "+ cicloFormativo);
				System.out.println ("Tu nota academia: "+notaAcademica+" (INSUFICIENTE)");
			}
			else if ( notaAcademica < 6  )
			{
				System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos+ "\nCiclo Formativo: "+ cicloFormativo);
				System.out.println ("Tu nota academia: "+notaAcademica+" (SUFICIENTE)");
			}
			else if (  notaAcademica < 7  )
			{
				System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos+ "\nCiclo Formativo: "+ cicloFormativo);
				System.out.println  ("Tu nota academia: "+notaAcademica+" (BIEN)");
			}
			else if ( notaAcademica < 9 )
			{
				System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos+ "\nCiclo Formativo: "+ cicloFormativo);
				System.out.println  ("Tu nota academia: "+notaAcademica+" (NOTABLE)");
			}
			else if( notaAcademica < 10 )
			{
				System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos+ "\nCiclo Formativo: "+ cicloFormativo);
				System.out.println  ("Tu nota academia: "+notaAcademica+" (SOBRESALIENTE)");
			}
			else
			{
				System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos+ "\nCiclo Formativo: "+ cicloFormativo);
				System.out.println  ("Tu nota academia: "+notaAcademica+" (Matrícula de Honor)");
			}
		}
		else
		{
			System.out.println ("La nota académica indicada es incorrecta");
		}
	}
}
