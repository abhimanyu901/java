package com.in28minutes.oops;

public class MotorBIkeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MotorBike ducati = new MotorBike();
		MotorBike ducati = new MotorBike(100); // here we are constructing an object.+
		// MotorBike honda = new MotorBike();
		MotorBike honda = new MotorBike(200);
		/*
		 * here both ducati and honda have different speed and these are called state of
		 * the object
		 */
		MotorBike sizuki = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(sizuki.getSpeed());

		ducati.start(); // start is behaviour of the class
		honda.start();

		// MotorBike.speed; //we can't do that as instance variable is refred from
		// instances/object
		// it's not a good practise to directly access the instance variable as we did
		// below
		// ducati.speed = 100; // changing state of the object
		// ducati.setSpeed(-100); // so that no one can change the value of
		// object(speed) directly from other
								// class
		// ducati.setSpeed(100);

		ducati.increaseSpeed(100); // here state are changing

		ducati.decreaseSpeed(250);

		honda.increaseSpeed(100);

		honda.decreaseSpeed(250);

		System.out.println(ducati.getSpeed());

		/*
		 * int ducatiSpeed = ducati.getSpeed();// get ducati speed ducatiSpeed += 100;//
		 * increase it by 1oo ducati.setSpeed(ducatiSpeed);// set it to ducati
		 * System.out.println(ducati.getSpeed()); // honda.speed = 80;
		 * //honda.setSpeed(80); int hondaSpeed = honda.getSpeed();// get honda speed
		 * hondaSpeed += 100;// increase it by 1oo honda.setSpeed(hondaSpeed);// set it
		 * to ducati
		 */
		System.out.println(honda.getSpeed());

		// ducati.speed = 20; // change of state of object throughout duration of the
		// program
		//ducati.setSpeed(20);
		//System.out.println(ducati.getSpeed());
		// honda.speed = 0;
		//honda.setSpeed(0);
		//System.out.println(honda.getSpeed());

	}

}
