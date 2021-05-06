package com.accenture.tcf.exercises.inheritance;

public class Car extends Vehicle {
	private int doors;
	private int seats;
	private int wheels;
	
	public Car() {
		System.out.println("Building a Car");
	}

	public Car(int d, int s, int w) {
		super.setDoors(d);
		super.setSeats(s);
		super.setWheels(w);
		
		doors = super.getDoors();
		seats = super.getSeats();
		wheels = super.getWheels();
		
		System.out.println("Building a Car");
		System.out.println("\t\tnumber of doors = " + doors);
		System.out.println("\t\tnumber of seats = " + seats);
		System.out.println("\t\tnumber of wheels = " + wheels);
		
	}

	@Override
	public void drive() {
		System.out.println("Driving a Car");
	}
	
	

}
