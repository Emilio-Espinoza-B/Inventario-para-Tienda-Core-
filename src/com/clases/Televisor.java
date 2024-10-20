package com.clases;

public class Televisor extends ProductoElectrodomestico {
//atributos
	private int tamañoPantalla;
	private String resolucion;
	
	//constructor
	public Televisor(String nombre, double precio, int cantidadD, int tamañoPantalla, String resolucion) {
		super(nombre, precio, cantidadD);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}

	// getters y setters
	public int getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	//sobreescribir
	@Override
		public void mostrarInformacion() {
			// TODO Auto-generated method stub
			super.mostrarInformacion();
			System.out.print("Tamaño De Pantalla: " + tamañoPantalla);
			System.out.print(", Resolucion: " + resolucion);
		}
	
	
}
