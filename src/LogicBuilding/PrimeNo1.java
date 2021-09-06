package LogicBuilding;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int x =s.nextInt();
		boolean flag=true;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}
