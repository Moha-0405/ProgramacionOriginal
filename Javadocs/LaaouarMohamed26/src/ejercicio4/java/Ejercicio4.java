/*
 * Descripción: Comprobamos si tiene los requisitos para poder obtener el vale descuento.
 * Autor: Mohamed laaouar
 * Fecha: 08/10/2025
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		String nombre;
		String apellidos;
		int importeGastado1,importeGastado2,importeGastado3,importeGastado4,sumaTodo;
		double mediaTodo;
		
		System.out.println("Ingresa el nombre: ");
		nombre=teclado.nextLine();

		System.out.println("Ingresa los Apellidos: ");
		apellidos=teclado.nextLine();
		
		System.out.println("Ingresa la primera cantidad: ");
		importeGastado1=teclado.nextInt();
		
		System.out.println("Ingresa la segunda cantidad: ");
		importeGastado2=teclado.nextInt();
		
		System.out.println("Ingresa la tercera cantidad: ");
		importeGastado3=teclado.nextInt();
		
		System.out.println("Ingresa la cuarta cantidad: ");
		importeGastado4=teclado.nextInt();
		
		sumaTodo=importeGastado1+importeGastado2+importeGastado3+importeGastado4;
		mediaTodo=sumaTodo/4.0;
		
		if(sumaTodo>=300) 
		{
			System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos);
			System.out.println("Importe Gastado1: "+ importeGastado1+"\nImporte Gastado2: "+ importeGastado2+"\nImporte Gastado3: "+ importeGastado3+"\nImporte Gastado4: "+ importeGastado4);
			System.out.println("Importe Medio: "+ mediaTodo);
			System.out.println("Felicidades, sus compras pasan los 300€ en este mes, se le entregara un vale descuento de 50€.");
		}
		else
		{
			System.out.println("Nombre: "+nombre+"\nApellidos: "+ apellidos);
			System.out.println("Importe Gastado1: "+ importeGastado1+"\nImporte Gastado2: "+ importeGastado2+"\nImporte Gastado3: "+ importeGastado3+"\nImporte Gastado4: "+ importeGastado4);
			System.out.println("Importe Medio: "+ mediaTodo);
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}
	}

}

