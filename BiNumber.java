package com.in28minutes.oops;

public class BiNumber {

	private int a;
	private int b;
	private int c;

	BiNumber(int a, int b){
		this.a = a;
		this.b = b;

	}

	/*
	 * public int getC() { return c; }
	 *
	 * public void setC(int c) { this.c = c; }
	 */

	/*
	 * public int getA() { return a; }
	 *
	 * public void setA(int a) { this.a = a; }
	 *
	 * public int getB() { return b; }
	 *
	 * public void setB(int b) { this.b = b; }
	 */

	public int add() {
		this.c = a + b;
		return c;
	}

	public int multiply() {
		this.c = a * b;
		return c;
	}

	public int[] doubled() {
		int c[] = { 2 * a, 2 * b };
		// private int number1 = c[0];
		// private int number2 = c[1];

		return c;

	}

}
