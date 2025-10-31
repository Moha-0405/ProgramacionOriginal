package estructurasSeleccion;

import java.util.Scanner;

public class EstructuraSeleccion {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame la edad: ");
		byte edad=teclado.nextByte();
		
		if(edad>=18)
		{
			System.out.println("Eres mayor de edad FELICIDADES.");
		}
	}

}
