package com.mavacore369.domain.com.conditional.exercise;

import java.util.Scanner;

/*
 * Shivan MavaCore369;
 *
 * In Java, conditional statements are used to execute a block of code based on a certain condition. The most commonly used conditional statements in Java are:

* 1. if statement: It is used to execute a block of code if a condition is true.
* 2. if-else statement: It is used to execute a block of code if a condition is true and another block of code if the condition is false.
* 3. else-if statement: It is used to check multiple conditions and execute different blocks of code based on the conditions.
* 4. switch statement: It is used to execute a block of code based on multiple conditions.
 *
 * */

public class ComputeArea {

	public static void main(String[] args) {
		double area; // Declare Area
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Radius Number:");
		
		// Declare radius and Assign Value
		double radius=input.nextDouble();
		
		if(radius < 0)
		{
			// Display Message
			System.out.println("Wrong Input");
		}
		else
		{
			// Compute Area
			area=3.1416 * radius * radius;
			// Display Result
			System.out.println("Area Is: "+area);
		}

	}

}
