package metodos;

import java.util.Scanner;

public class Metodos1 {

	public static void main(String[] args) 
	{
		Scanner teclado= new Scanner(System.in);
		int numero;
		boolean par;
		long resultado;
		
		numero=10;
		par= esPar(numero);
		
		resultado=elFactorial(numero);
		System.out.println(resultado);
		

		System.out.println("Dame el primer número:");
        double num1 = teclado.nextDouble();

        System.out.println("Dame el segundo número:");
        double num2 = teclado.nextDouble();

        teclado.nextLine(); 

        System.out.println("Dame el operador (+, -, *, /, %):");
        String operacion = teclado.nextLine();
        
        char operador = operacion.charAt(0);
        double resultado1 = losOperadores(num1, num2, operador);

        System.out.println("Resultado: " + resultado1);
	}
	//EsPar calcular si un valor es par. Devuelve un tipo booleano
	public static boolean esPar(int numero)
	{
		boolean par;
		if(numero%2==0)
		{
			par=true;
		}
		else
		{
			par= false;
		}
		return par;
	}
	
	//EsImPar calcular si un valor es impar. Devuelve un tipo booleano
	public static boolean esImPar(int numero)
	{
		
		return !esPar(numero);
	}
	
	//elFactorial calcula el factorial del numero.
	public static long elFactorial(int numero)
	{
		 long resultado = 1;
	        for (int i = 1; i <= numero; i++) 
	        {
	            resultado *= i;
	        }
	        
	    return resultado;
	}
	// losOperadores calcula el resultado de una operación entre dos números según el operador indicado
	public static double losOperadores(double num1, double num2, char operador) {
	    double resultado = 0;

	    switch (operador) {
	        case '+':
	            resultado = num1 + num2;
	            break;
	        case '-':
	            resultado = num1 - num2;
	            break;
	        case '*':
	            resultado = num1 * num2;
	            break;
	        case '/':
	            if (num2 != 0) {
	                resultado = num1 / num2;
	            } else {
	                System.out.println("Error: división por cero");
	                resultado = 0; 
	            }
	            break;
	        case '%':
	            resultado = num1 % num2;
	            break;
	        default:
	            System.out.println("Operador no válido: " + operador);
	            resultado = 0;
	            break;
	    }

	    return resultado;
	}

	
}
