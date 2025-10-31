package vectores;

public class VectoresArray 
{

	public static void main(String[] args) 
	{
		final int TOTAL_NUM=20;
		
		int[]numeros;			//Declaracion del array
		numeros= new int[TOTAL_NUM];		//Instanciamos array
		
		for(int posicion=0;posicion<TOTAL_NUM; posicion++)
		{
			numeros[posicion]=(int)(Math.random()*50);								//Inicializamos a 0 los elementos del array
		}
		
		for(int posicion=0; posicion<TOTAL_NUM;posicion++)
		{
			System.out.println("El valor de que hay en la posicion "+ posicion +" es: "+numeros[posicion]);

		}

	}

}
