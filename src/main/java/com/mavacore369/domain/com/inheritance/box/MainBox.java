package com.mavacore369.domain.com.inheritance.box;

/*
*In Java, inheritance is a mechanism that allows a class to inherit properties (methods and fields) from another class.
* The class that is being inherited from is called the superclass (or parent class), and the class that is inheriting from it is called the subclass (or child class).

To inherit from a superclass in Java, we use the "extends" keyword in the class declaration of the subclass.
* In the above example, we define a superclass called "Animal" with a method called "eat". We define a subclass called "Dog" that extends the "Animal"
* class and adds a method called "bark". The "Dog" class inherits the "eat" method from the "Animal" class.

When a subclass inherits from a superclass in Java, it inherits all of the super class's public and protected fields and methods.
* It can also override the super class's methods or add new methods of its own.

Inheritance is a powerful tool in object-oriented programming because it allows us to create classes that are specialized versions of other classes.
* By reusing code from a superclass, we can reduce code duplication and create more modular and maintainable code.
*
* */

public class MainBox {

	public static void main(String[] args) {
		Box box = new Box(20, 20, 20);
		//
		BoxWeight boxWeight = new BoxWeight(10, 20, 30, 34.5);
		BoxWeight bWeight = new BoxWeight(2, 3, 4, 0.076);
		//
		ColorBox cBox = new ColorBox(5, 5, 5, 12);
		//
		double vol;
		//
		double vol2;
		//
		double vol3;
		//
		
		vol2 = box.volume();
		vol = boxWeight.volume();
		vol3 = bWeight.volume();
		
		System.out.println("Volume of Box Weight is " + vol);
		System.out.println("Volume of Box is " + vol2);
		System.out.println("Weight of mybox1 is "+boxWeight.weight);
		System.out.println("Volume of Box Weight is "+vol3);
		System.out.println("Weight of mybox1 is "+bWeight.weight);

	}

}
