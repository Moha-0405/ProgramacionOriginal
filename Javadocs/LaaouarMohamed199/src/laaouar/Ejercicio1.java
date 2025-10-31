/*
 * Descripción: Calculamos Expresiones fisicas matematicas
 * Autor: Mohamed laaouar
 * Fecha: 29/10/2025
 */
package laaouar;

import java.util.Scanner;

public class Ejercicio1 
{
	public enum Expresiones{OPERACION,FUERZA_PESO,NUMERO_VUELTAS,AREA_CIRCULAR};
	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		double valor, masa, tiempo,frecuencia, radioCirculo;
		
		System.out.print("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
		System.out.print("-----------------------------------");
		System.out.print("Introduce el valor de X:");
		valor=teclado.nextDouble();
		System.out.print("Introduce la masa (kg): ");
		masa=teclado.nextDouble();
		System.out.print("Introduce el tiempo (s):");
		tiempo=teclado.nextDouble();
		System.out.print("Introduce la frecuencia (hz):");
		frecuencia=teclado.nextDouble();
		System.out.print("Introduce el radio del círculo (m):");
		radioCirculo=teclado.nextDouble();

		double operacion=(valor+(valor/4.0))/(6.0-(valor/2.0));
		
		double fuerza=(masa*9.8);
		
		double numeroVueltas=(frecuencia*tiempo);
		
		double areaCirculo=(3.1415*(radioCirculo*radioCirculo));
		
		
		
		
		System.out.println("RESULTADOS");
		System.out.println("-----------------------------------");
		System.out.println("OPERACION: "+operacion);
		System.out.println("FUERZA_PESO: "+fuerza);
		System.out.println("NUMERO_VUELTAS: "+numeroVueltas);
		System.out.println("AREA_CIRCULO: "+areaCirculo);
	}

}
