package com.jairo.vehiculo;

public class Vehiculo {
	
	//ATRIBUTOS
	private String matricula;
	private String marca;
	private String modelo;
	private int    anio;
	
	
	//METODOS - Lower Camel Case
	public Vehiculo(String matricula, String marca) {
		super();
		setMatricula(matricula);
		this.marca = marca;
	}		
	
	public Vehiculo(String matricula, String marca, String modelo, int anio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.length() == 6) {
			this.matricula = matricula;
		} else {
			System.out.println("La matricula debe ser de 6 caracteres");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void arrancar(){
		System.out.println("El vehiculo arranco");
	}
	
	public void frenar(){
		System.out.println("El vehiculo frenó");
	}
	
	public void reverza(){
		System.out.println("El vehiculo esta de reversa");
	}

}
