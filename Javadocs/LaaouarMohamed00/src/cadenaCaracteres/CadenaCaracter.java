package cadenaCaracteres;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadenaCaracter {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		// Creamos el patron
		Pattern patron=Pattern.compile("[0-9]{8}[A-Z]");
		
		String posibleDni;
		System.out.println("Dame tu Dni: ");
		posibleDni=teclado.nextLine();
		
		//Preparamos la cadena de caracteres para comparar
		Matcher texto= patron.matcher(posibleDni);
		
		//Hacemos la comparacion obteniendo el resultado
		if(texto.matches())
		{
			System.out.println("El formato de dni es correcto ");
		}
		else
		{
			System.out.println("El formato de dni NO es correcto ");
		}
	}

}
