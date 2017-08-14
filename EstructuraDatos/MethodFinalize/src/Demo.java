
public class Demo 
{
	private int datos;
	public Demo() {datos = 0;}
	protected void finalize()
	{
		System.out.println("Fin de objeto Demo");
	}
}
