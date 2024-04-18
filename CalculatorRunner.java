package com.in28minutes.primitive.datatypes;

import java.util.Scanner;

public class CalculatorRunner {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter two no. - ");

	    int no1 = myObj.nextInt();  // Read user input
	    System.out.println("First no. is: " + no1);  // Output user input
	    int no2 = myObj.nextInt();  // Read user input
	    System.out.println("Second no. is: " + no2);  // Output user input


		/*
		 * int no3 = myObj.nextInt(); // Read user input
		 * System.out.println("Second no. is: " + no3); // Output user input
		 * Switch(no3){ case 1: return no1 + no2; break;
		 * 
		 * case 2: return no1 - no2; break;
		 * 
		 * case 3: return no1*no2; break;
		 * 
		 * case 4: return no1/no2; break;
		 * 
		 * default: System.out.println("Plese enter correct operation id"); break; }
		 */

	}

}

/*
 * Ask User for input:- enter two no. choose an operation add mutliply divide
 * subtract -- publishResult
 */
