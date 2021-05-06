package com.accenture.tcf.exercises.inheritance;

public class Employee {
	private int id;
	private String ename;
	private String email;
	private int vacationDays;
	
	public Employee(int id, String ename, String email, int vacationDays) {
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.vacationDays = vacationDays;
	}
	
	public int getId() {
		return id;
	}
	public String getEname() {
		return ename;
	}
	public String getEmail() {
		return email;
	}
	public int getVacationDays() {
		return vacationDays;
	}	
	public void printDetails() {
		System.out.println("Id : " + getId() + "\n" +
							"Name : " + getEname() + "\n" +
							"Email : " + getEmail() + "\n" +
							"Vacation Days : " + getVacationDays());		
	}
	
	

}
