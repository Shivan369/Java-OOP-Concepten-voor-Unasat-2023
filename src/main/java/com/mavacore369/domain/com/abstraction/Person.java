package com.mavacore369.domain.com.abstraction;

/*
 * Shivan MavaCore369;
 *
 * */

public abstract class Person {
	private String name;
	private String gender;
	
	public Person(String name,String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	// create abstract method
	public abstract void work();
	
	@Override
	public String toString() {
		return "Name: "+this.name+"\nGender: "+this.gender;
	}
}
