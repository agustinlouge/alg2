package aye2.practica7;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public abstract class Persona {
	protected String nombre;
	protected int dni;
	protected Date fechaNacimiento;
	protected Optional<Persona> pareja; 			//maybe

	public Persona() {
		nombre = "";
		fechaNacimiento = new Date();
		pareja = Optional.empty(); 				//nothing
		
		//dni inicializa en 0, si no se pusiera nombre se inicializa en null.
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean tienePareja() {
		return pareja.isPresent(); 					//isJust()
	}
	
	public boolean getPareja(Persona p) {
		if (tienePareja()) {
			p = pareja.get();
			return true;
		}else {
			return false;
		}
	}

	public abstract int getIngresos();
	
	public void leer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona");
		nombre = s.nextLine();
	}
	
	public void mostrar() {
		System.out.println(nombre);
	}
	
}
