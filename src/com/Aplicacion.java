package com;

import com.clases.*;

public class Aplicacion {

	public static void main(String[] args) {
		TiendaElectronica tienda = new TiendaElectronica();
		
		//productos
		Televisor tv = new Televisor("Samsung", 800, 3, 50, "4k");
		ComputadoraPortatil laptop = new ComputadoraPortatil("Accer Nittro", 500, 10, "Accer", 16, "jhkdfgniusjn");
		
		tienda.agregarproducto(tv);
		tienda.agregarproducto(laptop);
		
		//ventas
		tienda.venta("Accer Nittro", 4);
		tienda.venta("Samsung", 2);
		tienda.venta("Accer Nittro", 2);
		tienda.venta("Samsung", 3);
		System.out.println();
		
		//inventario
		tienda.mostrarProductos();
	}
}
