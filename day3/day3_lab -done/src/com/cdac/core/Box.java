package com.cdac.core;
public class Box{
	private double height;
	private double widht;
	private double depth;

	public Box(int height,int width, int depth)
	{
		this.depth = depth;
		this.widht = widht;
		this.height = height;
	}
	public Box(){
		this(-1,-1,-1);
	}
	public Box(int side){
		this(side,side,side);
	}
	public void getData(int height,int width, int depth){
		this.depth = depth;
		System.out.println("Entered Depth : "+ this.depth);
		this.widht = width;
		System.out.println("Entered Depth : "+ this.widht);

		this.height = height;
		System.out.println("Entered Depth : "+ this.height);

	}
	public String displayVolume(){
		System.out.println(height*widht*widht);

		return " "+ height*widht*depth;
	}
}