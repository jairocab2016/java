package com.jairo.vehiculo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Tipo de dato nombreobjt
		
		Vehiculo miVehiculo = new Vehiculo("AAA123", "Hiundai");
		/*
		miVehiculo.arrancar();
		miVehiculo.frenar();
		miVehiculo.reverza();
		miVehiculo.arrancar();
		*/
		
//		ArrayList<Integer> miLista = new ArrayList<Integer>();
//		miLista.add(1);
//		miLista.add(2);
//		miLista.add(3);
//		
//		for(Integer i: miLista)
//		{
//			System.out.println(i);
//		}		
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();	
		vehiculos.add(miVehiculo);
		vehiculos.add(new Vehiculo("BBB123", "Chevrolet"));
		vehiculos.add(new Vehiculo("CCC123", "Mercedez Benz", "s10", 2014));
		
		for (Vehiculo vehiculo : vehiculos) {
			
			System.out.println(vehiculo.getMatricula());
			System.out.println(vehiculo.getMarca());
			System.out.println(vehiculo.getModelo());
			System.out.println(vehiculo.getAnio());
			
			System.out.println("------------------");
			
		}
		
//		Taxi taxi = new Taxi("AAA123", "Hiundai", "i10",1990);
//		taxi.setAnio(2000);
//		
//		TaxiCRUD taxiCRUD = new TaxiCRUD();
//		taxiCRUD.agregar(taxi);
//		

	}

}
