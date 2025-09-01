// Accept 5 doubles from user (scanner)
// Print it's average.

import java.util.Scanner;
class Averages{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers ");
		double num1=0,num2=0,num3=0,num4=0,num5=0;
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		num5 = sc.nextDouble();
		double result = (num1+num2+num3+num4+num5)/5.0f;
		System.out.println("Average : "+ result);
		sc.close();
	}
}