package entrada.salida;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		String texto = "127.0.0.7";
		String ruta = "./src/";
		String nombreArchivo = "miArchivoPlatzi.txt";
		
		try {
			FileWriter archivo = new FileWriter(ruta+nombreArchivo);
			archivo.write(texto);
			archivo.close();
			System.out.println("Se guardo correctamente la informacion");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
