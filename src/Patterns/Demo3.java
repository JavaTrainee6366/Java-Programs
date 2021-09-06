package Patterns;

import PackagesDemo.Demo1;

public class Demo3 extends Demo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Len : "+args.length);
		for(String s : args)
		System.out.println(s);
	
		Demo1 obj = new Demo1();
		Demo3 obj1 = new Demo3();
		obj.show3();
		obj1.show4();
		/*obj.show4();
		obj.show2();
		obj.show1();*/
		

	}

}
