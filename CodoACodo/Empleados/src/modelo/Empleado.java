package modelo;

public class Empleado extends Persona {
	
	int dni;
	double sueldo;
	Empleado[] empleados = new Empleado[5];
	
	public Empleado(){}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}
	
	public void crearDBEmpleados()
	{
		Empleado harold = new Empleado();
		harold.setNombre("harold");
		harold.setApellido("diaz");
		harold.setDni(2323123);
		harold.setSueldo(50.000);
		empleados[0] = harold;
		
		Empleado oscar = new Empleado();
		oscar.setNombre("oscar");
		oscar.setApellido("rodriguez");
		oscar.setDni(56345);
		oscar.setSueldo(20.000);
		empleados[1] = oscar;
		
		Empleado raul = new Empleado();
		raul.setNombre("raul");
		raul.setApellido("flores");
		raul.setDni(23525);
		raul.setSueldo(30.000);
		empleados[2] = raul;
		
		Empleado suzane = new Empleado();
		suzane.setNombre("suzane");
		suzane.setApellido("medina");
		suzane.setDni(764532);
		suzane.setSueldo(51.000);
		empleados[3] = suzane;
		
		Empleado matias = new Empleado();
		matias.setNombre("matias");
		matias.setApellido("galindez");
		matias.setDni(98123);
		matias.setSueldo(28.000);
		empleados[4] = matias;
		
	}
}
