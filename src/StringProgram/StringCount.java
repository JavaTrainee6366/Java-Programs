package StringProgram;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		int vowels=0,space=0,digit=0,cons=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your string");
		String s1=s.nextLine().toLowerCase();
		int length =s1.length();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='i'||s1.charAt(i)=='e'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				++vowels;
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				++cons;
			}
			else if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				++digit;
			}
			else if(s1.charAt(i)==' ')
			{
				++space;
			}
		}
		System.out.println("Vowels are"+vowels);
		System.out.println("cons are"+cons);
		System.out.println("digits are"+digit);
		System.out.println("space are"+space);

	}
}