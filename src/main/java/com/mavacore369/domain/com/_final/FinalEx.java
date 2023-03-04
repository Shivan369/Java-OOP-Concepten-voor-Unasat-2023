package com.mavacore369.domain.com._final;

/**
 Shivan MavaCore369 uitleg:

 In Java, a final class is a class that cannot be extended, meaning that no other class can inherit from it. Once a class is declared final,
 it cannot be subclassed, so its functionality cannot be altered or extended by other classes.
 The purpose of making a class final is to ensure that its behavior remains consistent and cannot be changed by other developers who may be working on the same project.
 This can be particularly useful in situations where a class provides a critical piece of functionality or is part of a public API.
 To declare a class as final in Java, you simply add the "final" keyword to the class declaration, like this:
 **/
public class FinalEx {
    // final variable direct initialize
    final int NUM = 5;
    // blank final variable
    // final int CAPACITY;

    // final static variable direct initialize
    static final double PI = 3.141592;

    public static void main(String[] args) {
        int arr[] = {2,1,5,6};
        for (final int i:arr){
            System.out.println(i);
        }
    }

    /*
    *Note that while a class can be marked as final,
    * individual methods or variables within the class can still
    * be overridden or modified if they are not declared final themselves.
    *
    * */
}
