package com.accenture.bootcamp.day7.playgrounds;

public class Point {
	private int x, y;
	
	public Point() {
		//Empty constructor
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		double distance_sqrd = Math.pow(this.x, 2) + Math.pow(this.y, 2);
		double distance = Math.sqrt(distance_sqrd);
		return distance;
	}
	
	public double distance(int x, int y) {
		//it needs to return the distance between this Point and Point x,y as double.
		double distance_sqrd = Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2);
		double distance = Math.sqrt(distance_sqrd);
		return distance;
	}

	public double distance(Point point) {
		//it needs to return the distance between this Point and another Point as double.
		double distance = point.distance(x, y);
		return distance;
	}
	
}
