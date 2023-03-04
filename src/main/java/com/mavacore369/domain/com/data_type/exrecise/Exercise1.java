package com.mavacore369.domain.com.data_type.exrecise;
/*
*In Java, a data type is a classification of data items that indicates the kind of values they contain and the operations that can be performed on them.
* The Java programming language defines two categories of data types: primitive data types and reference data types.

Primitive data types:
Primitive data types are basic data types that are built into the Java language. They are used to represent simple values such as numbers or characters,
*   and they have no methods or functions associated with them. Java has eight primitive data types:

1. byte: 8-bit signed two's complement integer (-128 to 127)
2. short: 16-bit signed two's complement integer (-32,768 to 32,767)
3. int: 32-bit signed two's complement integer (-2,147,483,648 to 2,147,483,647)
4. long: 64-bit signed two's complement integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
5. float: 32-bit single-precision floating point number
6. double: 64-bit double-precision floating point number
7. boolean: true/false value
8. char: 16-bit Unicode character
*
Reference data types:
Reference data types, also called object types, are not built into the Java language but are instead defined by classes,
* which are the building blocks of object-oriented programming. Reference data types are used to represent more complex data structures, and they have methods and functions associated with them. Java has various built-in reference data types such as:

1. String: a sequence of characters
2. Arrays: an ordered collection of elements of the same type
3. Classes: a blueprint for creating objects that define the properties and behaviors of the object.
* */

public class Exercise1 {

	public static void main(String[] args) {
		int num;
		num = 110;
		System.out.println("Number: "+(num+10));
		num = num *2;
		System.out.println("Number * 2: "+num);
		System.out.println("Final Number: "+num);

	}

}
