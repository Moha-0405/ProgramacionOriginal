/*
 * Descripción: Hacemos que la consola nos de datos.
 * Autor: Mohamed laaouar
 * Fecha: 24/09/2025
 */
package entradaDatos;

import java.util.Scanner;

public class PeticionDatos {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		byte edadAlumno;
		
		System.out.println("Dame la edad del alumno: ");
		edadAlumno= teclado.nextByte();
		System.out.println("La edad del alumno es "+ edadAlumno);
		
		
		String nombre;
		teclado.nextLine();
		System.out.println("Ahora dame el nombre del alumno: ");
		nombre= teclado.nextLine();
		System.out.println("El nombre es "+ nombre);
		
		double alturaAlumno;
		System.out.println("Dame la altura del alumno");
		alturaAlumno= teclado.nextDouble();
		System.out.println("La altura del alumno es "+ alturaAlumno);
	}

}
