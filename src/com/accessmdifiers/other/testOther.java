package com.accessmdifiers.other;

import com.in28min.oops.A;

public class testOther extends A {
	private void test() {
		protectedDisplay();
		publicDisplay();
		privateDisplay();
		Display();
	}

}

class textDoesntExtend {
	private void test() {
		protectedDisplay();
	}
}
