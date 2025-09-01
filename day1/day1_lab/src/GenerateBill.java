// Write Java program - 
// Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 0 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
// When user enters 'Generate Bill' option(0) , display total bill & exit.

import java.util.Scanner;

class GenerateBill{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int totalBill = 0;
		boolean selectMore = true;
		int choice = 0;
		while(selectMore){
			System.out.printf("Menu\n1. Dosa : $20		2. Samosa : $40\n3. Idli : $80		4. Water : $100\n5. Exit\n");
			choice = sc.nextInt();
			switch (choice){
			case 1: System.out.println("Added Dosa");
					totalBill+=20;break;
			case 2: System.out.println("Added Samosa");
					totalBill+=40; break;
			case 3: System.out.println("Added Idli");
					totalBill+=80; break;
			case 4: System.out.println("Added Water");
					totalBill+=100; break;
			case 5: selectMore = false; break;
			default : System.out.println("Invalid Choice"); break;
			}
		}
			System.out.println("Total Bill : "+ totalBill);




		sc.close();
	}
}