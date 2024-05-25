package com.nit.java;

public class BankCustomerMain {

	public static void main(String[] args) {
		BankCustomerDetail obj1= new BankCustomerDetail();
	   obj1.setDetails("Central Bank of india", "Falak khan", "P.P road buxar","CBIN0350054", 345267907, 2500);
	   obj1.withdraw(1000);
	   obj1.deposit(5000);
	   obj1.currentBalance();
	 // obj1.displayDetails();
		//obj1.toString();
		

	}

}
