package Exceptionhandling;

import java.io.IOException;

public class CustomException extends IOException{
	
	
	public CustomException(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		System.out.println(name);
	}
	
	public void show() {
		
	}

}
