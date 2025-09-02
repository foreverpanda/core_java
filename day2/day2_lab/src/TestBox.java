import java.util.Scanner;

class TestBox{
	public static void main(String args[]){

		Box b1 = new Box(1,2,3);
		Box b2 = new Box(1,2,3);
		System.out.println(b1.getVolume());
		System.out.println(b1.isEqual(b2));
		System.out.println(b1.showDimensions());

		Box b3 =  new Box(3,4,5);
		Box b4 = new Box(3,5,4);

		System.out.println(b3.showDimensions());
		System.out.println(b4.showDimensions());

		System.out.println(b4.isEqual(b3));

		System.out.println(b3.showDimensions());
		System.out.println(b4.showDimensions());	

		
	}
}