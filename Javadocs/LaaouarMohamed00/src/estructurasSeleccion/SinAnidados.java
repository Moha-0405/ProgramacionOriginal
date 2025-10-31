package estructurasSeleccion;

import java.util.Scanner;

public class SinAnidados 
{

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int numero;
		System.out.println("Dime tu edad: ");
		numero=teclado.nextInt();
		
		/*if(numero>0)
		{
			System.out.println("El numero es positivo");
		}
		else
		{
			if(numero==0)
			{
				System.out.println("El numero es cero");
			}
			else
			{
				System.out.println("El numero es negativo");
			}
		}*/

		if(numero>50)
		{
			System.out.println("El numero es positivo");
		}
		else
		{
			System.out.println("El numero es negativo");
		}
		
		
		
		
		
		
		
		
	}

}
