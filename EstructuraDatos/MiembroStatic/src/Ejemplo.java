
public class Ejemplo 
{
	private int datos;
	static int cuenta = 0;
	
	public Ejemplo()
	{
		datos = 0;
		cuenta++; // nuevo objeto
	}
	
	public Ejemplo(int g)
	{
		datos = g;
		cuenta++; // nuevo objeto
	}
	
	// redifinición de finalize()
	protected void finalize()
	{
		System.out.println("Fin de objeto Ejemplo");
		cuenta--;
	}
}
