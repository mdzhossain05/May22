package functionPackage;

public class AdditionIntNumbers {
	
	int x;
	
	public AdditionIntNumbers(int number) {
		x = number;
	}

	public int addTwoIntNumbers(int g, int h) {
		int i = g + h + x; 
		System.out.println(x);
		return i;
	}

	public void addThreeIntNumbers(int a, int b, int c) {
		int d = a + b + c + x;
		System.out.println(x);
		System.out.println(d);
	}
	
	//addFourIntNumbers

}
