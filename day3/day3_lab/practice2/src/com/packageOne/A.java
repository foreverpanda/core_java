package com.packageOne;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int elements = sc.nextInt();
		int arr[] = new int[elements];
//		for(int i =0 ; i < arr.length ; i++) {
//			System.out.println("Enter element");
//			arr[i] = sc.nextInt();
//		}
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		System.out.println(java.util.Arrays(arr));

		
	}
}
