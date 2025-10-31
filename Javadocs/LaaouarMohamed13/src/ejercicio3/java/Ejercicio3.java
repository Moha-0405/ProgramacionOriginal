/*
 * Descripción: hacemos intercambio de valores
 * Autor: Mohamed laaouar
 * Fecha: 01/10/2025
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		int num1,num2, num3;
		System.out.println("Dame el valor 1: ");
		num1=teclado.nextInt();
		System.out.println("Dame el valor 2: ");
		num2=teclado.nextInt();
		
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("La variable uno tiene el valor "+num1+" la variable dos tiene el valor "+ num2);
		
	}

}
