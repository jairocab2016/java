
public class Velero	extends Barco 
{
	public Velero()
	{
		System.out.println("Se crea la parte del barco velero. ");
	}
	
	@Override
	public void alarma()
	{
		System.out.println("\tS.O.S desde un Velero");
	}
	
}
