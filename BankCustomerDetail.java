package com.nit.java;

public class BankCustomerDetail {
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private double currentBalance;

	public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode,
			int customerAccountNumber, int currentBalance) {
		this.bankName = bankName;
		this.bankCustomerName = bankCustomerName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		this.customerAccountNumber = customerAccountNumber;
		this.currentBalance = currentBalance;
	}

	public void withdraw(double amount) {
		if (currentBalance <= 1000) {
			System.out.println("insufficient Balance");
		} else if ((currentBalance - amount) < 1000) {
			System.out.println("Please maintain minimum balance");
		} else {
			currentBalance = currentBalance -amount;
			System.out.println("Transction Sucsessfull");
			System.out.println("Current amount: " + currentBalance);
		}
	}

	public void deposit(double amount) {
		if (currentBalance < 1000)
			System.out.println("the minimum balance to be maintained.");
		currentBalance += amount;
		System.out.println(
				"you are trying to deposit " + amount + " rs in your account and current balance is" + currentBalance);
		System.out.println(" Deposited Successfully .");
		System.out.println("Available Balance : Rs.");
		currentBalance();
	}

	public void currentBalance() {
		System.out.println(currentBalance);
	}

	//public String displayDetails() {
	//	return this.toString();
	//}

	//@Override
	//public String toString() {
		//return "BankCustomerDetail [bankName=" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress="
			//	+ bankAddress + ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
				//+ ", currentBalance=" + currentBalance + "]";
	//}

}
