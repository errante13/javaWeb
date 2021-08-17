package com.mascotas.modelos;

public class Perro extends animal implements Mascota {


		public Perro() {
		super();
		// TODO Auto-generated constructor stub
		}

		public Perro(String nombre, String raza, int peso) {
		super(nombre, raza, peso);
		// TODO Auto-generated constructor stub
		}

		
	public String afecction() {
		if(getPeso()<=50) {
		return " hola soy "+this.getNombre()+" soy un "+this.getRaza()+ " y peso "+this.getPeso()+" kilos";
		}else {
			
			return "soy  "+this.getNombre()+" y estoy gordito";
		}
		
		
	}

	
	
	
	
}
