package aye2.practica9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {

	private static final int SIZE_ARREGLO = 10;
	private static Integer[] arregloInt;
	
	public static void ingresarDatoArray(int indice) {
		try{
			arregloInt[indice] = 15;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El indice esta fuera de rango.");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			for (StackTraceElement elemento : e.getStackTrace()) {
				System.out.println("Archivo: " + elemento.getFileName());
				System.out.println("Linea de error: " + elemento.getLineNumber());
				System.out.println("Clase: " + elemento.getClassName());
			}
		}
	}
	
	public static void ingresarDatoArray2(int indice) throws MiAppException {
		
		try {
			arregloInt[indice] = 15;
		} catch(ArrayIndexOutOfBoundsException e) {
			throw new MiAppException("Nueva excepcion por indice fuera de rango", e);
		}
	}
	
	
	public static int leerIndice() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el indice: ");
		
		int indice = 0;
		
		boolean ingresoOk = false;
		
		while (!ingresoOk) {
			try {
				indice = teclado.nextInt();
				ingresoOk = true;
			} catch(InputMismatchException e) {
				System.out.println("Error en ingreso numerico. Intente de nuevo");
				teclado.next();
			} 
		}
		
		teclado.close();
		
		return indice;
	}
	
	public static void main(String[] args) {
		
		arregloInt = new Integer[SIZE_ARREGLO];
		
		int indice = leerIndice();
		//ingresarDatoArray(indice);
		
		try {
			ingresarDatoArray2(indice);
		} catch(MiAppException e) {
			System.out.println(e);
		}
		
		System.out.println("Termina OK");
		
	}

}
