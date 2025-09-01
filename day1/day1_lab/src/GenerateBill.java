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
		int qty = 0;
		while(selectMore){
			System.out.printf("Menu\n1. Dosa : $20		2. Samosa : $40\n3. Idli : $80		4. Water : $100\n5. Exit\n");
			choice = sc.nextInt();
			qty = 0;
			switch (choice){
			case 1: 
					System.out.print("Enter Quantity Dosa : ");
					qty = sc.nextInt();
					qty = qty*20;
					System.out.println("Added Dosa");
					totalBill+=qty;
					System.out.println("Amount of Dosa : "+ qty);
					break;
			case 2: 
					System.out.print("Enter Quantity Samosa : ");
					qty = sc.nextInt();
					qty = qty*40;
					System.out.println("Added Samosa");
					System.out.println("Amount of Samosa : "+ qty);
					totalBill+=qty; break;

			case 3: 
					System.out.print("Enter Quantity Idli : ");
					qty = sc.nextInt();
					qty = qty*80;
					System.out.println("Added Idli");
					System.out.println("Amount of Idli : "+ qty);

					totalBill+=qty; break;

			case 4: 
					System.out.print("Enter Quantity Water : ");
					qty = sc.nextInt();
					qty = qty*100;
					System.out.println("Added Water");
					System.out.println("Amount of Water : "+ qty);

					totalBill+=qty; break;

			case 5: selectMore = false; break;
			default : System.out.println("Invalid Choice"); break;
			}
		}
			System.out.println("Total Bill : "+ totalBill);




		sc.close();
	}
}