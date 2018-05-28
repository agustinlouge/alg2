package aye2.practica7;

public class Empleado extends Persona {

	private int legajo;
	private int salario;
	
	@Override
	public int getIngresos() {
		return salario;
	}
	
}
