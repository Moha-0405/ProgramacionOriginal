package opercacionesConCadenas;

import java.util.Scanner;

public class OpercaionesConCadenas1 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre= teclado.nextLine();
		String letraMayus;
		
		int tamanyo= nombre.length();
		System.out.println("Numero de caracteres del nombre: "+ tamanyo);
		
		letraMayus=nombre.substring(0,1);
		String may=letraMayus.toUpperCase();
		String finNombre=nombre.substring(1).toLowerCase();
		System.out.println( (may+finNombre));
		//str.toUpperCase().charAt(0) + str.substring(1, str.length())
	}

}
