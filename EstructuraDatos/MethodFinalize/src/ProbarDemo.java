
public class ProbarDemo 
{
	public static void main(String[] args)
	{
		Demo d1, d2;
		Prueba p1, p2;
		d1 = new Demo();
		p1 = new Prueba();
		System.gc(); // no se libera ningun objeto
		
		p2 = p1;
		p1 = new Prueba();
		System.gc(); // no se libera ningun objeto
		p1 = null;
		d1 = new Demo();
		System.gc(); // se liberan dos objetos
		d2 = new Demo();
		// se liberan objetos restantes
	}
}
