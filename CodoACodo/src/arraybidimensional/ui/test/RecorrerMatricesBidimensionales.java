package arraybidimensional.ui.test;

import java.util.*;

public class RecorrerMatricesBidimensionales {

    public static void main(String[] args) {
    	
        final int FILAS = 5, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;
        
        int[][] A = new int[FILAS][COLUMNAS];
        
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
        
        //recorrer arreglo bidimensional con A[i].length
        System.out.println("valores introducidos:\n");
        for (i = 0; i < A.length; i++) {
        	
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        mayor = menor = A[0][0];//se toma el primero como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;

        for (i = 0; i < A.length; i++) {  //
            for (j = 0; j < A[i].length; j++) {
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (A[i][j] < menor) {
                    menor = A[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }           
        }
        System.out.print("\nElemento mayor: " + mayor);
        System.out.println(" Fila: "+ filaMayor + " Columna: " + colMayor);
        System.out.print("Elemento menor: " + menor);
        System.out.println(" Fila: "+ filaMenor + " Columna: " + colMenor);
        
        
        System.out.println("\nRecorrer arrays irregulares");
        int [][] a = {{6,7,5,0,4}, {3, 8, 4}, {1,0,2,7}, {9,5}};
        
        for (i = 0; i < a.length; i++) {  //número de filas
            for (j = 0; j < a[i].length; j++) { //número de columnas de cada fila
                 System.out.print(a[i][j] + " ");
            }
            System.out.println();
       }
        
        System.out.println();
        for (int[] ks : a) {
        	for (int k : ks) {
				System.out.print(k + " ");
			}
        	System.out.println();
        }
        
        
    }
}