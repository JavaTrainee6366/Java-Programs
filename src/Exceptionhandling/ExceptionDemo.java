package Exceptionhandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int a = 10;
		
		try{
			System.out.println("Hello");
			int res = a/0;
			System.out.println(res);
			System.out.println("Hie");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("You have Entered something wrong!! Try Again with any other number than zero");
		}  catch (Throwable e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("Hieeeee");
		}
		System.out.println("java");
		
		
		
	}

}
