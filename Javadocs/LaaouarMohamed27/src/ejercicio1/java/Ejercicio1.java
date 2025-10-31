/*
 * Descripción: miramos sus requisitos y se contrata si lo cumple
 * Autor: Mohamed laaouar
 * Fecha: 08/10/2025
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Inserte el nombre: ");
		String nombre=teclado.nextLine();
		
		System.out.print("Inserte sus apellidos: ");
		String apellidos=teclado.nextLine();
		
		System.out.print("Inserte su edad: ");
		byte edad=teclado.nextByte();
		
		System.out.print("Inserte su salario deseado: ");
		double salarioDeseado=teclado.nextDouble();
		
		if(salarioDeseado>30000||edad>45)
		{
			System.out.print("Lo sentimos pero no cumple nuestro perfil");
		}
		else
		{
			System.out.print("Inserte cuantos años de experiencia tiene: ");
			byte experiencia=teclado.nextByte();
			System.out.print("Inserte en cuantos proyectos a trabajado");
			byte proyectos=teclado.nextByte();
			
			if(experiencia>2&& proyectos>3)
			{
				System.out.print("Enhorabuena. Ha sido contratado");
			}
			else
			{
				System.out.print("Lo sentimos pero no cumple nuestro perfil");
			}
		}

	}

}
