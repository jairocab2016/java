package mlista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private int    edad;
	
	public Jugador (String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
		
		//inicializamos la variable acumuladora de promedios
		float promedio = 0;
		
		//inicializamos la lista de jugadores
		//se especifica el tipo de datos de los elementos de la lista
		//entre cocodrilos (<y>) para evitar insertar otro tipo de objetos
		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		//agregamos un elemento a la lista con el metodo add()
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		
		//obtenemos un objeto Iterador que nos permita recorrer la lista
		Iterator<Jugador> iter = jugadores.iterator();
		
		//mientras exista un elemento siguiente por recorrer
		while (iter.hasNext()) {
			//obtenemos el jugador siendo recorrido
			Jugador j =  iter.next();	
			
			//acumulamos su edad promedio sobre el total de jugadores
			//que obtenemos con el metodo size() de la lista
			promedio += j.getEdad();
		}
		
		System.out.println("Promedio: " + promedio/jugadores.size());
		
	}

}
