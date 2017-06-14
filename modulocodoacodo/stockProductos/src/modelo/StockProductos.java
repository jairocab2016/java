package modelo;

public class StockProductos {
	
	Productos[] productos = new Productos[5];
	
	public StockProductos() {
		
		llenarProductos();
		
	}
	
	public void llenarProductos(){
		
		Productos arroz = new Productos();
		
		arroz.setNombre("Santa Ana");
		arroz.setPrecio(15.6);
		productos[ 0 ] = arroz;
		
		Productos spaghetti = new Productos();
		spaghetti.setNombre( "Don Vicente" );
		spaghetti.setPrecio( 7.8 );
		productos[ 1 ] = spaghetti;
		
		Productos quesorallado = new Productos();
		quesorallado.setNombre( "Queso Dia" );
		quesorallado.setPrecio( 6.2 );
		productos[ 2 ] = quesorallado;
		
		Productos vino = new Productos();
		vino.setNombre( "Navarro Correas" );
		vino.setPrecio( 120.4 );
		productos[ 3 ] = vino;
		
		Productos cola = new Productos();
		cola.setNombre("Baires Cola");
		cola.setPrecio( 22.4 );
		productos[ 4 ] = cola;
		
	}
	
	public Productos[] getProductos(){
		return productos;
	}

}