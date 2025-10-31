/*
 * Descripción: Atraves de su nota media le decimos si puede o no acceder a los estudios
 * Autor: Mohamed laaouar
 * Fecha: 09/10/2025
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Ingresa la nota de la primera asignatura: ");
		double asignatura1= teclado.nextDouble();
		
		System.out.println("Ingresa la nota de la segunda asignatura: ");
		double asignatura2= teclado.nextDouble();
		
		System.out.println("Ingresa la nota de la tercera asignatura: ");
		double asignatura3= teclado.nextDouble();
		
		System.out.println("Ingresa la nota de la cuarta asignatura: ");
		double asignatura4= teclado.nextDouble();
		
		double notaMedia=(asignatura1+asignatura2+asignatura3+asignatura4)/4;
		
		double redondeo=Math.round(notaMedia);
		System.out.println("El numero redondeado es "+ redondeo);
		double redondeoAlto=Math.ceil(notaMedia);
		System.out.println("El numero redondeado hacia arriba "+ redondeoAlto);
		double redondeoBajo=Math.floor(notaMedia);
		System.out.println("El numero redondeado hacia abajo "+ redondeoBajo);
		
		if(notaMedia>8)
		{
			System.out.println("Puedes acceder a estudios superiores, su nota es de "+ notaMedia);
		}
		else
		{
			System.out.println("Nota media obtenida no es suficiente para acceder a los estudios que deseaba, su nota es de "+ notaMedia);
		}
	}

}
