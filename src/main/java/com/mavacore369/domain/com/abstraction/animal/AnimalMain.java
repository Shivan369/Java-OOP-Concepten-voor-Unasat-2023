package com.mavacore369.domain.com.abstraction.animal;

/**
 *Shivan MavaCore369 Uitleg:
 *
 * Abstraction in Java refers to the concept of hiding implementation details and providing only essential information to the user.
 * In Java, abstraction is achieved through the use of abstract classes and interfaces.
 *
 * An abstract class is a class that cannot be instantiated and may contain one or more abstract methods,
 * which are declared but not implemented in the abstract class.
 * An abstract method is a method that does not have a body and must be implemented by any non-abstract subclass that extends the abstract class.
 * Abstract classes can also contain non-abstract methods with an implementation.
 *
 * Interfaces are similar to abstract classes in that they cannot be instantiated,
 * but they only contain abstract method signatures, without any implementation.
 * Any class that implements an interface must provide an implementation for all of the interface's methods.
 *
 * By using abstraction, Java provides a way to define a set of methods or behaviors that must be implemented by a subclass,
 * while hiding the implementation details of those methods.
 * This helps to create more modular and maintainable code, as well as enabling the creation of reusable code libraries.
 *
 */


public class AnimalMain {

	public static void main(String[] args) {
		Cow cow = new Cow("Cow");
			cow.animalEat();
			cow.animalBreathe();
			cow.animalSound();
		HummingBird hummingBird = new HummingBird("Humming Bird");
			hummingBird.animalEat();
			hummingBird.birdFly();
			hummingBird.animalBreathe();
			hummingBird.animalSound();
	}

}
