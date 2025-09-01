import java.util.Scanner;
class Pattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows ");
		int rows = sc.nextInt();
		System.out.print("Enter a character : ");
		String ch = sc.next();

		for(int i = 0 ; i < rows; i++){
			for(int j = 0 ; j<=i ; j++){
				System.out.print(ch);
			}
			System.out.printf("%n");

		}
		sc.close();




	}
}