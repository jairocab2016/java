package arraybidimensional.ui;


public class BidimensionalHelper 
{	
	public int aleatorio(int min, int max)
	{
		int randomNum = (int) (Math.random() * max) + 1;
		return randomNum;
	}
	
	public int [][] llenarArreglo (int Filas, int Columnas) 
	{
		int [][] arreglo = new int [Filas][Columnas];
		
		for (int i = 0; i < arreglo.length; i++) 
		{
			for (int j = 0; j < arreglo[i].length; j++)
			{
				arreglo[i][j] = aleatorio(1, 20);
			}
		}		
		return arreglo;		
	}
	
	public void mostrarNotasAlumnos (String[] nombreAlumnos, int[][] notas, int nAlumnos, int nEvaluaciones) 
	{
		for (int i = 0; i < nAlumnos; i++) 
		{
			for (int j = 0; j < nEvaluaciones; j++) 
			{
				System.out.printf("%s evalucion # [%s] : %s \n", nombreAlumnos[i], j, notas[i][j]);
			}
		}
	}
	
	public int buscarAlumnoPorNombre (String[] nombreAlumnos, String alumno) 
	{
		int posicion = 0;
		for (int i = 0; i < nombreAlumnos.length; i++) 
		{
			if (nombreAlumnos [i].equalsIgnoreCase(alumno)) 
			{
				posicion = i;
				break;
			}
		}
		return posicion;
	}
}