import java.util.Scanner;

public class CalcularAnios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		int diasIng;
		int diasPorSemana = 7;
		int diasPorMes = 30;
		int diasPorAnio = 365;
		
		System.out.println("Ingresa un numero ");
		diasIng = lector.nextInt();
				
	
		System.out.println("La cantidad de dias son " + diasIng);
		
		System.out.println("La cantidad de semanas son " + (diasIng / diasPorSemana));
		
		System.out.println("La cantidad de meses son " + (diasIng / diasPorMes));
		
		System.out.println("La cantidad de años son " + (diasIng / diasPorAnio));
		
		
		
		

	}

}
