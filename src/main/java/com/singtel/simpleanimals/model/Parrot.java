package com.singtel.simpleanimals.model;

public class Parrot extends Bird{
	
	private Object near;
	
	public Parrot(Object near) {
		this.near=near;
	}

	public void say() {
		if(near instanceof Bird) {
			((Bird) near).say();
		}
		else {
			System.out.print("Extensible for other kind of objects");
		}
	}
}
