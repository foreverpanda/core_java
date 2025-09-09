package customExceptionsPractice;

public class Basics {

	public static void main(String[] args) {
		int [] data = {1,2,3,4,5};
		try {
		System.out.println(data[data.length-1]);
		int a = 99;
		int b = 1;
		System.out.println(data[data.length-1]);
		
		int c = (a/b);

		System.out.println(Integer.parseInt("ss"));
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An error occured");
		} catch (ArithmeticException e) {
			System.out.println("Number format excepton");
		} catch (NumberFormatException e) {
			System.out.println("chud gayte");
		}
		System.out.println("End");
		
	}
}
