package metodos;

public class Metodos1 {

	public static void main(String[] args) 
	{
		int numero;
		boolean par;
		
		numero=30;
		par= esPar(numero);
		System.out.println(par);
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

}
