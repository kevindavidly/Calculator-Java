package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator testCalc = new Calculator(10.5,"+",5.2);
		testCalc.performOperation();
		testCalc.getResults();
	}
}
