package com.mavacore369.domain.com.exception_handle;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of the program's instructions.
* An exception can occur for many reasons, such as a division by zero, an attempt to access a null object, or an I/O error.

Exception handling is the mechanism in Java that allows us to handle these exceptions in a graceful manner, instead of crashing the program.
* When an exception occurs, Java creates an object of the appropriate exception class and "throws" it, which means it is passed up the call stack until it is caught by an exception handler.

In Java, there are two types of exceptions: checked exceptions and unchecked exceptions. Checked exceptions are exceptions that must be caught or declared in the method signature,
*  while unchecked exceptions (also known as runtime exceptions) do not need to be caught or declared.

To handle an exception in Java, we use a try-catch block. The try block contains the code that may throw an exception, and the catch block contains
* the code that will handle the exception if it is thrown.
*
* */

public class ExceptionHandle {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month:");
		try {
			
			int month = sc.nextInt();
			System.out.println(months[month]);
		}
		catch (IndexOutOfBoundsException index) {
			System.out.println("Index is out of bounds");
		}
		catch (InputMismatchException mismatch) {
			System.out.println("Input mismatch");
		}
		sc.close();
	}

}
