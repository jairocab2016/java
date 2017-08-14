
public class Prueba 
{
	private double x;
	public Prueba(){x= -1.0;}
	protected void finalize()
	{
		System.out.println("Fin de objeto Prueba");
	}
}
