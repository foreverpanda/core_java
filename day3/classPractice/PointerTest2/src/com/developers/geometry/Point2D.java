package com.developers.geometry;
import java.lang.Math;
public class Point2D {
	private int x;
	private int y;
	private int plottedAt;
	public Point2D(int x, int y, int plottedAt){
//		System.out.println("Point : "+x+", "+y+ "Plotted at : "+plottedAt);
		this.x = x;
		this.y = y;
		this.plottedAt = plottedAt;
	}
	@Override
	public String toString() {
		return "Points ( "+x+", "+y+" ) at : "+plottedAt;
	}
	
	public double calculateDistance(Point2D p2) {
		double distX = x - p2.x;
		double distY = y - p2.y;
		distX = Math.pow(distX,2);
		distY = Math.pow(distY, 2);
		double result = distX +distY; 
		 result = Math.sqrt(result);
		 
		 return result;
	}
	
	public boolean isEqual(Point2D p2) {
		
		return (x == p2.x) && (y == p2.y);
		
	}
}
