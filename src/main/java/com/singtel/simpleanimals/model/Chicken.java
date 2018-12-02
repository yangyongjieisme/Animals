package com.singtel.simpleanimals.model;

public class Chicken extends Bird{
	
	private boolean rooster=false;
	
	public Chicken(){
		
	}
	public Chicken(boolean rooster) {
		this.rooster=rooster;
	}

	public boolean canFly() {
		return false;
		
	}
	
	public void say() {
		if(!rooster) {
			System.out.print("Cluck, cluck");
		}else {
			System.out.print("Cock-a-doodle-doo");
		}
	}
}
