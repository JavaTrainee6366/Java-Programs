package StringProgram;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s2="";
		System.out.println("enter your string");
		String s1=s.nextLine();
for(int i=s1.length()-1;i>=0;i--)
 s2=s2+s1.charAt(i);
{
	if(s1.equals(s2))
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("string is not palindrome");
	}
}

	}

}
