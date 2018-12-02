package com.singtel.simpleanimals.model;

import java.awt.Color;

public class Clownfish extends Fish {

	private Color color;
	private String size;

	public Clownfish() {
		color = Color.orange;
		size = "small";

	}

	public void joke() {
		System.out.print("make joke");
	}

	public Color getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

}
