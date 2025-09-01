import java.util.Scanner;
class CompareUserInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		if(num1 < num2){
			System.out.println(num1 + "<" + num2);
		}
		else if(num1 == num2){
			System.out.println(num1 + "==" + num2);
		}
		else{
			System.out.println(num1 + ">" + num2);
		}
		sc.close();
	}
}