package mpila;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private int    edad;
	
	public Jugador (String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombreCompleto() {
		
		String nombreCompleto = this.nombre + " " + this.apellido;
		return nombreCompleto;
	}
	
	public int getEdad () {
		
		return edad;
		
	}
	
	public static void main(String[] args) {

		// creamos los jugadores con sus edades
		Jugador j1 = new Jugador("Miguel", "Houllebecq", 21);
		Jugador j2 = new Jugador("Pablo", "Auster", 19);
		Jugador j3 = new Jugador("Aldo", "Huxley", 23);
		Jugador j4 = new Jugador("Alejandro", "Baricco", 21);
		
		//inicializamos la pila de jugadores
		Stack<Jugador> pila = new Stack<Jugador>();
		
		//agregamos un elemento a la pila con el metodo push()
		pila.push(j1);
		pila.push(j2);
		pila.push(j3);
		pila.push(j4);
		
		while (!pila.empty()) {
			//mostramos el nombre del jugador en pantalla
			System.out.println(pila.pop().getNombreCompleto());
			
		}
		
	}

}
