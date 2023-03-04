package com.mavacore369.domain.com.getter_setter;

/*
* In Java, a getter method and a setter method are methods used to access and modify the values of private fields (instance variables) in a class.

A getter method is a method used to retrieve the value of a private field. It is named with the prefix "get" followed by the name of the field, and it does not take any parameters.
* 1. A setter method is a method used to modify the value of a private field. It is named with the prefix "set" followed by the name of the field,
*  and it takes one parameter of the same type as the field.
*
* 2. Getter and setter methods are commonly used in Java to provide encapsulation, which means hiding the implementation details of a class and only exposing a public interface.
* By making fields private and providing public getter and setter methods, we can control how the fields are accessed and modified from outside the class,
* and ensure that the class is used correctly.
*
* */

public class Account {
	private String accName;
	private double accBalance;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

}
