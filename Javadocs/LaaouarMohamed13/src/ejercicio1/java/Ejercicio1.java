/*
 * Descripción: Calcular el salario total del usuario
 * Autor: Mohamed laaouar
 * Fecha: 01/10/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		String nombre,apellidos,fechaNacimiento;
		System.out.println("Nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Apellidos: ");
		apellidos=teclado.nextLine();
		System.out.println("Fecha de nacimiento: ");
		fechaNacimiento=teclado.nextLine();
		System.out.println("Salario bruto: ");
		double salarioBruto=teclado.nextDouble();
		System.out.println("Años trabajados: ");
		int aniosTrabajo=teclado.nextInt();
		double aumento=aniosTrabajo*2;
		double porcentajeAumento=(aumento* salarioBruto)/100;
		double salarioNeto=((salarioBruto) * 85) /100;
		double salarioTotal=((salarioBruto + porcentajeAumento) * 85) /100;;
		
		
		System.out.println("Estimad@ "+ nombre+ " "+ apellidos+ ", su salario bruto es "+ salarioBruto+ ", teniendo en \r\n"
				+ "cuenta un IRPF del 15% su salario neto es "+ salarioNeto+".");
		
		System.out.println(" Debido a sus "+aniosTrabajo+" años trabajando en la \r\n"
				+ "empresa su salario se incrementará en un 2% por cada año."+" El aumento es de "+ aumento+ " y el salario total es "+ salarioTotal);
		
	}

}
