// Write Java program for the following - 
// It should  run till user enters any other option than add or sub or multiply or divide
// Prompt user to enter the input operation : (add|subtract|multiply|divide) & 2 numbers(double)
// Display the result of the operation.
// Use Scanner for accepting all inputs from user. 

import java.util.Scanner;

class Calculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int totalBill = 0;
		boolean selectMore = true;
		String choice ;
		double num1=0,num2=0;
		while(selectMore){
			System.out.printf("		Calculator\n1. Add\n2.Sub\n3. Multiply\n4. Divide\n5. Remainder\n6. Exit\n");
			choice = sc.next();

			if(choice.equals("6") || choice.equals("Exit") || choice.equalsIgnoreCase("exit")){
				System.out.println("		Exiting!!!");
				sc.close();
				System.exit(0);
			}
			System.out.print("Enter Number1 : ");
			num1 = sc.nextInt();
			System.out.print("Enter Number2 : ");
			num2 = sc.nextInt();

			switch (choice){
			case "1":
			case "Add":
			case "add": System.out.println("	Addition : "+ (num1+num2));
					break;
			case "2":
			case "Sub":
			case "sub": System.out.println("	Subtraction : "+(num1-num2));
					 break;
			case "3":
			case "Multiply":
			case "multiply":System.out.println("	Multiplication : "+(num1*num2));
					 break;
			case "4":
			case "Divide":
			case "divide":System.out.println("	Division : "+(num1/num2));
					 break;
			case "5":
			case "Remainder":
			case "remainder":System.out.println("	Remainder : "+(num1%num2));
					 break;

			case "6":
			case "Exit":
			case "exit": System.out.println("	Exiting");
				selectMore = false;
				break;
			default : System.out.println("	Invalid Choice"); break;
			}
		}




		sc.close();
	}
}