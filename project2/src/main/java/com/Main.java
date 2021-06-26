package com;


import com.banking.Bank;

public class Main {
    public static void main(String[] args) {
//        System.out.println((String) null);
//        System.out.println(Boolean.valueOf(null));
//
//        Integer my1 = 45;
//        int my2 =my1;
//        System.out.println(my2);

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);

    }
}
