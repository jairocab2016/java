package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
}