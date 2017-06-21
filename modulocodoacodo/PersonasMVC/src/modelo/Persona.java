package modelo;

public class Persona {
	private String nombre;
	
	public Persona() {
	}
	
	public Persona(boolean llenarBD) {
		if (llenarBD)
		{
			crearBD();
		}
	}
	
	public void crearBD(){
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
}
