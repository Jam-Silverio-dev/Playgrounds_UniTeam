package com.accenture.tcf.exercises.inheritance;

public class Theater extends Building {
	private int length;
	private int width = 12;
	private int area;
	
	public Theater(int length) {
		super();
		this.length = length;
	}

	@Override
	public void showArea() {
		this.area = this.length * this.width;
		System.out.println("Theater area : " + this.area);
		
	}

	@Override
	public void showEvents() {
		System.out.println("Events ready to be hosted !!");
		
	}
	
	
	
	

}
