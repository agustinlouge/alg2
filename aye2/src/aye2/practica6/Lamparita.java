package aye2.practica6;

public class Lamparita {
	enum EstadoLampara{ON, OFF};
	
	private EstadoLampara estado;
	
	public Lamparita() {
		estado = EstadoLampara.OFF;
	}
	
	public void encender() {
		estado = EstadoLampara.ON;
	}
	public void apagar() {
		estado = EstadoLampara.OFF;
	}
	public EstadoLampara getEstado() {
		return estado;
	}
}
