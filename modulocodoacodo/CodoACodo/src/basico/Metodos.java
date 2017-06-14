package basico;
public class Metodos {
	
	public void mostrar(int valor){
		
		System.out.println(valor);
	}
	
	public int suma(int a, int b){
		
		return a + b;
	}
	
	public int resta(int a, int b){
		return a-b;
	}
	
	public int multiplicacion(int a, int b){
		return a*b;
	}
	
	public int division(int a, int b){
		return a/b;
	}
	
	
	public static void main(String[] args) {
		
		Metodos obj = new Metodos();
		
		obj.mostrar(obj.suma(32, 23));
		obj.mostrar(obj.resta(32, 23));
		obj.mostrar(obj.multiplicacion(32, 23));
		obj.mostrar(obj.division(32, 23));
		
	}
	
	

}
