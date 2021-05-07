package com.accenture.bootcamp.day7.playgrounds;

public class Cylinder extends Circle {
	private double height;
	private double Area;
	
	public Cylinder(double radius, double height) {
		super(radius);
		if(height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	public double getVolume() {
		return this.getArea() * this.getHeight();
	}

	
	
}
