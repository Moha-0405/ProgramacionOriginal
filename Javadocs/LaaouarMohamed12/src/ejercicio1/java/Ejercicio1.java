/*
 * Descripción: le solicitamos al usuario los datos y se lo muestro en pantalla
 * Autor: Mohamed laaouar
 * Fecha: 25/09/2025
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 
{
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in); //declaramos
		
		System.out.println("Dame el nombre: ");
		String nombre=teclado.nextLine();  //declaramos y hacemos que pida datos
		
		
		System.out.println("Dame los apellidos: ");
		String apellidos=teclado.nextLine(); //declaramos y hacemos que pida datos
		
		
		System.out.println("Dame la dirección: ");
		String direccion=teclado.nextLine(); //declaramos y hacemos que pida datos
		
		
		System.out.println("Dame la edad: ");
		byte edad=teclado.nextByte();          //declaramos y hacemos que pida datos
		
		System.out.println("Dame la altura: ");
		double altura=teclado.nextDouble(); //declaramos y hacemos que pida datos
		
		System.out.println("Dame la peso: ");
		double peso=teclado.nextDouble(); //declaramos y hacemos que pida datos
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Dirección: "+direccion);
		System.out.println("Edad: "+edad);
		System.out.println("Altura: "+altura);
		System.out.println("Peso: "+peso);
		
		
	}
}
