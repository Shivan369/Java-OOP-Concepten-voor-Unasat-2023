package com.mavacore369.domain.com.autoboxing_unboxing;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MavaCore369 Bank System");
        if (bank.addBranch("MavaCore")) {
            System.out.println("@ Mava License\n");
        }
        bank.addCustomer("MavaCore", "Rewiesh", 2000);
        bank.addCustomer("MavaCore", "Abigail", 2000);
        bank.addCustomer("MavaCore", "Nila", 2000);
        bank.addCustomerTransaction("MavaCore", "Keith", 2000);
        bank.addCustomerTransaction("DSB", "Azaad", 2000);
        bank.addCustomerTransaction("Hakrinbank", "Sharonie", 2000);
        bank.customerList("MavaCore", true);


    }
}
