package StringProgram;

import java.util.Scanner;

public class StringContain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your string");
		String s1=s.nextLine().toLowerCase();
		System.out.println("enter your string");
		String s2=s.nextLine().toLowerCase();
		if(s1.contains(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
