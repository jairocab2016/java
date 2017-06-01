package mdatos.por.referencia;

public class Punto {
	
	private float x;
	private float y;
	
	public void setX (float x) {
		
		this.x = x;
	}
	
	public void setY (float y) {
		
		this.y = y;
	}
	
	public static void main(String[] args) {
		
		Punto unPunto = new Punto();
		System.out.printf("%s %s \n",unPunto.x, unPunto.y);
		
		Punto otroPunto = unPunto;
		otroPunto.setX(1.0f);
		otroPunto.setY(2.0f);
		System.out.printf("%s %s \n", otroPunto.x, otroPunto.y);
		
		System.out.printf("%s %s \n",unPunto.x, unPunto.y);
		
	}
}
