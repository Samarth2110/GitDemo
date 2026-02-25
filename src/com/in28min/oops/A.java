package com.in28min.oops;

//Class A
public class A {
	void Display() {
		System.out.println("Display");
		privateDisplay();
		publicDisplay();
	}

	private void privateDisplay() {
		System.out.println("Private Display");
	}

	public void publicDisplay() {
		System.out.println("Public Display");
	}

	protected void protectedDisplay() {
		System.out.println("Protected Display");
	}
}