package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modelo.Empleado;

public class Pantalla {
	
	public String ingresarValor(String titulo)
	{
		JFrame frame = new JFrame();
		String valorIngresado = JOptionPane.showInputDialog(frame, titulo);
		return valorIngresado;
	};
	
	public void mostrarMensaje(String mensaje)
	{
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, mensaje);
	}
	
	public void datosObjeto(Empleado e)
	{	try 
		{
			mostrarMensaje("Nombre: " + e.getNombre() + "\nApellido: " + e.getApellido() + "\nDni: " + e.getDni() + "\nSueldo: " + e.getSueldo());
		
		} 
		catch (NullPointerException e2) 
		{
			mostrarMensaje("La persona buscada no encuentra en nuestra DB");
		}
		
	}
}
