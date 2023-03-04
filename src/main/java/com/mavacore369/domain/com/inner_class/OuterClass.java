package com.mavacore369.domain.com.inner_class;
/*
 * Shivan MavaCore369
 *
 * In Java, an inner class is a class that is defined inside another class. Inner classes are used to group related classes together, encapsulate helper classes,
 * and provide more readable and maintainable code.

There are four types of inner classes in Java:
*
* 1. Non-static nested classes (also called inner classes): These are inner classes that are defined without the "static" keyword. They have access to the instance variables and methods of the outer class.

2. Static nested classes: These are inner classes that are defined with the "static" keyword. They do not have access to the instance variables and methods of the outer class.

3. Local classes: These are inner classes that are defined inside a method or block. They have access to the local variables and parameters of the method or block.

4. Anonymous classes: These are inner classes that are defined without a name. They are often used to implement interfaces or abstract classes.
 */
public class OuterClass {
	class InnerClass {
		public int x;
		private int y;
		protected int z;
		int w;

		public int getY() {
			return this.y;
		}

		@Override
		public String toString() {
			return "W: "+w+" X: "+x+" Y: "+y+" Z: "+z;
		}

		public void display() {
			System.out.println("Nested Class Method");
		}
	}

	public static void main(String[] args) {
		InnerClass ns = new OuterClass().new InnerClass();
		ns.w = 10;
		ns.x = 20;
		ns.y = 30;
		ns.z = 40;
		ns.display();
		System.out.println(ns);

	}

}
