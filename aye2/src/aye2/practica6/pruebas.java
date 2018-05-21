package aye2.practica6;

public class pruebas {

	public static void main(String[] args) {
		
		Lamparita lamp1 = new Lamparita();
		System.out.println("Estado: " + lamp1.getEstado());
		
		lamp1.encender();
		System.out.println("Estado: " + lamp1.getEstado());
		
	}

}
