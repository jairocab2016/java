package arraybidimensional.ui;

public class NotasAlumnos 
{
	public static void main(String[] args) 
	{
		int nAlumnos = 4, nEvaluaciones = 4;
		int[][] notas;
		String[] nombreAlumnos = { "Pedro", "Maria", "Juana", "Carlos" };

		BidimensionalHelper helper = new BidimensionalHelper();
		notas = helper.llenarArreglo(nAlumnos, nEvaluaciones);
		helper.mostrarNotasAlumnos(nombreAlumnos, notas, nAlumnos, nEvaluaciones);
		int Alumno = helper.buscarAlumnoPorNombre(nombreAlumnos, "Jduana");
//		System.out.println(Alumno);

		Vista view = new Vista();
		String buscarNombre = view.ingresaValor();

		int posicionAlumno = helper.buscarAlumnoPorNombre(nombreAlumnos, buscarNombre);

		if (posicionAlumno == 0 && !buscarNombre.equalsIgnoreCase(nombreAlumnos[0])) 
		{
			view.mostrarMensaje("Disculpe el alumno no se encuentra en nuestra base de datos");
		} 
		else
		{
			view.mostrarMensaje(nombreAlumnos[posicionAlumno]);
		}
	}
}
