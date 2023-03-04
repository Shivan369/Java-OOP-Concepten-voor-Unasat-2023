package com.mavacore369.domain.com.abstraction;

/*
 * Shivan MavaCore369;
 *
 * */

public class PersonMain extends Person{
	private int empID;

	public PersonMain(String name, String gender,int empID) {
		super(name, gender);
		this.empID = empID;
	}

	public static void main(String[] args) {
		PersonMain person1 = new PersonMain("Azaad", "Female", 1);
		PersonMain person2 = new PersonMain("Aryan", "Bi-Female", 0);

		person1.work();
		System.out.println(person1);
		person2.work();
		System.out.println(person2);

	}

	@Override
	public void work() {
		if (empID == 0) {
			System.out.println("\nNot working");
		}else {
			System.out.println("\nWorking as employee!!");
		}
		
	}

}
