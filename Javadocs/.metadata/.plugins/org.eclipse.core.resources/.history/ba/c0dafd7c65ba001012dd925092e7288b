package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		double[]numero=new double[100];
		
		System.out.println("Dame un numero");
		double numUsuario=teclado.nextDouble();
		int almacenadorSuperior=0;
		int almacenadorIgualado=0;
		for(int posicion=0;posicion<100;posicion++)
		{
			numero[posicion]=Math.random();
			if(numUsuario>numero[posicion])
			{
				almacenadorSuperior++;
				
			}
			else if(numUsuario==numero[posicion])
			{
				almacenadorIgualado++;
			}
			System.out.println(numero[posicion]);
		}
		System.out.println("Hay "+ almacenadorIgualado+" numeros iguales");
		System.out.println("Hay "+ almacenadorSuperior+" numeros superiores");
		
	}

}
