package StringProgram;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your String");
		String s1=s.nextLine().toLowerCase();
		String s2=(s1.replace("[aeiou]"," "));
		System.out.println("new string is"+s2);

	}

}
