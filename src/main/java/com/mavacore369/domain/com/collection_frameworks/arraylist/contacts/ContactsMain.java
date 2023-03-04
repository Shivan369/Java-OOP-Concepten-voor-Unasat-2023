package com.mavacore369.domain.com.collection_frameworks.arraylist.contacts;

import java.util.Scanner;

/*
 * Shivan MavaCore369
 *
 * In Java, a collection framework is a set of interfaces, classes, and algorithms that provide a way to store and manipulate groups of objects.
 * The collection framework in Java provides a standard way to manage and organize collections of objects, making it easier to work with data structures such as lists, sets, and maps.

* The collection framework includes several key interfaces, including:

* Collection: The root interface of the collection hierarchy. It defines the basic behavior of a collection, such as adding, removing, and iterating over elements.

* List: An interface that defines a collection that maintains the order of its elements, allowing for elements to be added, removed, and accessed by index.

* Set: An interface that defines a collection that does not allow duplicate elements, and may or may not maintain the order of its elements.

* Map: An interface that defines a collection that maps keys to values, allowing for efficient lookups of values based on their keys.

* The collection framework also includes several concrete classes that implement these interfaces, such as ArrayList, HashSet, and HashMap.
* In addition, there are several utility classes and algorithms that provide additional functionality for working with collections, such as Collections and Arrays.

* The benefits of using the collection framework in Java include improved code organization and maintainability, increased code reusability,
* and better performance due to the use of optimized algorithms and data structures. The collection framework provides a standardized way to work with collections of objects,
*  making it easier to write robust and efficient code.
 */

public class ContactsMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobileNo mobileNo = new MobileNo("000");

    public static void main(String[] args) {
        boolean exit = false;
        startMobile();
        printActions();
        while (!exit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    exit = true;
                    break;
                case 1:
                    mobileNo.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existContactsRecord = mobileNo.queryContacts(name);
        if (existContactsRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobileNo.removeContact(existContactsRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }

    private static void queryContact() {
        System.out.println("Enter Find contact name:");
        String findName = scanner.nextLine();
        Contacts findContacts = mobileNo.queryContacts(findName);
        if (findContacts == null) {
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Name: " + findContacts.getName() + " Mobile No: " + findContacts.getMobileNo());
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name:");
        String existName = scanner.nextLine();
        Contacts existContacts = mobileNo.queryContacts(existName);
        if (existContacts == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new mobile number:");
        String newMobile = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(newName, newMobile);
        if (mobileNo.updateContact(existContacts, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }

    }

    private static void addNewContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter mobile number:");
        String mobile = scanner.nextLine();
        Contacts newContacts = Contacts.createContacts(name, mobile);
        if (mobileNo.addNewContact(newContacts)) {
            System.out.println("New contact added: name =" + name + " , mobile = " + mobile);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");


    }

    private static void startMobile() {
        System.out.println("Starting Mobile ......");
    }
}
