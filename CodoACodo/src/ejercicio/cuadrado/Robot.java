package ejercicio.cuadrado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://codeshare.io/register?saveCodeshare=GL7wpe
public class Robot {
	
	boolean pedirnuevamente=true;
	
	public void linea_horizontal(int a){
		
		for(int x=0; x<a; x++){
			
			System.out.print("*");
		}
	}
	
	public void linea_vertical (int a){
		
		for (int i = 0; i < a; i++) {
			
			System.out.println();
			
			for(int y=0; y<a; y++){
				
				if(y==0 || (y+1) == a) {
					
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
					
				}
			}
		}
	}
	
	public float leer(){
		String valorleido="";
		
		float valorconvertido=0;
		
		try {
			InputStreamReader io=new InputStreamReader (System.in);
			BufferedReader leer=new BufferedReader (io);
			valorleido=leer.readLine();
			valorconvertido=Float.parseFloat(valorleido);
			pedirnuevamente=false;
		
			} catch (NumberFormatException nf) {
			// TODO: catch más importante
			
			System.out.println("Valor erroneo");
			
			pedirnuevamente=true;
			
			}catch (Exception nf) {
		
		
			System.out.println("Valor incorrecto");
			pedirnuevamente=true;
		
			}
	
			return valorconvertido;
	

	}
	
	public String leer_texto() {

		String valor_obtenido = "";

		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leer = new BufferedReader(io);
			valor_obtenido= leer.readLine();
	

			pedirnuevamente = false;

		} catch (IOException objexeption) {
			// TODO: catch más importante

			System.out.println("Error");

			pedirnuevamente = true;

		} catch (Exception nf) {

			System.out.println("Valor incorrecto");
			pedirnuevamente = true;

		}

		return valor_obtenido;

	}
	
	public void cuadrado(){

		linea_horizontal(5);
		linea_vertical(5);
		System.out.println();
		linea_horizontal(5);
	}
}