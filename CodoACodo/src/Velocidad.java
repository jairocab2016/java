import java.util.Scanner;

public class Velocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector =  new Scanner(System.in);
		
		int kilometros;
		double kmPorHoraAMetrosPorSegundo = 0.277778;
		
		System.out.println("Ingresa velocidad en km/h");
		
		kilometros =  lector.nextInt();		
		
		System.out.printf("%s km/h son %s m/s", kilometros, (kilometros * kmPorHoraAMetrosPorSegundo));
		
		lector.close();		
		

	}

}
