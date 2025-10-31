package tiposDatos;

public class TiposDatos 
{
	public enum Estaciones {VERANO,OTOÑO,INVIERNO,PRIMAVERA};
	
	public static void main(String[] args) 
	{
		Estaciones estacionActual= Estaciones.OTOÑO;
		Estaciones estacionSiguiente= Estaciones.INVIERNO;
		
		
		System.out.println("La estación actual es "+ estacionActual+" y la siguiente estacion es "+estacionSiguiente);
	}

}
