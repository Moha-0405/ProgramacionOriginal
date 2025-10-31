package bucle;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int inicio,fin;
		
		System.out.println  ("Dame un numero de inicio: ");
		inicio=teclado.nextInt();
		System.out.println  ("Dame un numero de fin: ");
		fin=teclado.nextInt();

		int contador=inicio;
		for(contador= inicio;contador<=fin;contador++)
		{
			System.out.println  ("Evaluando "+ contador);
			if(contador % 3==0)
			{
				System.out.println  (" "+contador+" es multiplo de 3");
			}
		}

	}

}
