package bucle;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		int numero;
		
		int contador=0;
		
		int suma=0;
		do 
		{
			System.out.println  ("Dame un numero: (0 para terminar)  ");
			numero=teclado.nextInt();
			contador=contador+1;
			suma= suma + numero;
		} while( numero!=0);
		
		System.out.println  ("La suma es: "+ suma+" puso "+(--contador)+" numeros");		//Descuento al contador el numero 0
	}

}
