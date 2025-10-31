/*
 * Descripción: miramos sus requisitos y se contrata si lo cumple
 * Autor: Mohamed laaouar
 * Fecha: 08/10/2025
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

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
			System.out.print("Inserte en cuantos proyectos a trabajado: ");
			int proyectos=teclado.nextInt();
			
			if(experiencia>2&& proyectos>3)
			{
			
				if(experiencia>5|| proyectos>5)
				{
					System.out.println("Enhorabuena. Ha sido contratado");
					System.out.println("Su salario anual sera de: 30000");
				}
				else
				{
					System.out.print("Enhorabuena. Ha sido contratado");
					System.out.print("Su salario anual sera de: 25000");
				}
			}
			else
			{
				System.out.print("Lo sentimos pero no cumple nuestro perfil");
			}
		}
	}

}
