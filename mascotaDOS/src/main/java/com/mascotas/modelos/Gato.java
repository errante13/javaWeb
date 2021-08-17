package com.mascotas.modelos;

public class Gato extends animal implements Mascota {


	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, String raza, int peso) {
		super(nombre, raza, peso);
		// TODO Auto-generated constructor stub
	}

	public String afecction() {
	
		return "hola soy un gato, mi nombre es: "+this.getNombre()+" y peso "+this.getPeso()+" kilos, mi raza es: "+this.getRaza();
	
	}
	
	
}
