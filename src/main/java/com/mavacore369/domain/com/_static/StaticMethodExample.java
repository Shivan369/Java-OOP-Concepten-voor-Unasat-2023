package com.mavacore369.domain.com._static;

/**
 * Shivan MavaCore369:
 * Static variables and methods belong to the class itself rather than to any particular instance of the class.
 * This means that they are shared among all instances of the class and can be accessed directly through the class name, without the need to create an object of that class.
 */

public class StaticMethodExample {

	public static void main(String[] args) {
		int result = Utitlity.add(25, 25);
		System.out.println("Result: "+result);
		
		double divided = Utitlity.divided(10, 5);
		System.out.println("Divided: "+divided); 
		
	}

}
class Utitlity{
	public static int add(int first,int second) {
		return first + second;
	}
	public static double divided(double first, double second) {
		return first / second;
	}
}
