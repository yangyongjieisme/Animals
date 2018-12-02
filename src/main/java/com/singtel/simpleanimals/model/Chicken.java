package com.singtel.simpleanimals.model;

public class Chicken extends NonFlyingBird {

	private boolean rooster = false;

	public Chicken() {

	}

	public Chicken(boolean rooster) {
		this.rooster = rooster;
	}

	public void sing() {
		if (!rooster) {
			System.out.print("Cluck, cluck");
		} else {
			System.out.print("Cock-a-doodle-doo");
		}
	}
}
