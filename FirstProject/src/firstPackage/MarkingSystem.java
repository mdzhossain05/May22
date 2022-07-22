package firstPackage;

public class MarkingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// from 90 to 100 - grade is A
		// from 80 to 89 - grade is B
		// from 70 to 79 - grade is C
		// from 60 to 69 - grade is D
		// from 50 to 59 - grade is E
		// else for fail
		
		int mark = 210;
		
		if(mark >= 90 && mark <= 100) {
			System.out.println("A");
		}else if(mark >= 80 && mark <= 89) {
			System.out.println("B");
		}else if(mark >= 70 && mark <= 79) {
			System.out.println("C");
		}else if(mark >= 60 && mark <= 69) {
			System.out.println("D");
		}else if(mark >= 50 && mark <= 59) {
			System.out.println("E");
		}else if(mark >= 0 && mark <= 49){
			System.out.println("Fail"); 
		}else {
			System.out.println("Invalid Number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
