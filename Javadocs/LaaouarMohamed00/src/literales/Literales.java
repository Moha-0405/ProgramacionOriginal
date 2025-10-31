/*
 * Descripción: Declaramos variables y las mostramos en consola
 * Autor: Mohamed laaouar
 * Fecha: 24/09/2025
 */
package literales;

public class Literales 
{

	public static void main(String[] args) 
	{
		byte edad=12; // Declaración e Inicialización
		int luz=300000; // Declaración e Inicialización
		byte edadMin=10; // Declaración e Inicialización
		String emai="vaya@mail.com";
		float pesoAtleta= 40.44f;
		byte mesesYear=12;
		char letraDni='C';
		String numTelefon="887-44-42-12";
		long metrosSol= 147_100_000_000L;
		double distanciaLuz = 9_460_740_478_580.8;
		
		System.out.println("La edad de un niño es "+ edad+ ".");
		System.out.println("La velocidad de la luz es de "+ luz+ " kilómetros por segundo.");
		System.out.println("La edad mínima para apuntarse a actividades de tiro con arco es de "+ edadMin+" años.");
		System.out.println("El correo electrónico de una persona es "+ emai+".");
		System.out.println("El peso de un atleta es de "+ pesoAtleta+" kilogramos.");
		System.out.println("El número de meses del año es "+ mesesYear+".");
		System.out.println("La letra del DNI de una persona es "+ letraDni+".");
		System.out.println("El número de teléfono es "+ numTelefon+".");
		System.out.println("La distancia de la tierra al sol es de "+ metrosSol+"  metros");
		System.out.println("La distancia que recorre la luz en un año es de "+ distanciaLuz+" kilómetros.");
	}

}
