package com.kodnest.bean;

public class Laptop {
	String name;
	String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", colour=" + colour + "]";
	}
	public Laptop() {
		super();
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Laptop(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

}
