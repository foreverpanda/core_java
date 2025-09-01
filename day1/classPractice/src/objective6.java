import java.util.Scanner;
class PrintOddNumbersInRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start : ");
		int start = sc.nextInt();
		System.out.print("Enter End : ");
		int end = sc.nextInt();
		
		for(int i = start ; i<= end ; i++){
			if(i%2 == 1){
				System.out.println(i);
			}
		}


		sc.close();
	}
}