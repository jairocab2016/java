import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inicial 
{
	public static void main(String [] args) throws IOException
	{
		final int NUM = 10;
		BufferedReader entrada = new BufferedReader(
								new InputStreamReader(System.in));
		
		int nums[] = new int[NUM];
		int total = 1;
		System.out.println("Por favor, introduzca " + NUM + " datos");
		
		for (int i = 0; i < NUM; i++)
		{
			nums[i] = Integer.parseInt(entrada.readLine());
		}
		
		System.out.println("Lista de numeros: ");
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.println(" " + nums[i]);
			total *= nums[i];
		}
		
		System.out.println("El producto de los numeros es " + total);
		
		
		
		
	}
}
