package utils;

public class Calculadora {
	
	public static double suma( double a, double b ){
		return a+b;
	}
	
	public static double suma( double... valores ){
		
		double acumulado = 0;
		
		for (int i = 0; i < valores.length; i++) {
			acumulado += valores[ i ]; 
		}
		
		return acumulado;
		
	}

}
