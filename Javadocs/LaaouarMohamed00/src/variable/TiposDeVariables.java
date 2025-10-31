/*
 * Descripción: ejemplos de variables
 * Autor: Mohamed
 * Fecha: 23/09/2025
 */
package variable;

public class TiposDeVariables 
{
	public static void main(String[]args) 
	{
		byte edadAlumno; // Declaración
		edadAlumno=0; // Inicialización
		
		byte edadProfesor=0;	// Declaración e Inicialización
		
		System.out.println("Valor de la variable: "+ edadAlumno);
		
		double alturaAlumno, pesoAlumno; //Declaración 
		pesoAlumno= 92.5;
		alturaAlumno= 1.75;
		
		System.out.println("Peso: "+ pesoAlumno+ " Altura: " + alturaAlumno);
		
		pesoAlumno=94;
		
		System.out.println("Peso: "+ pesoAlumno+ " Altura: " + alturaAlumno);
		
		char letraDni;
		letraDni= 'B';
		
		String nombreAlumno;
		nombreAlumno= "Mohamed";
				
		boolean mayorEdad= false;
		
		System.out.println("Hola, soy "+ nombreAlumno+ " y es " + mayorEdad +" que mi letra del DNI es "+ letraDni);
		
	}
}
