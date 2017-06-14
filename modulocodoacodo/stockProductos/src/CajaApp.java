import controlador.Caja;
import modelo.Productos;
import vista.Pantalla;

public class CajaApp {
	
	public static void main(String[] args) {

		Pantalla vista = new Pantalla();
		Caja controlador = new Caja();
		
		int cantidadProductos = vista.numeroProductosComprar();

		Productos[] comprados = new Productos[ cantidadProductos ];
		
		controlador.setCantidadProductosComprados( cantidadProductos );
		
		for (int i = 0; i < cantidadProductos; i++) {
			
			String nombre = vista.buscarProducto();
			
			Productos producto = controlador.buscarProductoPorNombre( nombre );
			
			if( producto != null ){
				
				comprados[ i ] = producto;	
			} else {
				comprados[ i ] = null;
				vista.mostrarMensaje( "No existe el producto en nuestra base de datos" );
			}
			
		}
		
		vista.mostrarMensaje( "El total de su compra es : " + controlador.totalCompra( comprados ) );
		
	}

}
