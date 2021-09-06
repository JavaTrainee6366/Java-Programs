package Exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample {

	
	void m(int no) throws IOException {
		
	System.out.println("My Exception");
		
	}
	
	void n() throws IOException 
	{
		m(10);
		
	}
	
	void g() throws IOException 
	{
	n();
	}
	public static void main(String[] args) throws IOException 
	{
		ThrowsExample obj = new ThrowsExample();
		
		
		obj.g();
	}
}












