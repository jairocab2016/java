import java.util.Scanner;

public class E8_For {
	
	public static void main(String[] args) {
		
//		Dise�ar un algoritmo que realice el promedio de 4 n�meros. 
//		Los n�meros podr�n ser decimales y ser�n ingresados por pantalla por el usuario.
		
		Scanner lector = new Scanner(System.in);
		
		float acumulador = 0;
		float promedio;
		float numero;
		
		for (int i = 1; i <= 4; i++) {
			
			System.out.println("Ingresa el numero " + i);
			numero = lector.nextFloat();
			acumulador = acumulador + numero;			
		}
		
		promedio =  acumulador/4;
		System.out.println("El promedio de los numeros ingresados es: " + promedio);
		lector.close();
	}

}
