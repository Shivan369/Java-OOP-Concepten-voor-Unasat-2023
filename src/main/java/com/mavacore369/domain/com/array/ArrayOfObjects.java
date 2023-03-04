package com.mavacore369.domain.com.array;

import java.util.Scanner;

/*
 * Shivan MavaCore369;
 *
 * This code creates an array of objects of the Account class and initializes the objects in the array.

* The first block of code initializes the first object in the array at index 0 and sets its Name attribute to "Soeradj".
*  Then it prints out the Name attribute of the object using System.out.println(accounts[0].Name).

* The second block of code allocates memory to each object in the array by using a for loop that iterates over the array and
* initializes each object in the array using the new keyword and the Account() constructor.

* The third block of code prompts the user to enter details for each object in the array.
* It uses another for loop to iterate over the array and call the inputData() method on each object to input the data.

* The fourth block of code prints out the details of each object in the array using the displayData() method.

* Overall, this code is creating an array of Account objects and inputting and displaying data for each object in the array.
* It demonstrates how arrays can be used to manage multiple objects of the same class efficiently.
 *
 * */

public class ArrayOfObjects {

    public static void main(String[] args) {
        Account[] accounts = new Account[2];
		
		/*
		accounts[0] = new Account();
		accounts[0].Name = "Soeradj";
		System.out.println(accounts[0].Name);
		*/
        // Allocating memory to each object
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
        }
        // input data in loop
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nEnter details of " + (i + 1) + " Employee \n");
            accounts[i].inputData();
        }
        // print input data in loop
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayData();
        }
    }

}

class Account {
    int Id;
    String Name;
    int Age;
    long Salary;

    public void inputData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter Employee Id : ");
        Id = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Employee Name : ");
        Name = sc.nextLine();

        System.out.print("\n\tEnter Employee Age : ");
        Age = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());
    }

    public void displayData() {
        System.out.print("\n\t" + "ID: " + Id + " Name: " + "" + Name + " Age: " + "" + Age + " Salary: " + "" + Salary);
    }
}
