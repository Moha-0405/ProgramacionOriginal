package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame cuantas alturas guardaremos.");
		int n=teclado.nextInt();
		double[] altura=new double[n];
		
		double alturaTeclado;
		int posicion=0;
		double media=0;
		
		for(posicion=0;posicion<n;posicion++)
		{
			System.out.println("Dame la altura");
			alturaTeclado=teclado.nextDouble();
			altura[posicion]=alturaTeclado;
			
		}
		
		double max=altura[0];
		double min=altura[0];
		
		for(posicion=0;posicion<n;posicion++)
		{
			media=media+altura[posicion];
			
			if(altura[posicion]>max)
			{
				max=altura[posicion];
			}
			
			if(altura[posicion]<min)
			{
				min=altura[posicion];
			}
		}
		
		media=media/n;
		int contadorMayor=0;
		int contadorMenor=0;
		
		for(posicion=0;posicion<n;posicion++)
		{
			if(media>altura[posicion])
			{
				contadorMayor++;
			}
			
			if(media<altura[posicion])
			{
				contadorMenor++;
			}
		}
		System.out.println("La altura media es "+ media);
		System.out.println("La altura max es "+max);
		System.out.println("La altura min es "+ min);
		System.out.println("Hay "+ contadorMayor+" mas altos que la media");
		System.out.println("Hay "+ contadorMenor+" mas bajos que la media");
		
	}

}
