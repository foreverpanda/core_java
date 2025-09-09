package customExceptionsPractice;

import java.io.FileReader;

public class uncheckerCheckerd {
	
	static void methodA() throws Exception{
		methodB();
	}
	static void methodB() throws Exception {
		FileReader reader = new FileReader("hello.txt");
		throw new Exception("Chud gaye guru");
	}
	
	public static void main(String[] args) {
		try {
			methodA();
		}
		catch (Exception e) {
			System.out.println("Exception caught : "+ e.getStackTrace());
		}
	}
	
}
