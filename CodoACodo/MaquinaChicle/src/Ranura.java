
public class Ranura extends Manivela
{
	int monedaIngresada = 0;
	
	public void ingresarMoneda(int moneda)
	{
		Manivela maniv = new Manivela();
		if (moneda > 0 && moneda < 6)
		{
			if (maniv.giroManivela)
			{
				this.monedaIngresada += 0;
				Contenedor cont = new Contenedor();
				cont.entregarChicle(moneda);
			}
			else 
			{
				System.out.println("Se cancelo el pedido");
			}
			
		}
		else 
		{
			System.out.println("Debes introducir una moneda como minimo, como maximo 5");
		}
	}
	
	public static void main(String[] args) 
	{
		Ranura ranur = new Ranura();
		ranur.girarManivela(true);
		ranur.ingresarMoneda(3);
	}
	
}
