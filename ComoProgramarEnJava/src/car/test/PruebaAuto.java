package car.test;

public class PruebaAuto {
	
	public static void main(String[] args) {
		
		Auto car = new Auto("Mycar");
		
		System.out.println(car.getNombre());
		
		car.setNombre("MycarNot");
		
		System.out.println(car.getNombre());
		
	}

}
