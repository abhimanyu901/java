package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	// other than java.lang you need to import evrything

	private BigDecimal principal;
	private BigDecimal interest;
	private BigDecimal totalSum;

	public BigDecimal getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(BigDecimal totalSum) {
		this.totalSum = totalSum;
	}

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// this.totalSum = totalSum;
		/*
		 * totalSum = principal.multiply(interest); totalSum = totalSum.multiply(new
		 * BigDecimal(noOfYears)); totalSum = totalSum.add(principal);
		 */
		BigDecimal totalSum = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));

		return totalSum;
	}


}
