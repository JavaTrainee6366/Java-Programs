package StringProgram;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		int i,j;
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first string:");
		String s1=s.nextLine().toLowerCase();
		System.out.println("enter second string");
		String s2=s.nextLine().toLowerCase();
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					flag=true;
					break;
				}
				else
				flag=false;
				}
				if(flag==false)
					break;
				}
			if(flag==true)
			System.out.println("string is anagram");
			else
				System.out.println("string is not anagram");
		}
			}
