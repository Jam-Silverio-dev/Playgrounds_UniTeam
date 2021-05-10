package com.accenture.bootcamp.day8.collections;

import java.util.Comparator;

import com.accenture.bootcamp.day6.Employee;

public class EmployeeSorter implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//change your return statement for different sorting needs
//		return o1.getId() - o2.getId();
//		return o1.getName().compareTo(o2.getName());
		int result = o1.getName().compareTo(o2.getName());
		if (result == 0) {
			return o1.getAge() - o2.getAge();
		} else {
			return result;
		}
	}

}
