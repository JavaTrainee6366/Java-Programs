package Algos;

import java.util.Scanner;

public class ArrayElementInsertion {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int arr[] =new int[6];
		System.out.println("Enter 5 elements");
		for (int i = 0;i<arr.length-1; i++) {
			arr[i] = sn.nextInt();
		}
		System.out.println("Enter position of element:: ");
		int pos = sn.nextInt();
		System.out.println("Enter element:: ");
		int x = sn.nextInt();
		
		for(int i = arr.length-1; i>=pos; i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=x;
		for (int i = 0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
