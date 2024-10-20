package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	//arraylist
	private ArrayList<ProductoElectrodomestico> listadeproductos = new ArrayList<>();
	
	public void agregarproducto(ProductoElectrodomestico producto) {
		listadeproductos.add(producto);
	}
	
	public void mostrarProductos() {
		for (ProductoElectrodomestico producto : listadeproductos) {
			producto.mostrarInformacion();
			System.out.println();
		}
	}
	
	public ProductoElectrodomestico buscarProducto(String nombre) {
		for(ProductoElectrodomestico producto : listadeproductos) { 
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto;
			}
		}
		return null;
	}
	
	public void venta(String nombreProducto, int cantidad) {
		ProductoElectrodomestico producto =buscarProducto(nombreProducto);
		if(producto != null) {
			if (producto.getCantidadD()>= cantidad) {
				producto.setCantidadD(producto.getCantidadD() - cantidad);
				System.out.println("Venta realizada: " + cantidad + " unidades de " + nombreProducto);
			}else {
				 System.out.println("Producto agotado: " + nombreProducto);
			}
		}else {
			 System.out.println("Producto no encontrado: " + nombreProducto);
		}
	}
	
}
