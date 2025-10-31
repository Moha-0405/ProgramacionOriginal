package matriz;

public class PrimerDiaMes {

	public static void main(String[] args) 
	{
		int[][] temperatura;  //Declaracion
		temperatura= new int[30][12];   // Instanciación
		int diaTemp10;
		for(int dia=0;dia<30;dia++)
		{
			for(int mes=0; mes<12; mes++)
			{
				temperatura[dia][mes]=(int)(Math.random()*50);
				
			}
			
		}
		
		
		for(int mes=0; mes<12; mes++)
		{
			diaTemp10=0;
			while(temperatura[diaTemp10][mes]>=10)
			{
				diaTemp10++;
			}
			System.out.println("El primer dia <10 es "+diaTemp10);
		}

	}

}
