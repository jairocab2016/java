
public class Casteo {
	
	public static void main(String[] args) {
		
		int entero = (int) 84.234;
		float flotante = (float) 54;
		
		System.out.printf("Esta es mi variable de tipo entero %s", entero);
		
		String miconversion = "67.4";
		
		flotante = Float.parseFloat(miconversion);

		
		System.out.printf("\nNuevo valor de mi variable flotante %s", miconversion);
		
		String enteroString = "314";
		
		entero = Integer.parseInt(enteroString);
		
		System.out.printf("\nNuevo valor variable entero %s ", entero);
		
	}

}
