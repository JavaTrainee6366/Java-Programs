package Algos;

import java.util.Scanner;

public class ArrayDeleteElement {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int arr[] =new int[5];
		System.out.println("Enter 5 elements");
		for (int i = 0;i<arr.length; i++) {
			arr[i] = sn.nextInt();
		}
		System.out.println("Enter element which you want to delete:: ");
		int x = sn.nextInt();
		int  pos=0;
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==x) {
				pos = i;
				int temp = arr[i];
				break;
			}
		}
		
		for(int i = pos; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		for(int i = 0; i<arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
