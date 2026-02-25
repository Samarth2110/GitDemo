package com.in28min.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProg = new Book(100);
		Book effectiveJava = new Book(100);
		Book cleanCode = new Book(100);

		artOfComputerProg.read();
		System.out.println(artOfComputerProg.getNoCopies());

		effectiveJava.read();
		System.out.println(effectiveJava.getNoCopies());

		cleanCode.read();
		System.out.println(cleanCode.getNoCopies());

		cleanCode.setNoCopies(280);
		System.out.println(cleanCode.getNoCopies());

		artOfComputerProg.setNoCopies(300);
		System.out.println(artOfComputerProg.getNoCopies());

		effectiveJava.setNoCopies(420);
		System.out.println(effectiveJava.getNoCopies());

	}

}
