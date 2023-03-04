package com.mavacore369.domain.com.constructor.date;
// A class for storing dates with a constructor method


/*
 * Shivan MavaCore369;
 *
 * In Java, a constructor is a special method that is called when an object is created. It is used to initialize the state of an object with default or user-defined values. Here are some key points about constructors in Java:

* A constructor has the same name as the class in which it is defined.
* A constructor has no return type, not even void.
* Constructors are called automatically when an object is created using the new keyword.
* If a class does not have any constructor, the compiler provides a default constructor with no arguments.
* If a class has one or more constructors, the default constructor is not provided by the compiler.
* Constructors can be overloaded to create objects with different initial values.
* Constructors can have access modifiers (public, private, protected), and this determines the visibility of the constructor outside of the class.
 */
public class DateClass {
	public int day;
	public int month;
	public int year;
	String days;
	String months;
	// Constructor
	public DateClass(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public DateClass() {}
	public DateClass setDay(String Day) {
		this.days = Day;
		return this;
	
	}
	public DateClass setMonth(String Month) {
		this.months = Month;
		return this;
		
	}
	public void displayDate() {
		System.out.println("Day:"+days+" Month: "+months);
	}
}
