package com.in28minutes.oops;

import java.util.Scanner;

public class FanRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String make = sc.nextLine();
		Double radius = sc.nextDouble();
		String color = sc.nextLine();
		Boolean isOn = false;
		int speed = sc.nextInt();

		Fan fan = new Fan();

		fan.switchOn(isOn);
		fan.switchOff(isOn);
		fan.changeSpeed();

	}

}
