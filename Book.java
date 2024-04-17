package com.in28minutes.oops;

public class Book {

	// int noOfCopies;
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	int getCopies() {
		return noOfCopies;
	}

	void setCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}


	void read() {
		System.out.println("Start reading book");
	}

	void increaseCopies(int howMuch) {
		setCopies(this.noOfCopies + howMuch);
	}

	void decreaseCopies(int howMuch) {
		setCopies(this.noOfCopies - howMuch);
	}

}
