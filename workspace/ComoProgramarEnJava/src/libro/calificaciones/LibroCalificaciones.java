package libro.calificaciones;

public class LibroCalificaciones 
{	
	private String nombreDelCurso; //variable de instancia
	
	//metodo para establecer el nombre del curso
	public void establecerNombreDelcurso(String nombre)
	{		
		nombreDelCurso = nombre;
	}
	
	//metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}
	

	public void mostrarMensaje()
	{
		System.out.printf("Bienvenido al Libro de calificaciones para %s!\n", obtenerNombreDelCurso());
	}

}
