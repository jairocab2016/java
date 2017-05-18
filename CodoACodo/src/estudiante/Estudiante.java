package estudiante;

public class Estudiante implements Comparable<Estudiante>{

	private String nombre;
	private String apellido;
	private int edad;
	private float nota;
	
	public Estudiante(String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public static void mostrarObjetoEnArreglo (Estudiante [] arreglo) {
		

		for (Estudiante estudiante : arreglo) {
			
			System.out.println("----------------");
			System.out.println("Nombre: " + estudiante.getNombre());
			System.out.println("Apellido: " + estudiante.getApellido());
			System.out.println("Edad: " + estudiante.getEdad());
			System.out.println("Nota: " + estudiante.getNota());
		}
				
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		if (edad < o.edad) {
			return -1;			
		}
		if (edad < o.edad) {
			return 1;	
		}
		return 0;
	}
	
}