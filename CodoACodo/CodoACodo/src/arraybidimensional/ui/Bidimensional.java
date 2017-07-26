package arraybidimensional.ui;

public class Bidimensional 
{
	public static void main (String [] arg) 
	{
		int[][] ejemplo = new int [2][3];		
		System.out.println("Se llena el arreglo de manera tradicional");
		
		/**
		 * Este bloque de codigo es para llenar el arreglo
		 */
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{	
				ejemplo[i][j] = (i * j);				
			}
		}
		
		
		System.out.println("Se imprime el arreglo de manera tradicional");
		/**
		 * Este bloque de codigo es para imprimir el arreglo
		 */
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.println(ejemplo[i][j] + " Este el valor contenido en la posicion " + i + "..." + j );
			}
		}
		
		
		System.out.println("Se imprime el arreglo utilizando foreach");
		//FOREACH		
		for (int[] x : ejemplo) 
		{
			for (int y : x) 
			{
				System.out.println(y);
			}
		}
	}
}