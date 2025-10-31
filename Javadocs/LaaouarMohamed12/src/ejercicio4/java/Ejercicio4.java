/*
 * Descripción: Hacemos un enumerado y lo mostramos.
 * Autor: Mohamed laaouar
 * Fecha: 26/09/2025
 */
package ejercicio4.java;

public class Ejercicio4 {
	
	public enum Tamanyo{PEQUEÑA,MEDIANA,GRANDE,EXTRAGRANDE};
	
	public static void main(String[] args) 
	{
		Tamanyo tamanyoPequeño= Tamanyo.PEQUEÑA;
		Tamanyo tamanyoMediana= Tamanyo.MEDIANA;
		Tamanyo tamanyoGrande= Tamanyo.GRANDE;
		Tamanyo tamanyoExtraGrande= Tamanyo.EXTRAGRANDE;
		
		System.out.println("Tenemos bebidas "+ tamanyoPequeño+", "+tamanyoMediana+", "+tamanyoGrande+", "+tamanyoExtraGrande+ " que tamaño quieres.");
	}

}
