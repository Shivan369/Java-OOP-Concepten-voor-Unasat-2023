package com.mavacore369.domain.com.abstraction.static_abstract;

/*
* Shivan MavaCore369;
*
*  A static class, on the other hand, is a class that is marked with the "static" keyword, and all its members are also marked as static.
* This means that you can access the members of a static class without having to create an instance of the class.

* In Java, you cannot declare a class as both abstract and static at the same time because the two keywords are mutually exclusive.
* A class can either be abstract or static but not both.

*  However, you can have static methods and variables in an abstract class, and they can be accessed without creating an instance of the class.
*  This can be useful when you have utility methods or constants that you want to make available to other classes without the need for instantiation.
*
* Dus goed opletten can't merge together!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
*
* */

public abstract class StaticAbstract {
	static void StaticMethod() {
		System.out.println("""
    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    A class can either be abstract or static but not both.!!!!!
    Heell Goed OPletten ja Guys, niet in de waar komen
    met Abstract en Static bij het Mergen..... static kan wel gebruikt worden bij een Method in class
    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				""");
	}
}
