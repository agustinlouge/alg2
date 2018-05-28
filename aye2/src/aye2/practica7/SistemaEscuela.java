package aye2.practica7;

import java.util.ArrayList;

public class SistemaEscuela {

	private final static int LONGITUD_ARREGLO = 5;

	public static void main(String[] args) {
		
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO]; 		//arreglo estatico de personas
		
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i < aPersona.length; i++) {
			System.out.println(i + ": " + aPersona[i]);
		}
		
		
		ArrayList<Persona> aPersona2 = new  ArrayList<>();  		//arreglo dinamico
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for(int i = 0; i < aPersona2.size(); i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
	
		for (Persona p : aPersona2) {
			System.out.println(p);
		}
		
		
		//Covarianza
		/*
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<Persona> per1 = new ArrayList<>();
		
		per1 = emp1;		->	No funciona porque empleado y persona son distintos tipos, por mas que empleado sea subclase de persona.
		*/
		
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<? extends Persona> per1 = new ArrayList<>();
		
		per1 = emp1; //Se puede decir que ArrayList<Empleado> es SUBTIPO de ArrayList<Persona>
	
		Empleado a = new Empleado();
		a.leer();
		a.mostrar();
	
		//RAW types
		ArrayList listaRaw = new ArrayList();
		listaRaw.add(new Integer(10));
		listaRaw.add(new String("asdas"));
		for (Object x: listaRaw) {
			System.out.println(x);
		}
	
	
	}

}
