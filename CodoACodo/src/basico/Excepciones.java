package basico;

public class Excepciones {
	
	public static void main(String[] args) {
		
		int number1 = 8;
		Integer numer2 = 0;
		
		System.out.println("Antes de dividir");
		
		try {
			System.out.println(number1/numer2);
		} catch (ArithmeticException ex) {
			
			String mensajeError = ex.getMessage();
			
			if (mensajeError.indexOf("zero") >=  0) {
				System.out.println("No se puede dividir por cero");
			}
		} catch (NullPointerException ex) {
			
			System.out.println("Se ingreso valor " +  ex.getMessage());
		}
		System.out.println("Despues de dividir");
		
	}

}
