package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 
{
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame un numero positivo:");
		int numeroUsuario=teclado.nextInt();
		int numero=1;
		
		
		while(numero<numeroUsuario)
		{
			System.out.println(numero);
			numero++;
		}
		System.out.println((numero++));
		
	}
}
