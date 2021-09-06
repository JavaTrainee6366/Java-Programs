package StringProgram;

import java.util.Scanner;

public class StringSubstring {

	public static void main(String[] args) {
		int count=0,j=0;
		Scanner scn=new Scanner(System.in);
		String s="city chandhigarh is is is";
		System.out.println("enter word to be found");
		String s1=scn.nextLine();
		String s3="";
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '||i==s.length()-1)
			{
				if(i==s.length()-1)
				{
					s3=s.substring(j,i+1);
				}
				else
				{
					s3=s.substring(j,i);
			     }
		if(s3.equals(s1))
		{
			count++;
		}
         j=i+1;
	}
}
         if(count>0)
               {
	             System.out.println("word found"+" "+count+"times");
                }
}
}