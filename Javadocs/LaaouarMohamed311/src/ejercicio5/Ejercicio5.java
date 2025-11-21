package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame el numero de personas");
		int N=teclado.nextInt();
		
		double[][] persona=new double[N][2];
		
		double mediaHombre=0;
		double mediaMujer=0;
		double sumaVaron=0;
		double sumaMujer=0;
		int contadorHombre=0;
		int contadorMujer=0;
		for(int cantidad=0;cantidad<N;cantidad++)
		{
			 
			
			System.out.println("Dame el genero (0 es varón y 1 mujer)");
			int genero=teclado.nextInt();
			
			System.out.println("Dame el sueldo");
			double sueldo=teclado.nextDouble();
			persona[cantidad][0]= genero;
			persona[cantidad][1]= sueldo;
			
			if(genero==0)
			{
				sumaVaron=sumaVaron+sueldo;
				contadorHombre++;
			}
			if(genero==1)
			{
				sumaMujer=sumaMujer+sueldo;
				contadorMujer++;
			}
			
		}
		mediaHombre=sumaVaron/contadorHombre;
		mediaMujer=sumaMujer/contadorMujer;
		System.out.println("La media de los Varones es: "+ mediaHombre);
		System.out.println("La media de las Mujeres es: "+ mediaMujer);
	}

}
