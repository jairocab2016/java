package controlador;

import modelo.Empleado;

public class Logica {

	public Empleado buscarPorNombre(String nombre)
	{
		Empleado objeto = new Empleado();
		objeto.crearDBEmpleados();
		Empleado[] todosLosEmpleados = objeto.getEmpleados();
		Empleado encontrado = null;
		
		for (int i = 0; i < todosLosEmpleados.length; i++) {
			
			if (nombre.equalsIgnoreCase(todosLosEmpleados[i].getNombre())) {
				encontrado = todosLosEmpleados[i];
			}
		}
		
		return encontrado;
	}
	
	public Empleado[] todos()
	{
		Empleado objeto = new Empleado();
		objeto.crearDBEmpleados();
		return objeto.getEmpleados();
	}
	

}
