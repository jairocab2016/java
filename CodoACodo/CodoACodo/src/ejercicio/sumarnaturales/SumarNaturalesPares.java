package ejercicio.sumarnaturales;

public class SumarNaturalesPares {
	
	public static void main(String[] args) {
		
		int n = 0, sumaNaturales = 0, sumaPares = 0;
		Robot objeto = new Robot();
		
		while (objeto.pedirNuevamente) {
			
			System.out.println("Por favor ingresa un valor numerico: ");
			n = (int)objeto.leer();
		}
		
		
		for (int i = 0; i <= n; i++) {
			
			sumaNaturales += i;
			
			if (i%2 == 0) {
				
				sumaPares += i;
								
			}
			
		}
		
		System.out.printf("La suma de los numeros naturales es %s\n", sumaNaturales);
		System.out.printf("La suma de los numeros pares es %s", sumaPares);
	}

}