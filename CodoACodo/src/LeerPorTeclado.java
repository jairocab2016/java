import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerPorTeclado {
	
	public static void main(String arg[]){
		
		
		
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader leer = new BufferedReader(io);
		boolean terminarPrograma = false;
		
		do 
		{
			try {
				System.out.println("Por favor ingrese un valor numerico: ");
				String valorLeido = leer.readLine();
				float valor = Float.parseFloat(valorLeido);
				System.out.println(valor);
				terminarPrograma = false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				terminarPrograma = true;
			}catch (NumberFormatException nf) {
				System.out.println("Error \n");
				terminarPrograma = true;
			}
		} while (terminarPrograma);
	}

}
