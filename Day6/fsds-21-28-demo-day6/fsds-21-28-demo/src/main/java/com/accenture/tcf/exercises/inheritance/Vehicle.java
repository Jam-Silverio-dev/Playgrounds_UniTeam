package com.accenture.tcf.exercises.inheritance;

public class Vehicle {
	private int doors;
	private int seats;
	private int wheels;
	
	
	public Vehicle() {
		System.out.println("Building a vehicle");
	}


	public Vehicle(int d, int s, int w) {
		this.doors = d;
		this.seats = s;
		this.wheels = w;
		
		System.out.println("Building a vehicle");
		System.out.println("\t\tnumber of doors = " + this.doors);
		System.out.println("\t\tnumber of seats = " + this.seats);
		System.out.println("\t\tnumber of wheels = " + this.wheels);
	}


	public int getDoors() {
		return doors;
	}


	public int getSeats() {
		return seats;
	}


	public int getWheels() {
		return wheels;
	}
	
	
	public void setDoors(int doors) {
		this.doors = doors;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public void drive() {
		System.out.println("Driving a Vehicle");
	}
	
	
	
	
	
}
