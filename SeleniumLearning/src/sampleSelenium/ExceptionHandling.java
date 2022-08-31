package sampleSelenium;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		final int b = 10;
		
		System.out.println("doing addition");
		
		try {
		int a = 10/0;
		System.out.println(a);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
		}
		
		
		System.out.println("after addition");
		
		
	}

}
