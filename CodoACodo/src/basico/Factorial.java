package basico;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		int factorial;
		int resultado = 1;
		
		System.out.print("Ingresa un numero para realizar el factorial: ");
		factorial = lector.nextInt();
		
		for (int i = factorial; i > 0; i--) {
			
			resultado = resultado * i;
		}
		
		System.out.println("El factorial de " + factorial + " es " + resultado);
		
		lector.close();

	}

}
