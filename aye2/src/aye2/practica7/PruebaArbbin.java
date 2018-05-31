package aye2.practica7;

import java.util.List;

public class PruebaArbbin {

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<>(10);
		arbol.insertar(4);
		arbol.insertar(8);
		arbol.insertar(15);
		arbol.insertar(11);
		arbol.insertar(1);
		arbol.insertar(3);
		arbol.insertar(9);
		arbol.insertar(10);
		
		List<Object> lista = arbol.inOrder();
		
		System.out.println("Listado inOrder:");
		for(Object x: lista) {
			if (x instanceof Integer) {
				
				//DownCasting de Object a Integer.
				x = (Integer) x + 10;
				
				/* Mediante binding dinamico se llama a toString de Integer porque dentro de x hay una instancia de objeto
				  de tipo Integer */
				System.out.println((Integer) x);
			}
		}
		
		System.out.println("Altura : " + arbol.altura());
	}

}
