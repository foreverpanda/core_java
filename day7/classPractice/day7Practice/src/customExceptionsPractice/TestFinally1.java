package customExceptionsPractice;

public class TestFinally1 {
	
	static void testMe(String s) throws Exception {
		
		System.out.println("In tes ne");
		try {
			System.out.println("Parsed int value "+ Integer.parseInt(s));
		}
		finally {
			System.out.println("Hello");
		}
//		catch (Exception e){
//			throw new Exception("Integer not given");
			
//		}
		
		
	}
	
	
	public static void main(String[] s) {
		try {
			testMe("hello 1");
		}
		catch(Exception e) {
			System.out.println("Exception found :");
			 e.printStackTrace();
			System.out.println("In main catch all");
		}
		finally {
			System.out.println("Finally running");
		}
		System.out.println("Main over");
	}

}
