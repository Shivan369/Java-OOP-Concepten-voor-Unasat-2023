package com.mavacore369.domain.com._static;

/**
 * Shivan MavaCore369 uitleg:
 *
 *In Java, the keyword "static" is used to create class-level variables and methods that can be accessed without having to create an instance of the class.
 *For example, if you had a *static* variable called "count" in a class called "Person"
 */
public class Person{
		public static int InstanceCount;
		public int LocalCount;
		
		public Person() {
			InstanceCount++;
			LocalCount++;
		}
		
}
