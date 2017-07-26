package basico;

import java.util.Scanner;

public class Ascensor {
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		int pisoActual = 0;
		int pisoSolicitado;
		
		String modoViaje = "";
		
		do {
			
			System.out.println("Ingrese subir o bajar para llamar el ascensor: ");
			modoViaje = lector.nextLine();
			
		} while (!(modoViaje.equalsIgnoreCase("subir") || modoViaje.equalsIgnoreCase("bajar")));
		
		System.out.println("Llamando al ascensor...\n");
		
		System.out.println("En que piso se encuentra actualmente: ");
		pisoActual = lector.nextInt();
		
		System.out.println("A que piso se dirige");
		pisoSolicitado = lector.nextInt();
		
		System.out.println("Ascensor en camino..");
		System.out.println("Ingresar al Ascensor");
		
		if (pisoActual < pisoSolicitado) {
			for (int i = pisoActual; i <= pisoSolicitado; i++) {
				System.out.println("Ascensor en piso " + i);
				pisoActual = i;
				
			}
			System.out.println("El ascensor se encuentra en el piso solicitado: " + pisoActual);
		} 
		
		if (pisoActual > pisoSolicitado) {
			
			for (int i = pisoActual; i >= pisoSolicitado; i--) {
				System.out.println("Ascensor en piso " + i);
				pisoActual = i;
			}
			
			System.out.println("El ascensor se encuentra en el piso solicitado: " + pisoActual);
		}
		
		
		
	}
	
	
}