package aye2.practica7;

public class Alumno extends Persona {

	private int mensualidad;
	
	@Override
	public int getIngresos() {
		return mensualidad;
	}
}
