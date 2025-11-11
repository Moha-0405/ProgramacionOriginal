package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int[] num= new int[100];
		
		for(int posicion=0; posicion<100;posicion++)
		{
			num[posicion]=(1+(int)(Math.random()*10));
			
		}
		
		System.out.println("Dame un numero entre el 1 y 10");
		int numTeclado=teclado.nextInt();
		
		if(numTeclado<=10&&numTeclado>0)
		{
		
			for(int posicion=0; posicion<100;posicion++)
			{
				
				if(numTeclado==num[posicion])
				{
					System.out.println("Las posiciones que se encuentra tu numero es la: "+ (posicion+1));
				}
				
			}
		}
		else
		{
			System.out.println("El numero no cumple la regla ");
		}
	}

}
