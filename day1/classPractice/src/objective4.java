import java.util.Scanner;
class DivideUserInpu{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		double num1 = sc.nextInt();
		System.out.print("Enter num2 : ");

		double num2 = sc.nextInt();
		System.out.println("Result : " + (num1/num2));
	}
}