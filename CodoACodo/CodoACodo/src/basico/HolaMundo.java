package basico;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] miarray = new int[4][3];
//		
//		for (int i = 0; i < 4; i++) {
//			
//			for (int j = 0; j < 3; j++) {
//				
//				miarray[i][j] = i + j;
////				System.out.print(miarray[i][j] + " ");
//				System.out.printf("%s ", miarray[i][j]);
//			}
//		}
		
		String [] dias = {"lunes", 
						  "martes", 
						  "miercoles", 
						  "jueves", 
						  "viernes"};
		
		for (int i = 0; i < dias.length; i++) {
			
			System.out.println(dias[i]);
		}
		
		System.out.println(".................");
		
		for (String string : dias) {
			System.out.println(string);
			
		}

	}

}
