package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		int contador=1;
		int posicion=0;
		int contadorNegativo=0;
		int[] numero= new int[100];
		
		do
		{
			System.out.println("Dame un numero no nulo:");
			numero[posicion]=teclado.nextInt();
			while(numero[posicion]==0)
			{
				System.out.println("El 0 es nulo dame otro:");
				numero[posicion]=teclado.nextInt();
			}
			if(numero[posicion]<0)
			{
				contadorNegativo++;
				
			}
			contador++;
		} while(contador<=100);
		
		if(contadorNegativo>0)
		{
			System.out.println("Si, ha leido un numero negativo");
		}
		else
		{
			System.out.println("No, no ha leido un numero negativo");
		}
	}

}
