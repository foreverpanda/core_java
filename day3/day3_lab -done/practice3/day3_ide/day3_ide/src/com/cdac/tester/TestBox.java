package com.cdac.tester;
import java.util.Arrays;
import java.util.Scanner;
import com.cdac.core.Box;
class TestBox
{
  public static void main(String[] args) {
  //create scanner class instance to wrap console i/public
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter side of a cube");
  Box cube=new Box(sc.nextDouble());
  
  Box [] arrBox = new Box[10];
  arrBox[0] = new Box(-1);
   
  System.out.println(cube.getBoxDimensions());
  System.out.println(cube.getVolume());
  //to test ctor chaining - create dummy box , where all dims are inited to -1
  Box dummyBox=new Box();
  System.out.println(dummyBox.getBoxDimensions());
  System.out.println((arrBox.getClass()));
  
  sc.close();
  }
}