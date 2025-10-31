package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame un numero positivo:");
		int numeroUsuario=teclado.nextInt();
		int contador;
		
		
		if(numeroUsuario>=0)
		{
			long factorial=1;
			for(contador=1;contador<=numeroUsuario;contador++)
			{
				factorial*=contador;
			}
			System.out.println("El factorial del numero "+ numeroUsuario + " es "+ factorial);
		}
		else
		{
			System.out.println("No exixte factorial de numeros negativos");
		}
	}

}
