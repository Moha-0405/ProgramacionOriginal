package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		double[][] notas=new double[4][5];
		
		for(int alumno=0;alumno<4;alumno++)
		{
			for(int asignatura=0;asignatura<5;asignatura++)
			{
				System.out.println("Introduce la nota de la asignatura "+ (asignatura+1)+" del alumno "+ (alumno+1));
				notas[alumno][asignatura]=teclado.nextDouble();
			}
		}
		
		double maxima;
		double minima;
		double media=0;
		for(int alumno=0;alumno<4;alumno++)
		{
			maxima= notas[alumno][0];
			minima= notas[alumno][0];
			double suma=0;
			for(int asignatura=0;asignatura<5;asignatura++)
			{
				suma=suma+notas[alumno][asignatura];
				
				if(maxima<notas[alumno][asignatura])
				{
					maxima=notas[alumno][asignatura];
				}
				if(minima>notas[alumno][asignatura])
				{
					minima=notas[alumno][asignatura];
				}
				
			}
			media=suma/5;
			System.out.println("\nAlumno " + (alumno + 1) + ":");
			System.out.println("Nota mínima: " + minima);
			System.out.println("Nota máxima: " + maxima);
			System.out.println("Nota media: " + media);
			
		}
		
	}

}
