package ejercicio.sumarnaturales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Robot {
	
	boolean pedirNuevamente = true;
	
	public float leer() {

		String valorLeido = "";
		float valorConvertido = 0;

		try {

			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader lector = new BufferedReader(io);
			valorLeido = lector.readLine();
			valorConvertido = Float.parseFloat(valorLeido);
			pedirNuevamente = false;

		} catch (NumberFormatException nf) {
			System.out.println("Disculpe UD ha colocado un valor erroneo");
			pedirNuevamente = true;

		} catch (Exception e) {
			System.out.println("Ha ocurrido un error general");
			pedirNuevamente = true;
		}

		return valorConvertido;
	}
}