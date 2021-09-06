package ControlStatements;

public class NumberCompare {
	
	public static void main(String[] args) {
		
		int a =20,b=50,c=70;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greatest");
			}else {
				System.out.println("c is greatest");
			}
			
		}else {
			if(b>c) {
				System.out.println("b is greatest");
			}else {
				System.out.println("c is greatest");
			}
		}
		
		
			
	}

}
