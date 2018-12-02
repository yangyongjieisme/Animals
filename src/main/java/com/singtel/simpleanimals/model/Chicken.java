package com.singtel.simpleanimals.model;

public class Chicken extends NonFlyingBird {

	private boolean rooster = false;
	private String lang = "en";

	public Chicken() {

	}

	public Chicken(boolean rooster) {
		this.rooster = rooster;
	}

	public Chicken(boolean rooster, String lang) {
		this.rooster = rooster;
		this.lang = lang;
	}

	public void sing() {
		if (!rooster) {
			System.out.print("Cluck, cluck");
		} else {
			if (lang.equals("en")) {
				System.out.print("Cock-a-doodle-doo");
			} else if (lang.equals("ch")) {
				System.out.print("Gu gu");
			}
		}
	}
}
