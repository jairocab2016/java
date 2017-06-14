package herencia.sobrecarga;

public class CalApp {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.mostrarResultado(calc.suma("4", "2", "4", "78.3", "5"));
				
		calc.mostrarResultado(calc.suma(2,2,435));
		
	}
}