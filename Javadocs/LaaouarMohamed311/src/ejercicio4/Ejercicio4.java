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
		
		for(int alumno=0;alumno<4;alumno++)
		{
			for(int asignatura=0;asignatura<5;asignatura++)
			{
				System.out.println(notas[alumno][asignatura]);
			}
		}
		
	}

}
