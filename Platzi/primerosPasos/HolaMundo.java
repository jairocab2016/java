package primerosPasos;
import java.util.Iterator;
import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {

		int[] conjuntoEnteros;
		conjuntoEnteros = new int[3];
		conjuntoEnteros[0] = 12345;
		conjuntoEnteros[1] = 5;
		for (int i = 0; i < conjuntoEnteros.length; i++) {

			conjuntoEnteros[i] = 1;
			System.out.println("conjuntEnteros[" + i + "] : " + conjuntoEnteros[i]);

		}

		for (int i : conjuntoEnteros) {

			System.out.println(i);
		}

		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Dame el dato: ");
		// String dato = entradaTeclado.nextLine();
		// System.out.println(dato);
		entradaTeclado.close();

		double numero = 12345.34599333;
		System.out.println(Math.round(numero * 100 / 100));

		int[] miarreglo = { 1, 2, 3 };
		int[][] miarreglo2D = { { 1, 2, 3 }, { 1, 2, 5, 6 } };
		int[][][] miarreglo3D = { { { 2, 3, 4 } } };

		// System.out.println(conjuntoEnteros[0]);
		// System.out.println(conjuntoEnteros[1]);
		// System.out.println(conjuntoEnteros[2]);

		int[][] conjuntoEnteros2D = new int[3][3];
		conjuntoEnteros2D[0][1] = 12345;
		// System.out.println(conjuntoEnteros2D[0][1]);

		int[][][] conjuntoEnteros3D = new int[2][2][2];
		conjuntoEnteros3D[0][0][1] = 5;

		// System.out.println(conjuntoEnteros3D[0][0][1]);

	}
}