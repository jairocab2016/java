import controlador.Logica;
import utils.Ayudante;
import vista.Pantallas;
import modelo.Persona;

public class Aplicacion {
	
	public static void main(String[] args) {
		Pantallas vista = new Pantallas();
		Logica controlador = new Logica();
		int cantidadPersonas = Ayudante.conversor(vista.ingresarValor("Ingresar valor: "));
		controlador.inicializarPersonas(cantidadPersonas);
		
		for (int i = 0; i < cantidadPersonas; i++)
		{
			controlador.ingresarPersona(i, vista.ingresarValor("Coloque el nombre"));
		}
		
		for (int i = 0; i < cantidadPersonas; i++) {
			Persona ekis = controlador.traerPersona(i);
			vista.mostrarMensaje(ekis.getNombre());
		}		
	}
}