
public class Arreglos 
{
	public static void main(String[] args) 
	{
		//Declaración de un array
		
		char cad[], p; // cad es un array de tipo char. p es una variable de tipo char.
		
		int [] v, w; // tanto v como w son declarados arrays unidimensionales de tipo int.
		
		double [] m, t[], x; // m y x son array de tipo double; t es un array de array con elementos de tipo double.
		
		
		// Creación de un array(referencia a un objeto)
		
		float [] notas; // declaración de una variable array.
		notas = new float[26]; // se crea(instancia) realmente el array.
		
		float [] notasn = new float[26]; // se puede escribir en una misma sentencia
		
		System.out.println(notas.length); // atributo length
		
		// Inicialazacion de un array
		
		int numeros [] = { 10, 20, 30, 40, 50, 60}; // define un array de 6 elementos y se inicializan a las constantes
		int n[] = {3, 4, 5};
		char d[] = { 'L', 'u', 'i', 's'};
		
		d[1] = 'o';
		d[2] = 'h';
		
		
	
		final int ene = 31, febre = 32;
		
		int meses[] = {ene, febre};
		
		for (int i = 0; i < meses.length; i++) 
		{
			
			System.out.println(meses[i]);
		}
		
		
		// Copia de arrays
		
		int nums[] = {12,23,25,65,62};
		int nums2[] = {87,77,74,87,89,23, 24, 12};
		
		System.out.println("Arreglos");
		
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.print(nums[i] + " ");
		}
		
		System.out.println("");
		for (int i = 0; i < nums2.length; i++) 
		{
			System.out.print(nums2[i] + " ");
		}
				
		System.out.println("\nMetodo arraycopy()");
		System.arraycopy(nums, 0, nums2, 0, 4);
	
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.print(nums[i] + " ");
		}
		
		System.out.println("");
		for (int i = 0; i < nums2.length; i++) 
		{
			System.out.print(nums2[i] + " ");
		}
		
		
		
		
		
		
		
		
		
	}
}
