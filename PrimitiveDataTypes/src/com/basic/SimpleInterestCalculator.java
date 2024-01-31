package com.basic;
import java.math.BigDecimal;
public class SimpleInterestCalculator {
	
	private BigDecimal interest;
	private BigDecimal principal;
	
	SimpleInterestCalculator(String principal, String interest){
		this.interest = new BigDecimal(interest);
		this.principal = new BigDecimal(principal);
	}

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		
		System.out.println(totalValue);
	}
	
	BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal mulVal = this.principal.multiply(this.interest.multiply(new BigDecimal(noOfYears)));
		BigDecimal returnValue = mulVal.divide(new BigDecimal("100"));
		returnValue = returnValue.add(this.principal);
		//System.out.println(this.interest);
		return returnValue;
	}

}
