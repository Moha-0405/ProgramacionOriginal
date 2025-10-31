
package operadoresBasicos;
import java.util.Scanner;
public class OperacionesBasicas {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		int dato1,dato3;
		double dato2;
		//dato1=5;
		//dato2=3;
		//dato3=2;
		System.out.println("Dame el primer dato");
		dato1= teclado.nextInt();
		System.out.println("dame el segundo dato");
		dato2= teclado.nextDouble();
		System.out.println("Dame el tercer dato");
		dato3= teclado.nextInt();
		
		
		
		/*double suma=dato1+dato2;
		double resta=dato1-dato2;
		double multiplicacion=dato1*dato2;
		double dividir=dato1/dato2;
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: "+ resta);
		System.out.println("La multiplicación es: "+ multiplicacion);
		System.out.println("La dividir es: "+ dividir);
		int resto;
		resto= dato1% dato3;
		System.out.println(dato1+" dividido entre "+ dato2+ " es: "+ dividir);*/
		
		
		
		/*boolean comparacion=dato1 == dato2;
		boolean diferente=dato1 != dato2;
		boolean mayor=dato1 > dato2;
		boolean menor=dato1 < dato2;
		boolean mayorIgual=dato1 >= dato2;
		boolean menorIgual=dato1 <= dato2;*/
		//boolean dato1mayor10,dato2mayor10, resultado;
		//dato1mayor10= (dato1>10);
		//dato2mayor10= (dato2>10);
		
		
		//resultado= dato1mayor10 && dato2mayor10;
		
		String resultado= (dato1< 18) ? "Menor":"Mayor";
		System.out.println(resultado);
		
		
		
		

	}

}
