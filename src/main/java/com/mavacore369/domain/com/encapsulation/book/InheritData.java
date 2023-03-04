package com.mavacore369.domain.com.encapsulation.book;

/*
* Encapsulation in Java is a mechanism of wrapping data (variables) and code (methods) acting on that data into a single unit called a class.
* It is one of the core principles of object-oriented programming (OOP) and is often referred to as data hiding.

In Java, encapsulation is implemented using access modifiers to control access to class members (variables and methods) from outside the class.
* The access modifiers available in Java are:

Private: Class members declared as private are only accessible within the same class. They cannot be accessed from outside the class.

Protected: Class members declared as protected are accessible within the same class, as well as by subclasses of the class in the same package or in another package.

Public: Class members declared as public are accessible from anywhere in the program.

By using private access modifiers, we can hide the implementation details of a class from the outside world, and provide a controlled mechanism for accessing
*  and manipulating the data. We can provide public getter and setter methods to access and modify the data of a class. These methods are responsible for
* checking the validity of the data and enforcing any constraints or rules associated with the data.
*
* */

public class InheritData {

	public static void main(String[] args) {
		BookModel bookModel = new BookModel();
		MagazineModel model = new MagazineModel();
		Book book = new Book();
		
		// BookModel Object Data
		bookModel.setTitle("Harry Potter and the Philosopher's Stone ");
		bookModel.setAuthor("J. K. Rowling ");
		bookModel.setPrice(20);
		
		// Magazine Model Data
		model.setMagazineName("Play Boy");
		model.setMagazinePrice(230);
		//
		System.out.println("Book Title: "+bookModel.getTitle());
		System.out.println("Book Author: "+bookModel.getAuthor());
		System.out.println("Book Price: "+bookModel.getPrice());
		bookModel.bookSell(2);
		//
		System.out.println("Magazine Name: "+model.getMagazineName());
		System.out.println("Magazine Price: "+model.getMagazinePrice());
		model.magazineSell(5);
		//
		book.BookPublication(bookModel);
		book.MagazinePublication(model);

	}

}
