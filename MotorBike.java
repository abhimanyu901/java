package com.in28minutes.oops;

public class MotorBike {
	// state
	// int speed; //here it can be directly access by other class
	// but after introducing private modifier it can't
	private int speed; // ----------------------1 (member variable) representing state of a specific
						// object

	// constructor means how will you allow the construction of motorbike
	MotorBike() { // no argument constructor (directly creating motorbike instance)
		// this.speed = 5;
		this(5); // calling other constructor through this

	}

	MotorBike(int speed) { // constructor is created //argument constructor (setting initial speed)
		this.speed = speed;
	}

	/*
	 * behaviour // method // input - int speed // outputs - void // name - setSpeed
	 * void setSpeed(int speed) {// local variable this.speed = speed; // whatever
	 * value comes into method you want to set it into @1 //
	 * System.out.println(speed); // System.out.println(this.speed); //to acess
	 * speed
	 *
	 * }
	 *
	 * int getSpeed() { // to get the speed return this.speed;
	 *
	 * }
	 */

	void start() {
		System.out.println("Bike Started");
		int hey = speed;// not always we need to this.side

	}

	// behavior
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) { // here speed is local variable
		if(speed > 0)
		 {
			// System.out.println(speed);// 100
		// System.out.println(this.speed);// 0
		     this.speed = speed;
		// this.speed = speed;
		// System.out.println(speed);//100
		// System.out.println(this.speed);//100
		}
	}

	public void increaseSpeed(int howMuch) {
		//this.speed = this.speed + howMuch;
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
	/*	if (this.speed - howMuch > 0) {
			this.speed = this.speed - howMuch;    */
		setSpeed(this.speed - howMuch);
		}
	}


