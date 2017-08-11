import javax.swing.*;

public class SwingJFrame extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SwingJFrame()
    {
        setLayout(null);
    }

    public static void main(String[] ar) 
    {
    	SwingJFrame formulario1 = new SwingJFrame();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
    }
}