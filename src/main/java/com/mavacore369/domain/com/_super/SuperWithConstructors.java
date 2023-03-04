package com.mavacore369.domain.com._super;

/*
* Shivan MavaCore369:
*
* The subclass can access the properties and methods of the superclass using the "super" keyword.
* This can be useful when you need to access methods or properties that have been defined in the superclass, but have been overridden in the subclass.
* By convention, the superclass is usually listed before the subclass in the class hierarchy,
* and the hierarchy can be visualized as a tree structure, with the superclass at the top and the subclasses branching out below it.
* This tree structure is often referred to as the "inheritance tree" or "class hierarchy".
* */


class Animal {
    Animal() {
        System.out.println("Animal Class");
    }

    Animal(String name) {
        System.out.println("Animal Class "+name);
    }
}

class Birds extends Animal {
    Birds() {
        super("hello");
        System.out.println("Birds Class");
    }
}

public class SuperWithConstructors {
    public static void main(String[] args) {
        Birds birds = new Birds();

    }
}
