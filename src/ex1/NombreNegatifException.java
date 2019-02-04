package ex1;
import java.io.*;

public class NombreNegatifException extends Exception {
	private double num;
	public NombreNegatifException(double number) {
		this.num=number;
	}
	public String getMessage(){
		return num + " est n¨¦gatif!";
		
	}

}
