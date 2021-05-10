package com.accenture.bootcamp.day7.shoppingcart;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ShoppingCartMain {

	public static void main(String[] args) {

		System.out.println("****************WELCOME TO POWER PC****************");
		System.out.print("Dear Customer, please input your name >> ");
		Scanner sc = new Scanner(System.in);
		String customerName = sc.next();
		Customer customer = new Customer(customerName);
		
		LocalTime startOfShift = LocalTime.of(8,00);//8:00
		LocalTime endOfShift = LocalTime.of(18,00);//18:00
		Cashier cashier = new Cashier("John", startOfShift, endOfShift);
		LocalDate localdate = LocalDate.of(2020, 4, 7);
//		String date = localdate.toString();	//getDate()
		
		Store store = new Store(customer, cashier);
		store.shop();
	}

}
