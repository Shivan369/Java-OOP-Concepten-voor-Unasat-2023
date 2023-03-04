package com.mavacore369.domain.com.class_example.account;
/*
* MavaCore369
 * The Account class models a bank account with a balance.
 * In Java, a class is a blueprint or template for creating objects that define the properties and behaviors of those objects.
 * A class can be thought of as a user-defined data type that encapsulates data (in the form of fields or variables) and behavior
 *  (in the form of methods or functions) that operate on that data.
 *
 * Classes in Java provide a powerful way to organize and encapsulate code, making it easier to manage and reuse code across different parts of a program.
 * Classes also support inheritance, which allows you to create new classes that inherit the properties and behaviors of existing classes,
 * and polymorphism, which allows you to use objects of different classes interchangeably in certain situations.
 */
public class Account {
	// The private instance variables
	private int accNumber;
	private double accBalance;

	// The constructors (overloaded)
	public Account(int accNumber, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}

	public Account(int accNumber) {
		this.accNumber = accNumber;
	}

	// The public getters/setters for the private instance variables.
	// No setter for accountNumber because it is not designed to be changed.
	public int getAccNumber() {
		return accNumber;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	// Add the given amount to the balance
	public void creadit(double amount) {
		accBalance += amount;
	}
	// Subtract the given amount from balance, if applicable.
	public void debit(double amount) {
		if (accBalance < amount) {
			System.out.println("amount withdrawn exceeds the current balance");
		}else {
			accBalance -= amount;
		}
	}
	// The toString() returns a string description of this instance.
	@Override
	public String toString() {
		return String.format("A/C no:%d, Balance=%.2f", accNumber,accBalance);
	}

}
