package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5); // 5 years
		System.out.println(totalValue);

	}

}

/*
 * Simple Interest Formula Total Amount = principal +
 * principal*interest*noOfYears;
 *
 */