package com.clases;

public class ProductoElectrodomestico {
	//atributos
	private String nombre;
	private double precio;
	private int cantidadD;
	
	//constructor
	public ProductoElectrodomestico(String nombre, double precio, int cantidadD) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadD = cantidadD;
	}

	//getters y setters
	public ProductoElectrodomestico(String nombre, double precio) {
		this(nombre, precio, 0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadD() {
		return cantidadD;
	}

	public void setCantidadD(int cantidadD) {
		this.cantidadD = cantidadD;
	}
	
	//mostrar info
	public void mostrarInformacion() {
	System.out.println("Nombre: " + nombre);
	System.out.println("precio: $" + precio);
	System.out.println("Cantidad Disponible: " + cantidadD);
	}
}
