package com.accenture.bootcamp.day6.playgrounds;

public class Employee {
	private int id;
	private String ename;
	private String email;
	private int vacationDays;
	
	
	public Employee(int id, String ename) {
		this.id = id;
		this.ename = ename;
	}
	
	
	public Employee(int id, String ename, String email, int vacationDays) {
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.vacationDays = vacationDays;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getVacationDays() {
		return vacationDays;
	}


	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	
	
	
	public void printDetails() {
		System.out.println("\nId : " + this.getId() + 
							"\nName : " + this.getEname() +
							"\nEmail : " + this.getEmail() + 
							"\nVacation Days: " + this.getVacationDays());
		
		
	}
	
	
	
	
	
	
}
