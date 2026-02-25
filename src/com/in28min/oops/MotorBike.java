package com.in28min.oops;

public class MotorBike {
	private int speed;

	void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}

	void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	void start(String bike) {
		System.out.println(bike + " started");
	}

	void stop(String bike) {
		System.out.println(bike + " stopped");
	}
}
