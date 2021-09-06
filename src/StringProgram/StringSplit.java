package StringProgram;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your string");
		String s1=s.nextLine().toLowerCase();
		System.out.println("enter your string to be found");
		String s2=s.nextLine().toLowerCase();
		String s3[]=s1.split(" ");
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i].equals(s2))
			{
				System.out.println("true");
				break;
			}
		}

	}

}
