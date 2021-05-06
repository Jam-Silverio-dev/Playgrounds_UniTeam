package com.accenture.tcf.exercises.inheritance;

public class Parking {
	
	public static void main(String[] args) {
		Vehicle nVehicle = new Vehicle(0, 0, 0);
		nVehicle.drive();
		
//		System.out.println("Building a Vehicle"); //Ghosting
		
		Car nCar = new Car(4, 5, 4);
		nCar.drive();

	}


}
