package com.mavacore369.domain.com.enum_type;

/*
* In Java, an enum (short for "enumeration") is a special data type that allows a variable to take on one of a predefined set of values.
* Enums were introduced in Java 5 and are used to represent a fixed set of constants that are related to each other.
* An enum is declared using the enum keyword, followed by the name of the enum and a list of its possible values.
* Enums can be used anywhere a constant value is needed in a program, and are often used in switch statements and to represent options in method parameters.
* Enums can also be used to provide a type-safe alternative to integer constants.
* */

public class EnumDays {
	Days days;
	public EnumDays(Days days) {
		this.days = days;
	}
	public void choseDay() {
		switch (days) {
		case SATURDAY:
			System.out.println("Saturday are better");
			break;
		case SUNDAY:
			System.out.println("Sunday are good");
			break;
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so");
			break;
			
		}
	}

	public static void main(String[] args) {
		String strDay = "FRIDAY";
		EnumDays enumDays = new EnumDays(Days.valueOf(strDay));
		enumDays.choseDay();

	}

}
