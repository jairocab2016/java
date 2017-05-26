package estudiante;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TestAlumno {
	
	public static void main(String[] args) {
		
		Estudiante [] estudiantes = new Estudiante [3];
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i < estudiantes.length; i++) {
			
			System.out.println("---<>---");
			
			System.out.println("Ingresa el nombre del estudiante " + i);
			String nombre = lector.nextLine();
			
			System.out.println("Ingresa el apellido el estudiante " + i);
			String apellido = lector.nextLine();
			
			System.out.println("Ingresa la edad del estudiante " + i);
			int edad = lector.nextInt();
			
			System.out.println();
			
			estudiantes[ i ] = new Estudiante(nombre, apellido, edad);
			lector = new Scanner(System.in);
			
		}
		
		for (int i = 0; i < estudiantes.length; i++) {
			
			System.out.printf("Ingresa la nota de %s ", estudiantes[i].getNombre());
			float nota = lector.nextFloat();
			
			estudiantes [ i ].setNota(nota);
		}

		Arrays.sort(estudiantes);
		
		Estudiante.mostrarObjetoEnArreglo(estudiantes);
		
	}

}