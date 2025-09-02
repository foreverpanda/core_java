import java.util.Scanner;
class TestPoint{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Coordinates for P1 : ");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println(p1.show());
		System.out.println("Enter Coordinates for P2 : ");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println(p2.show());

		if(p1.isEqual(p2)){
			System.out.println("Equal Coordinates");
		}else{
			System.out.println("Not Equal Coordinates");
			System.out.printf("Distance between them : %f", p1.calculateDistance(p2));

		}

	}
}