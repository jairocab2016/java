package arraybidimensional.ui.test;

public class Bidimensional {
	
	public static void main(String[] args) {
		
		int [][] enteros = new int [4][5];
		int[][]  alumnosfxniveleidioma = {{7,14,8,3},
										  {6,19,7,2},
										  {3,13,4,1}};
		
		
		System.out.println(alumnosfxniveleidioma[2][1]);
		//imprimir arreglo alumnos con for	
		System.out.println("Imprimir arreglo alumnos con FOR");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(alumnosfxniveleidioma[i][j]);
			}
			System.out.println();
			
		}
		
		//imprimir arreglo alumnos con foreach
		System.out.println("Imprimir arreglo alumnos con FOREACH");
		
		for (int[] is : alumnosfxniveleidioma) {
			for (int i : is) {
				System.out.println(i);
			}
			System.out.println();
		}


		
		//rellenar arreglo enteros
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				enteros[i][j] = i;				
			}
		}
		
		System.out.println("Imprimir arreglo enteros con FOREACH");
		//recorrer arreglo enteros con FOREACH
		for (int[] is : enteros) {
			for (int i : is) {
				System.out.println(i);
			}
			System.out.println();
		}
		
		
		//rellenar con nuevos valores el 2 elemento del array alumnos
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				for (int j = 0; j < 4; j++) {
					alumnosfxniveleidioma[i][j] = 1; 
				}
			}
						
		}
		
		System.out.println("Imprimir arreglo alumnos con FOREACH\n");
		
		for (int[] is : alumnosfxniveleidioma) {
			for (int i : is) {
				System.out.println(i);
			}
			System.out.println();
		}
	}
	
}
