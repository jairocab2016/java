import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cumple
{
	public static void main(String[] args) throws IOException
	{
		DiaAnyo hoy;
		DiaAnyo cumpleanyos;
		int d, m;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca fecha de hoy, dia: ");
		d = Integer.parseInt(entrada.readLine());
		
		System.out.println("Introduzca el n�mero de mes: ");
		m = Integer.parseInt(entrada.readLine());
		
		hoy = new DiaAnyo(d, m);
		
		System.out.print("Introduzca su fecha de nacimiento, dia: ");
		d = Integer.parseInt(entrada.readLine());
		
		System.out.println("Introduzca el numero de mes: ");
		m = Integer.parseInt(entrada.readLine());
		
		cumpleanyos = new DiaAnyo(d, m);
		
		System.out.println("La fecha de hoy es ");
		hoy.visualizar();
		System.out.println("Su fecha de nacimiento es ");
		cumpleanyos.visualizar();
		
		if (hoy.igual(cumpleanyos))
			System.out.println("Feliz cumplea�os ! ");
		else
			System.out.println("Feliz dia ! ");
	}
}
