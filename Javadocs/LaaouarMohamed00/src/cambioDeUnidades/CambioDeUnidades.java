package cambioDeUnidades;

import java.util.Scanner;
public class CambioDeUnidades {

	public static void main(String[] args) 
	{
		System.out.print("Escribe el numero en metros: ");
		Scanner teclado= new Scanner(System.in);
		
		double metros=teclado.nextDouble();
		
		double decimetros=metros*10;
		
		double centimetros=metros*100;
		
		double milimetros=metros*1000;
		
		double pulgada=centimetros/2.54;
		double pie=pulgada/12;
		double yarda=pie/3;
		
		System.out.println("Has pedido: "+ metros);
		System.out.println("Decímetros: "+ decimetros);
		System.out.println("Centrímetros: " +centimetros);
		System.out.println("Milímetros: "+ milimetros);
		System.out.println();
		System.out.println("Pulgadas: "+ pulgada);
		System.out.println("Pies: "+ pie);
		System.out.println("Yardas: "+ yarda);
		
		
	}

}
