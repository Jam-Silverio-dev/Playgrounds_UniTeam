package com.accenture.bootcamp.day7.playgrounds;

public class Floor {
	private double length;
	private double width;
	
	public Floor(double length, double width) {
		this.length = (length < 0) ? 0 : length;
		this.width =  (width < 0) ? 0 : width;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	

}
