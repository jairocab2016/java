package car;

public class Auto {
	
	private String nombre;
	private String marca = "hiundai";
	private String modelo;
	private  int    anio;
	
	public Auto (String nombre) 
	{	
		super();
		this.nombre = nombre;	
	}
	
	public String getNombre () 
	{	
		return this.nombre;	
	}
	
	public void setNombre (String valor) 
	{	
		this.nombre = valor;
	}
	
	
	
	
	
	
}