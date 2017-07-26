package controlador;

import modelo.Persona;

public class Logica {
	
	Persona[] personas;
	
	public void inicializarPersonas(int cantidadPersonas)
	{
		personas = new Persona[cantidadPersonas];
	}
	
	public void ingresarPersona(int posicion, String nombre)
	{
		Persona nuevaPersona = new Persona();
		nuevaPersona.setNombre(nombre);
		personas[posicion] = nuevaPersona;
	}
	
	public Persona traerPersona(int posicion)
	{
		return personas[posicion];
	}
	
	public Persona[] getPersonas()
	{
		return personas;
	}
}
