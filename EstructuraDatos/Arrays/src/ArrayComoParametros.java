
public class ArrayComoParametros 
{
	static void cambiar(char c[])
	{
		c[2] = 'c';
	}
	
	public static void main(String[] args) 
	{
		char palabra[] = {'A', 'B', 'C', 'D'};
		cambiar(palabra);
		
		for(int i= 0; i < palabra.length; i++)
		{
			System.out.println(palabra[i]);
		}	
	}
}
