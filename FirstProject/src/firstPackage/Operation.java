package firstPackage;

public class Operation {

	public static void main(String[] args) {
		
		boolean isStateAvailable = false;
		String[] states = { "Virginia", "Washington", "Maryland", "New York", "Ohaio", "New Jersey" };

		for (int i = 0; i < states.length; i++) {

			if (states[i].equals("Maryland")) {
				isStateAvailable = true;
				break;
			} else {
				isStateAvailable = false;
			}
		}
		
		if(isStateAvailable == true) {
			System.out.println("Maryland is available");
		}else {
			System.out.println("Maryland is not available");
		}
		
		
		
		
		

	}

}
