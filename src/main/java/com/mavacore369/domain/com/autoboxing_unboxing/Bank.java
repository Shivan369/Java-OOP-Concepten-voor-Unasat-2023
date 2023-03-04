package com.mavacore369.domain.com.autoboxing_unboxing;

import java.util.ArrayList;
/*
 * Shivan MavaCore369;
 *
 * Autoboxing and unboxing are features in Java that allow automatic conversion between primitive data types and their corresponding wrapper classes (also known as boxed types).

* Autoboxing is the process of automatically converting a primitive data type (such as int, double, or boolean)
* into its corresponding wrapper class (such as Integer, Double, or Boolean). This happens automatically when the primitive value is used in a context that
* requires a boxed type, such as when passing a parameter to a method that expects an object reference.
*
* Youtube Link : https://www.youtube.com/watch?v=thqLx4zUeY0
 * Jullie moeten effe chekken als we dit ook moeten kennen voor de tentamen!!!!!!!!!!!!!!!!!!!!
 * */

public class Bank {
    private String bankName;
    private ArrayList<Branches> branchesList;

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branches> getBranchesList() {
        return branchesList;
    }

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchesList = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branchesList.add(new Branches(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            return branches.addNewCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            return branches.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branches findBranch(String branchName) {
        for (int i = 0; i < branchesList.size(); i++) {
            Branches checkBranch = branchesList.get(i);
            if (checkBranch.getBranchName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    public boolean customerList(String branchName, boolean showTransactions) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            System.out.println("Customer Details for Branch: " + branches.getBranchName());
            ArrayList<Customers> branchesCustomersList = branches.getCustomersList();
            for (int i = 0; i < branchesCustomersList.size(); i++) {
                Customers branchesCustomers = branchesCustomersList.get(i);
                System.out.println("Customer: " + branchesCustomers.getCustomerName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactionList = branchesCustomers.getTransection();
                    for (int j = 0; j < transactionList.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount" + transactionList.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
