package com.singtel.simpleanimals.model;

public class Parrot extends Bird{
	
	private Object near;
	
	public Parrot(Object near) {
		this.near=near;
	}

	public void sing() {
		if(near instanceof Bird) {
			((Bird) near).sing();
		}
		else {
			System.out.print("Extensible for other kind of objects");
		}
	}
}
