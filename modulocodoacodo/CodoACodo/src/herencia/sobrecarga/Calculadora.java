package herencia.sobrecarga;


public class Calculadora extends Display {
	
	public int suma(int a, int b) {
		return a +b;
	}
	
	public int suma (int a, int b, int c) {
		return a +b;
	}
	
	public double suma(double a, double b) {
		return a +b;
	}
	
	public double suma (double a, double b, double c) {
		return a +b;
	}
	
	public double suma(String... params) {
		double acumulador = 0;
		
		try {

			for (int i = 0; i < params.length; i++) {
				acumulador += Double.parseDouble(params[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Ud es un tonto");
			
		}
		
		
		return acumulador;
	}
	
	public void  mostrarResultado (int a) {		
		pantalla(String.valueOf(a));		
	}
	
	public void mostrarResultado (double a) {
		pantalla(String.valueOf(a));
	}
}
