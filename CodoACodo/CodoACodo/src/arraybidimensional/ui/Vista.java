package arraybidimensional.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Vista {
	
	public String ingresaValor() 
	{
		JFrame frame = new JFrame("Buscar alumno");
		String ingresado = JOptionPane.showInputDialog(frame, "Buscar alumno","");
		return ingresado;
	}

	public void mostrarMensaje(String mensaje)
	{
		JFrame frame = new JFrame("Alumno");
		JOptionPane.showMessageDialog(frame, mensaje + " se encuentra registrada");
	}
}