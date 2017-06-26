package entrada.salida;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa texto a guardar");
		String texto = lector.nextLine();
		
		String ruta = "./src/";
		
		System.out.println("Ingresa nombre del archivo");
		String nombreArchivo = lector.nextLine();
		
		try 
		{
			FileWriter archivo = new FileWriter(ruta+nombreArchivo);
			archivo.write(texto);
			archivo.close();
			System.out.println("Se guardo correctamente la informacion");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());	
		}

	}

}
