/*
 * Descripción: Comprobamos si tiene los requisitos para poder acceder al curso
 * Autor: Mohamed laaouar
 * Fecha: 03/10/2025
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 
{
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Inserte el nombre: ");
		String nombre=teclado.nextLine();
		
		System.out.print("Inserte la edad: ");
		byte edad=teclado.nextByte();
		
		System.out.print("Inserte la nota academica: ");
		double notaAcademica=teclado.nextDouble();
		
		if(edad>18 && notaAcademica>7 && notaAcademica<=10)
		{
			System.out.print(nombre+", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		}
		else
		{
			if(notaAcademica>10)
			{
				System.out.println("Puso una nota incorrecta porfavor corrija el error.");
			}
			else
			{
				System.out.print(nombre+", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
			}
		}
	}
}
