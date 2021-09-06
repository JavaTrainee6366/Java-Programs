package Inheritance;

public class PolyB extends PolyA{

	public void display(long number) {
		System.out.println("my Contact number is "+number);
		super.display(234561234);
	}
}
