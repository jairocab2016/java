
public class Matrices 
{
	public static void main(String[] args) 
	{
		char pantalla [][] = new char[80][24]; // matriz con 80 filas y 24 columnas
		int puestos [][] = new int[10][5]; // matriz de 10 filas por 5 columnas
		final int N = 4;
		double [][] matriz = new double[N][N]; // matriz cuadrada de N*N elementos
		
		// Inicialización de arrays multidimensionales
		int tabla1[][] = {{51, 52, 53},
						  {54, 55, 56}};
		
		int tabla2[][] = {{1, 2, 3, 4},
						  {5, 6, 7, 8},
						  {9, 10, 11, 12}};
		
		
		//Declaración y creación de arrays bidimensionales de distinto número de elementos por fila
		
		double tb[][] = {{1.5, -2.5},
						 {5.0, -0.0, 1.5}};
		
		int [] a = {1, 3, 5};
		int [] b = {2, 4, 6, 8, 10};
		int mtb[][] = {a, b};
		
		double [][] gr = new double[3][];
		gr[0] = new double[3];
		gr[1] = new double[6];
		gr[2] = new double[5];
	}
}
