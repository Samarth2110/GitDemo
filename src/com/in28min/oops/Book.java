package com.in28min.oops;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void setNoCopies(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	int getNoCopies() {
		return this.noOfCopies;
	}

	void read() {
		System.out.println("Reading...");
	}
}
