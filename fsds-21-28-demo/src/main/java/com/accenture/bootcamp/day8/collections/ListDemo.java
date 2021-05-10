package com.accenture.bootcamp.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.accenture.bootcamp.day6.Employee;


public class ListDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(100, "John Sith", 25));
		empList.add(new Employee(300, "Mae Jones", 35));
		empList.add(new Employee(205, "Ralph Smith", 20));
		empList.add(new Employee(300, "Zae Jones", 35));
		empList.add(new Employee(205, "Abi SMith", 20));
		empList.add(new Employee(300, "Zae Jones", 35));

		//printed in the order they are added
		System.out.println("Before sorting..");
		empList.forEach( (employee) -> {
			System.out.println(employee);
		});
		
		Collections.sort(empList);
		
		System.out.println("After sorting..");
		//printed in the order they are added
		empList.forEach((employee) -> {
			System.out.println(employee);
		});
		
		
		empList.forEach((employee) -> {
			System.out.println(employee);
		});
		
	}
	
	//Comparable and Comparator - Sort by data column
	//Comparable if accessing within same package
	
	//Comparator if accessing outside package
	
	

}
