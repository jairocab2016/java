import controlador.Logica;
import modelo.Empleado;
import vista.Pantalla;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		Logica logica = new Logica();
		Pantalla pantalla = new Pantalla();
		
		String personaBuscada = pantalla.ingresarValor("Ingresar nombre de persona a buscar"); 
		
		Empleado empleadobuscado = logica.buscarPorNombre(personaBuscada);
		//pantalla.mostrarMensaje(empleadobuscado.getNombre());		
		pantalla.datosObjeto(empleadobuscado);
		
	}

}
