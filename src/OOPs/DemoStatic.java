package OOPs;

import static OOPs.dEMOmETHODS.*;
import java.util.Scanner;
import static java.lang.Math.*;
public class DemoStatic {
	
	int a = 199;
final static int x;
static Scanner sn;
	static{
		
		sn = new Scanner(System.in);
		System.out.println("Enter Your Constant");
		x = sn.nextInt();
		
		System.out.println("hello static block");
	}
	void show()
	{	
		//x = 100;
		System.out.println("a = "+a);
		System.out.println("x = "+x);
		//DemoStaticImport.test();
	}

	public void show1()
	{
		show();
		System.out.println("a = "+a);
		//System.out.println("x = "+x);
	}
	public static void display()
	{
		DemoStatic obj = new DemoStatic();
		obj.show1();
		
	//	double x1 = sqrt(x);
		//System.out.println("a = "+a);
	//	System.out.println("x = "+x1);
	}
	
	public static void main(String[] args) {
		
		DemoStatic obj = new DemoStatic();
		display();
		test();
		/*obj.show();
		display();
		*/
	}

}


