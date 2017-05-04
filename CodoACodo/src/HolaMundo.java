import static org.junit.Assert.*;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] miarray = new int[4][3];
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				miarray[i][j] = i + j;
				System.out.print(miarray[i][j] + " ");
			}
		}

	}

}
