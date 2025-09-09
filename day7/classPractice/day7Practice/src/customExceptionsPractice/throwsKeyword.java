package customExceptionsPractice;

public class throwsKeyword {
	
	static void methodA() throws Exception{
		methodB();
	}
	static void methodB() throws Exception {
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
