package com.singtel.simpleanimals.model;

public class Dolphin extends NonWalkingAnimal{

	public void swim() throws Exception{
		
		Fish.class.newInstance().swim();
	}
}
