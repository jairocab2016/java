
public class ProximosCienNum 
{
	static void proximosCienWhile(int num)
	{
		int inicio = num;
		int fin = num + 100;		
		while (inicio < fin)
		{
			inicio++;
			System.out.println(inicio);
		}
	}
	
	static void proximosCienDoWhile(int num)
	{
		int inicio = num;
		int fin = num + 100;
		do {
			inicio++;
			System.out.println(inicio);
		} while (inicio < fin);
	}
	
	static void proximosCienFor(int num)
	{
		int fin = num + 100;
		for(int i = num + 1; i <= fin; i++)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) 
	{
		proximosCienWhile(100);
		System.out.println("----------");
		proximosCienDoWhile(150);
		System.out.println("----------");
		proximosCienFor(420);
	}
}
