package com.singtel.simpleanimals.model;

import java.awt.Color;

public class Shark extends Fish{
	
	private Color color;
	private String size;
	
	public Shark() {
		color=Color.gray;
		size="large";
		
	}
	public void eat(Fish f) {
		System.out.print("eat other fish "+f);
	}
	public Color getColor() {
		return color;
	}
	
	public String getSize() {
		return size;
	}
	
	
}
