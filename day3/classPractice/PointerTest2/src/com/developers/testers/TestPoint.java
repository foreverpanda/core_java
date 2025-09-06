package com.developers.testers;

import com.developers.geometry.*;
import java.util.*;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many points to plot ? ");
		int pointsToPlot = sc.nextInt();
		Point2D[] points = new Point2D[pointsToPlot];
		int counter = 0;
		boolean exitLoop = false;
		while (!exitLoop) {
			System.out.println("\nPlotter---\n1. Plot a point\n2. Display plotted Points\n0. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
				
				if(counter < pointsToPlot) {
					System.out.println("Where do you want to Plot [Index] :");
					int plottingPoint = sc.nextInt();
					if(plottingPoint < pointsToPlot) {
						if (points[plottingPoint] == null ) {
								System.out.println("Plotting at index : "+(plottingPoint));					
								System.out.print("Enter Coordinates X,Y : ");
								Point2D plot = new Point2D(sc.nextInt(), sc.nextInt(), plottingPoint);
								System.out.println(plot.toString());
								points[plottingPoint] = plot;
								counter++;
						}	
						else {
							System.out.println("Point is already Plotted ");
						}
					}
					else {
						System.out.println("Please enter a valid range");
					}
				}
				else {
					System.out.println("Array is FULL !!!");
				}
				break;
				
			case 2:{
				if(counter == 0) System.out.println("\nNO POINT FOUND");
				else
				for(Point2D p: points) {
					
				
					if(p!= null) {
						System.out.println(p.toString());
					}
				}break;
			}
			case 3: exitLoop = true;
				
			
					
			
					
					

			}
		}

		sc.close();

	}

}
