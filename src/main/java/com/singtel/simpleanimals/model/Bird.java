package com.singtel.simpleanimals.model;

class Bird extends Animal {
	
	
	void fly() {
		System.out.println("I am flying");
	}
	public void sing() {
		
		System.out.print("Bird Singing");
	}
	
	public boolean canFly() {
		return true;
		
	}
}
