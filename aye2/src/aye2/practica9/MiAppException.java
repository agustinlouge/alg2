package aye2.practica9;

public class MiAppException extends Exception {

	public MiAppException(String msg, Throwable e) {
		super("MiAppException: " + msg, e);
	}
}
