import java.util.Scanner;
class TellSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while(!exit){
			System.out.print("Enter month number : ");
			int num1 = sc.nextInt();
			switch (num1){
			case 12:
			case 11:
			case 1:
			case 2: System.out.println("Winter");
				break;
			case 3:
			case 4:
			case 5:
			case 6: System.out.println("Summer");
				break;
			case 7:
			case 8:
			case 9:
			case 10: System.out.println("Monsoon");
				break;
			default: System.out.println("Invalid input !!!!");
				exit = true;
				break;
			}
		}
		

		sc.close();
	}
}