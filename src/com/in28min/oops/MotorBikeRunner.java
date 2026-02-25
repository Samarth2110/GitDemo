package com.in28min.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike duke = new MotorBike();
		MotorBike yamaha = new MotorBike();

		duke.start("duke");
		yamaha.start("yamaha");

		duke.setSpeed(150);

		duke.increaseSpeed(50);
//		int dukeSpeed = duke.getSpeed();
//		dukeSpeed = dukeSpeed + 100;
//		duke.setSpeed(dukeSpeed);
		System.out.println(duke.getSpeed());

		yamaha.setSpeed(120);
		yamaha.increaseSpeed(20);
//		int yamahaSpeed = yamaha.getSpeed();
//		yamahaSpeed = yamahaSpeed + 100;
//		yamaha.setSpeed(yamahaSpeed);
		System.out.println(yamaha.getSpeed());
		System.out.println(Math.sqrt(2 + 2));
		duke.stop("duke");
		yamaha.stop("yamah");
	}

}
