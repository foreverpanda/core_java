package com.cdac.tester;
import java.util.Scanner;
import com.cdac.core.*;
class TestBox{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(2,2,2);

		Box b3 = new Box();
		b3.getData(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(b3.displayVolume());
	}
}