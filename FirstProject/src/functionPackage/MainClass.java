package functionPackage;

import functionPackageTwo.AddNumbers;

public class MainClass {

	public static void main(String[] args) {		
//		MainClass mainClass = new MainClass();
//		mainClass.addTwoIntNumbers(15, 20);
//		mainClass.addTwoIntNumbers(25, 95);
//		mainClass.addTwoIntNumbers(50, 20);
//		mainClass.addTwoIntNumbers(1000, 2000);
//		mainClass.addTwoIntNumbers(36, 63);
//		mainClass.addThreeIntNumbers(25, 25, 50);
		
//		String firstName = "myName";
//		String lastName = " yourName";
//		String name = firstName + lastName;
//		System.out.println(name);
		
		
		
		
//		AdditionIntNumbers ain = new AdditionIntNumbers();
//		int sumOfTwoNum = ain.addTwoIntNumbers(10, 20);
//		System.out.println(sumOfTwoNum);
//		
//		int sumOfTwoNum2 = ain.addTwoIntNumbers(25, 20);
//		System.out.println(sumOfTwoNum2);
//		ain.addThreeIntNumbers(10, 20, 30);
//		ain.addTwoIntNumbers(30, 50);
		
		
		// you have to create a function, which will take first name and last name
		// and it will return the full name.
		//then you have to print that full name from main class.
		
		
//		SomeOperation so = new SomeOperation();
//		boolean result = so.checkTheNumber(10, 50);
//		
//		if(result == true) {
//			System.out.println("First number is greater than second number");
//		}else {
//			System.out.println("First number is not greater than second number");
//		}
		
		
				
//		AddNumbers an = new AddNumbers();
//		an.addThreeIntNumbers(20, 30, 40);
		
		
//		AdditionDoubleNumber adn = new AdditionDoubleNumber();
//		System.out.println(adn.a);
//		adn.a = 11;
//		System.out.println(adn.a);
//		
//		AdditionDoubleNumber adn2 = new AdditionDoubleNumber();
//		System.out.println(adn2.a);
//		adn2.a = 21;
//		System.out.println(adn2.a);
//		
//		AdditionDoubleNumber adn3 = new AdditionDoubleNumber();
//		System.out.println(adn3.a);
//		adn3.a = 31;
//		System.out.println(adn3.a);
//		
//		System.out.println(adn.a);
//		System.out.println(adn2.a);
//		System.out.println(adn3.a);
		
		
		AdditionIntNumbers ain = new AdditionIntNumbers(30);
		
		System.out.println(ain.x);
		System.out.println(ain.addTwoIntNumbers(20, 40));
		ain.addThreeIntNumbers(10, 20, 30);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addTwoDoubleNumbers(double g, double h) {
		double i = g + h; // 15 + 20
		System.out.println(i);
	}

}
