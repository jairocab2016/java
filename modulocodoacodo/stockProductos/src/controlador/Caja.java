package controlador;

import modelo.Productos;
import modelo.StockProductos;
import utils.Calculadora;

public class Caja {
	
	Productos[] productosComprados;
	int cantidadProductosComprados = 0;
	
	public Productos buscarProductoPorNombre( String nombre ){
		
		Productos productoEncontrado = null;
		StockProductos stock = new StockProductos();
		
		for (int i = 0; i < stock.getProductos().length; i++) {
			
			if ( nombre.equalsIgnoreCase( stock.getProductos()[ i ].getNombre() ) ) {
				productoEncontrado = stock.getProductos()[ i ];
			}
		}
		
		return productoEncontrado;
	}
	
	public double totalCompra( Productos[] comprados ){
		
		double total = 0;
		double[] auxiliar = new double[ comprados.length ];
		
		for (int i = 0; i < comprados.length; i++) {
			
			if (comprados[ i ] != null) {
				auxiliar[ i ] = comprados[ i ].getPrecio();
			}
			
		}
		
		total = Calculadora.suma( auxiliar );
		
		return total; 
	}
	
	public void registrarCompra( int posicion, String nombreProducto ){
		
		Productos producto = buscarProductoPorNombre(nombreProducto);
		
		if ( producto != null ) {
			productosComprados[ posicion ] = producto;
		} else {
			
		}
		
	}

	public int getCantidadProductosComprados() {
		return cantidadProductosComprados;
	}

	public void setCantidadProductosComprados(int cantidadProductosComprados) {
		this.cantidadProductosComprados = cantidadProductosComprados;
	}
	
	

}
