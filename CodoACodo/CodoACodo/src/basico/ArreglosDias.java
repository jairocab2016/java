package basico;

public class ArreglosDias {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		System.out.println(a + b);
		int[] numdias = {1,2,3,4,5,6,7};
		String[] nombredias = {"Lunes","Martes",
				"Mi�rcoles","Jueves","Viernes","S�bado","Domingo"};
		int[] miarreglo = new int[9];
		
		
		for (int i = 0; i < miarreglo.length; i++) {
			miarreglo[i] = i + 2;
		}
		
		for (int i = 0; i < miarreglo.length; i++) {
			System.out.print(miarreglo[i] + "\n") ;
		}
		
		System.out.println(nombredias[numdias[3] - 1]);
		
		if (a > b) {
			System.out.println("La variable a es mayor que b");
			} else {
				System.out.println("La variable b es mayor que a");
			}
		
	}

}
