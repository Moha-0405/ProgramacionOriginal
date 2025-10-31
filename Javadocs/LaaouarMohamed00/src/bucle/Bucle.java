package bucle;

import java.util.Scanner;

public class Bucle {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int numero;
		
		int contador=1;
		System.out.println  ("Dame un numero: ");
		numero=teclado.nextInt();
		int suma=numero;
		while( numero!=0 &&contador<8)
		{
			
			System.out.println  ("Dame otro numero: ");
			numero=teclado.nextInt();
			contador=contador+1;
			suma= suma + numero;
		}
		System.out.println  ("La suma es: "+ suma);
	}

}
