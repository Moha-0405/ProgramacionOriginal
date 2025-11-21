package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Escribe la frase que quieras");
		
		String frase= teclado.nextLine();
		char[] caracter = frase.toCharArray() ;
		String palabra= "";
		
		for(int posicion=0;posicion<caracter.length;posicion++)
		{
			if(caracter[posicion]!=' ')
			{
				palabra+=caracter[posicion];
			}
			else
			{
				System.out.println(palabra);
			}
			palabra=" ";
		}
		
	}falta por terminar

}
