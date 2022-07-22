package firstPackage;

public class CarPayment {

	public static void main(String[] args) {
		
		// first there is a base price -- 30000
		// admin fee -- 1000
		// tax (10%) on base price  -- basePrice * 0.1 
		// total price of the car with tax -- add all of them
		// down payment -- 5000
		// price after the down payment -- finance price -- totalPrice - downPayment
		// pay that in 60 months -- financePrice / 60	
		
		double basePrice = 30000;
		double adminFee = 1000;
		double tax = 0.1; // 10%
		double priceWithTax = basePrice * tax;
		
		System.out.println(priceWithTax);
		
		double totalPrice = basePrice + adminFee + priceWithTax;
		
		System.out.println(totalPrice);
		
		double downPayment = 5000;
		
		double financePrice = totalPrice - downPayment;
		
		System.out.println(financePrice);
		
		int creditScore = 675;
		
		double apr = 0.05; // 5/100  --- 0.05
		
		if(creditScore >= 700) {
			apr = 0.01;
		}else if (creditScore >= 650) {
			apr = 0.015;
		}
		
		
		double financePriceWithApr = financePrice * apr;
		
		System.out.println(financePriceWithApr);
		
		double finalFinancePrice = financePrice + financePriceWithApr;
		
		System.out.println(finalFinancePrice);
		
		double months = 60;
		
		double monthlyPayment = finalFinancePrice/months;
		
		System.out.println(monthlyPayment);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
