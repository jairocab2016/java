import java.io.*;

public class ProductoMat 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception
	{
		double v[];
		int n;
		System.out.println("Numero de elementos: ");
		n = Integer.parseInt(entrada.readLine());
		v = new double[n];
		leerArray(v);
		
		for (int i = 0; i < v.length; i++) 
		{
			System.out.println("Elemento " + i + ": " + v[i]);
		}
		
		System.out.println("El producto de los elementos= " + producto(v));
		
	}
	
	static void leerArray(double a[]) throws NumberFormatException, IOException
	{
		//int n = 0;
		System.out.println("Introduzca " + a.length + " datos.");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = Double.valueOf(entrada.readLine()).doubleValue();
		}
	}
	
	static double producto(double w[])
	{
		double result = 1.0;
		for (int i = 0; i < w.length; i++) 
		{
			if (w[i] > 0.0)
				result *= w[i];
			else
				continue;
		}
		return result;		
	}
	
	
}
