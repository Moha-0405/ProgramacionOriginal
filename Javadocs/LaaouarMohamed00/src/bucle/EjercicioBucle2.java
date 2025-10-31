package bucle;

import java.util.Scanner;

public class EjercicioBucle2 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int inicio,fin;
		int contador;
		System.out.println  ("Dame un numero de inicio: ");
		inicio=teclado.nextInt();
		System.out.println  ("Dame un numero de fin: ");
		fin=teclado.nextInt();

		System.out.println  ("Secuencia de numeros desde "+inicio+" hasta "+fin);
		contador= inicio;
		if(contador<=fin)
		{
			do
			{
				System.out.println (contador);
				contador=contador+1;
			} while(contador<=fin);
		}
		else
		{
			do
			{
				System.out.println (contador);
				contador=contador-1;
			} while(contador>=fin);
		}

	}

}
