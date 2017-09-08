
public class PortaAvion implements Barco 
{
	private int aviones = 19;
	private int tripulacion;
	
	public PortaAvion(int marinos)
	{
		tripulacion = marinos;
		System.out.println("marineros a sus puestos !!!");
	}

	@Override
	public void alarma()
	{
		System.out.println("marineros a sus puestos !!!");		
	}

	@Override
	public void msgSocorro(String av) 
	{
		System.out.println("SOS SOS !!! " + av);		
	}	
}
