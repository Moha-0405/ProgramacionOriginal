package bucle;

import java.util.Scanner;

public class bucleFor {

	public static void main(String[] args) 
	{
		int numero=5, contador;
		
		for(contador=10;contador>=1;contador--)
		{
			System.out.println(numero+" por "+contador+" es igual "+numero*contador);
		}

		System.out.println("Después del bucle, la variable contador contiene: "+ contador);
	}

}
