import java.io.*;
import java.util.*;

public class ComprobarConexionJava {
	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner(System.in);
			System.out.print("Comando a ejecutar?");
			String cmd = leer.next();
			String[] command = { "sh", "-c", cmd };
			final Process process = Runtime.getRuntime().exec(command);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}