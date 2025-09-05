package com.packageOne;
import java.util.*;
public class PrimiteToString {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("Array class");
		System.out.println(Arrays.toString(arr));
	}
}
