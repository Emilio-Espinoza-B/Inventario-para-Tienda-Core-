package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	//atributos
	private String marca;
	private int ram;
	private String Nserie;
	
	//constructor
	public ComputadoraPortatil(String nombre, double precio, int cantidadD, String marca, int ram, String nserie) {
		super(nombre, precio, cantidadD);
		this.marca = marca;
		this.ram = ram;
		Nserie = nserie;
	}
	
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.print("Marca: " + marca);
		System.out.print(", Memoria RAM: " + ram);
		System.out.print(", Numero Serie: " + Nserie);
	}
}
