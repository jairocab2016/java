package com.jairo.conductor;

import com.jairo.vehiculo.Taxi;

public class ConductorTaxi extends Conductor {
	
	public ConductorTaxi(String nombre, String tipoLicencia, Taxi taxi) {
		super(nombre, tipoLicencia);
		this.taxi = taxi;
	}

	private Taxi taxi;

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getTaxi().getMatricula());
	}

}
