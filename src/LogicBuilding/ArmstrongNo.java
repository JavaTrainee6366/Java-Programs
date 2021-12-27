package LogicBuilding;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int n,sum=0,rem=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp/=10;
		}
		if(sum==n)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
			System.out.println("number is not armstrong");
			System.out.println("number is not armstrong");
		}
		

	}

	}
