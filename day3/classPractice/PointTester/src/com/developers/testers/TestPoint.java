package com.developers.testers;
import com.developers.geometry.*;
import java.util.*;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter P1 x,y : ");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.print("Enter P2 x,y : ");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("Calculating distance between them....");
		
		if(p1.isEqual(p2)) {
			System.out.println("Both the points are same");
		}
		else {
			System.out.println("Distance between "+ p1.toString()+" and "+ p2.toString()+" is : "+ p1.calculateDistance(p2));

		}
		
		sc.close();
		
	}

}
