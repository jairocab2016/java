
public class DiaAnyo 
{
	private int dia;
	private int mes;	
	
	public DiaAnyo(int d, int m)
	{
		dia = d;
		mes = m;
	}
	
	public boolean igual(DiaAnyo d)
	{
		if ((dia == d.dia) && (mes == d.mes)) 
			return true;
		else
			return false;		
	}
	
	// muestra en pantalla el mes y el dia
	public void visualizar()
	{
		System.out.println("mes = " +  mes + " , dia = " +  dia);
	}
}
