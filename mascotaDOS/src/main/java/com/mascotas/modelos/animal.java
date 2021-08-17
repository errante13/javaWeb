package com.mascotas.modelos;

public class animal {

	private String nombre; 
	private String raza; 
	private int peso;
	
	
	public animal(String nombre, String raza, int peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
	} 
	
	public animal() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	} 
	
	
	
	
}

