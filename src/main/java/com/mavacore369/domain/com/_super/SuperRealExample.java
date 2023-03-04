package com.mavacore369.domain.com._super;

/*
* Shivan MavaCore369:
*
* In Java, a superclass is a class that is being extended by another class, which is called a subclass.
* The subclass inherits all the properties and methods of the superclass and can also add its own unique properties and methods.
*  the concept of inheritance is one of the key features of object-oriented programming,
* and it allows developers to reuse code and build on existing functionality without having to start from scratch.
* By extending a superclass, a subclass can take advantage of all the methods and variables already defined in the superclass, while also adding its own specific behavior.
To extend a superclass in Java, the "extends" keyword is used in the class declaration of the subclass, followed by the name of the superclass
* */

class PersonEx {
    int pID;
    String pName;

   public PersonEx(int pID, String pName) {
        this.pID = pID;
        this.pName = pName;
    }
}
class Emp extends PersonEx {
    private float pSalary;
    Emp(int pID, String pName, float pSalary) {
        // reusing base constructor
        super(pID, pName);
        this.pSalary = pSalary;
    }
    void display() {
        System.out.println("Employee ID: " + pID + "\nEmployee Name: " + pName + "\nEmployee Salary: " + pSalary);
    }
}

public class SuperRealExample {
    public static void main(String[] args) {
        Emp emp = new Emp(1, "Kazi", 20500);
        emp.display();
    }
}
